package co.nxb.appdev.mviBoilerPlate.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomWarnings

@Entity
data class UserDao(
    @PrimaryKey(autoGenerate = true)
    val id : Int,

    @ColumnInfo(name = "avatar_url")
    val avatar_url: String,

    @ColumnInfo(name = "login")
    val login: String
)