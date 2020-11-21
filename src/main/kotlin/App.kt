import kotlinx.css.Align
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.LinearDimension
import kotlinx.css.alignSelf
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.marginBottom
import kotlinx.css.marginTop
import kotlinx.css.px
import kotlinx.css.width
import kotlinx.html.InputType
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1
import styled.css
import styled.styledButton
import styled.styledDiv
import styled.styledInput

external interface AppState : RState {
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
            styledInput(type = InputType.text, name = "activityText") {
                css {
                    backgroundColor = Color.whiteSmoke
                    borderRadius = LinearDimension("7px")
                    fontSize = LinearDimension("20px")
                    height = LinearDimension("30px")
                    width = LinearDimension("300px")
                    marginBottom = 20.px
                }
            }
            styledButton {
                +"I feel lucky"
                css {
                    borderRadius = LinearDimension("7px")
                    backgroundColor = Color.lightGray
                    height = LinearDimension("30px")
                    width = LinearDimension("100px")
                    fontSize = LinearDimension("16px")
                }
            }
        }
    }
}
