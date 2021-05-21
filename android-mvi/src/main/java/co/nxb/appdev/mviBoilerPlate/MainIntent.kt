package co.nxb.appdev.mviBoilerPlate

import co.nxb.appdev.mviBoilerPlate.app.arch.IIntent

sealed class MainIntent : IIntent {
    object RefreshUsers : MainIntent()
    object FetchUsers : MainIntent()
    object RemoveUsers : MainIntent()
    object SearchUsers : MainIntent()
}

