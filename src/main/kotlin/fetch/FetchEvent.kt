package fetch

import kotlinx.browser.window

fun fetchRandomEvent(personId: Int): String =
    window.fetch("http://localhost:8080/v1/person/$personId/randomEvent")
        .unsafeCast<String>()