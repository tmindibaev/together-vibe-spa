import kotlinx.css.Align
import kotlinx.css.Color
import kotlinx.css.Cursor
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.LinearDimension
import kotlinx.css.alignSelf
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.borderWidth
import kotlinx.css.cursor
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.left
import kotlinx.css.marginBottom
import kotlinx.css.marginTop
import kotlinx.css.minWidth
import kotlinx.css.padding
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.px
import kotlinx.css.right
import kotlinx.css.top
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
                    borderRadius = LinearDimension("15px")
                    fontSize = LinearDimension("20px")
                    height = LinearDimension("30px")
                    width = LinearDimension("600px")
                    marginBottom = 20.px
                }
            }
            styledButton {
                +"I feel lucky"
                css {
                    borderRadius = LinearDimension("7px")
                    backgroundColor = Color.lightGray
                    borderWidth = LinearDimension("1px")
                    height = LinearDimension("30px")
                    width = LinearDimension("150px")
                    fontSize = LinearDimension("16px")
                    paddingLeft = LinearDimension("16px")
                    paddingRight = LinearDimension("16px")
                    cursor = Cursor.pointer
                }
            }
        }
    }
}
