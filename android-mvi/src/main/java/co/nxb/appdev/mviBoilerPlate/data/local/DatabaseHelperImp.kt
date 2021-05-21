package co.nxb.appdev.mviBoilerPlate.data.local

import co.nxb.appdev.mviBoilerPlate.data.model.User
import co.nxb.appdev.mviBoilerPlate.data.model.UserDao
import co.nxb.appdev.mviBoilerPlate.data.repoistory.LocalRepo


class DatabaseHelperImpl(private val appDatabase: LocalRepo) : DatabaseHelper {

    override suspend fun getUsers(): List<User> = appDatabase.userDao().getAll()


}