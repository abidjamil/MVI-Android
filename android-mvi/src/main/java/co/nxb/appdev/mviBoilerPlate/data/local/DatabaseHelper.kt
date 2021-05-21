package co.nxb.appdev.mviBoilerPlate.data.local

import co.nxb.appdev.mviBoilerPlate.data.model.User
import co.nxb.appdev.mviBoilerPlate.data.model.UserDao


interface DatabaseHelper {

    suspend fun getUsers(): List<User>

}