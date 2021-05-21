package co.nxb.appdev.mviBoilerPlate.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import co.nxb.appdev.mviBoilerPlate.MainIntent
import co.nxb.appdev.mviBoilerPlate.MainState
import co.nxb.appdev.mviBoilerPlate.adapter.ItemAdapter
import co.nxb.appdev.mviBoilerPlate.app.arch.IView
import co.nxb.appdev.mviBoilerPlate.databinding.ActivityMainBinding
import co.nxb.appdev.mviBoilerPlate.viewmodel.MainViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(), IView<MainState> {

    private val mAdapter = ItemAdapter()
    private val mViewModel by viewModel<MainViewModel>()
    private lateinit var binding:ActivityMainBinding
    @SuppressLint("StaticFieldLeak")
    companion object{
        lateinit var context: Context
        @NonNull
        fun getStartIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        context=this
        binding.recyclerView.adapter = mAdapter

        // Observing the state
        mViewModel.state.observe(this, {
            render(it)
        })

        // Fetching data when the application launched
        lifecycleScope.launch {
            mViewModel.intents.send(MainIntent.FetchUsers)
        }

        // Refresh data
        binding.btnRefresh.setOnClickListener {
            lifecycleScope.launch {
                mViewModel.intents.send(MainIntent.RefreshUsers)
            }
        }
        binding.btnReset.setOnClickListener {
            lifecycleScope.launch {
                mViewModel.intents.send(MainIntent.RemoveUsers)
            }
        }
        binding.searchViewQuery.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    Log.i("onQueryTextSubmit", query)
                }
                lifecycleScope.launch {
                mViewModel.query.value = query
                mViewModel.intents.send(MainIntent.SearchUsers)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if(newText.equals("")){
                    lifecycleScope.launch {
                        mViewModel.query.value = newText
                        mViewModel.intents.send(MainIntent.SearchUsers)
                    }
                }
                return true
            }

        })
    }

    override fun render(state: MainState) {
        with(state) {
            binding.progressBar.isVisible = isLoading
            binding.btnRefresh.isEnabled = !isLoading
            mAdapter.submitList(users)

            if (errorMessage != null) {
                Toast.makeText(this@MainActivity, errorMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

