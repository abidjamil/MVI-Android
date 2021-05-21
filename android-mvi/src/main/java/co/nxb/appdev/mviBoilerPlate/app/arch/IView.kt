package co.nxb.appdev.mviBoilerPlate.app.arch

interface IView<S: IState> {
    fun render(state: S)
}