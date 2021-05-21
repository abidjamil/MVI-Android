package co.nxb.appdev.mviBoilerPlate.networkinterface

import co.nxb.appdev.mviBoilerPlate.data.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {
    @GET("users")
    suspend fun getUser(): List<User>
}