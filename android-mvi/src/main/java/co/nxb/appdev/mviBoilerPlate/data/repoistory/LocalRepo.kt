package co.nxb.appdev.mviBoilerPlate.data.repoistory

import androidx.room.Database
import androidx.room.RoomDatabase
import co.nxb.appdev.mviBoilerPlate.data.local.DAOInterface
import co.nxb.appdev.mviBoilerPlate.data.model.User
import co.nxb.appdev.mviBoilerPlate.data.model.UserDao

@Database(entities = [User::class], version = 1)
abstract class LocalRepo : RoomDatabase() {
    abstract fun userDao(): DAOInterface
}