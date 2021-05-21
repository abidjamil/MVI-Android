package co.nxb.appdev.mviBoilerPlate.states

import co.nxb.appdev.mviBoilerPlate.app.arch.IState
import co.nxb.appdev.mviBoilerPlate.data.model.User

data class MainState(
    val users: List<User>? = listOf(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
) : IState