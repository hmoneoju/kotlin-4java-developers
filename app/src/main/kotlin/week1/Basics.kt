package week1

fun listToStr(elem:List<String>): String = elem.joinToString(
    separator = "", prefix = "(", postfix = ")")

fun displaySeparator(character: Char='*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun runDisplaySeparator() {
    displaySeparator()
    displaySeparator('!')
    displaySeparator('#', 5)
    displaySeparator(size = 3)
}
