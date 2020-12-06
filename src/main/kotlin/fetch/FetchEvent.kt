package fetch

import event.data.Event
import kotlinx.browser.window

fun fetchRandomEvent(personId: Int): Event {
    return window.fetch("http://localhost:8080/v1/person/$personId/randomEvent")
        .unsafeCast<Event>()
}


