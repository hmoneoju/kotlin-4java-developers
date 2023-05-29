package week1

import week1.Color.*
import javax.xml.stream.events.Characters

enum class Color {
    BLUE, ORANGE, GREEN;
}

fun getDescription(color: Color) : String =
    when(color) {
        BLUE -> "Blue"
        ORANGE -> "Orange"
        GREEN -> "Green"
    }

fun mix(first: Color, second: Color ) =
    when (setOf(first, second)) {
        setOf(BLUE, ORANGE) -> GREEN
        setOf(ORANGE, GREEN) -> BLUE
        else -> throw Exception("Unknown mix")
    }

fun isDigit (c: Char) = c in '0'..'9'
fun isNotDigit (c: Char) = c !in '0'..'9'
fun elementContained (element: String, list: List<String>) = element in list

fun isValidIdentifier(s: String): Boolean {
    fun isValidLetter( c: Char) = c == '_' || c.isLetterOrDigit()
    if (s.isEmpty() || s[0] in '0'..'9') return false
    for (char in s)
        if (!isValidLetter(char)) return false
    return true
}


/*

fun forLoop(elements:List<String>) : Void
for ((index, element) in elements.withIndex()) {
    print("$index=$element")
}

fun mapSample () {
val map = mapOf(
    1 to "one",
    2 to "two"
)

for ((key, value) in map) {
    println("$key = $value")
}
}
 */
