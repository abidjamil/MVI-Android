package co.nxb.appdev.mviBoilerPlate.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import co.nxb.appdev.mviBoilerPlate.data.model.User
import co.nxb.appdev.mviBoilerPlate.data.model.UserDao

@Dao
interface DAOInterface {
    @Query("SELECT * FROM User")
    fun getAll(): List<User>

    @Insert
    fun insertAll(users: List<User>)

    @Delete
    fun delete(user: User)
}
