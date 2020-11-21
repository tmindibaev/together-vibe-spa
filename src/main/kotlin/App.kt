import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

external interface AppState : RState {
}

class App : RComponent<RProps, AppState>() {

    override fun RBuilder.render() {
        h1 {
            +"This is Together Vibe SPA"
        }
    }
}
