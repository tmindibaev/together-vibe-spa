import fetch.fetchRandomEvent
import kotlinx.browser.document
import kotlinx.css.Color
import kotlinx.css.Cursor
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.LinearDimension
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.borderWidth
import kotlinx.css.cursor
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.marginBottom
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.px
import kotlinx.css.width
import kotlinx.html.InputType
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1
import react.dom.h2
import react.setState
import styled.css
import styled.styledButton
import styled.styledDiv
import styled.styledInput
import kotlin.random.Random

external interface AppState : RState {
    var currentEvent: String?
}

class App : RComponent<RProps, AppState>() {

    override fun RBuilder.render() {
        h1 {
            +"This is Together Vibe SPA"
        }
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
                marginBottom = 20.px
            }
            h2 {
                +"Чем займёмся сегодня?"
            }
            styledInput(type = InputType.text, name = "activityText") {
                css {
                    backgroundColor = Color.whiteSmoke
                    borderRadius = LinearDimension("7px")
                    fontSize = LinearDimension("20px")
                    height = LinearDimension("30px")
                    width = LinearDimension("600px")
                    marginBottom = 20.px
                }
                attrs {
                    onClickFunction = {
                        document.getElementById("activityText")?.nodeValue = state.currentEvent
                    }
                }
            }
            styledButton {
                +"I feel lucky"
                css {
                    borderRadius = LinearDimension("15px")
                    backgroundColor = Color.lightGray
                    borderWidth = LinearDimension("0px")
                    height = LinearDimension("30px")
                    width = LinearDimension("150px")
                    fontSize = LinearDimension("16px")
                    paddingLeft = LinearDimension("16px")
                    paddingRight = LinearDimension("16px")
                    cursor = Cursor.pointer
                }
                attrs {
                    onClickFunction = {
                        state.currentEvent =
                            fetchRandomEvent(Random.nextInt(1000))
                    }
                }
            }
        }
    }
}
