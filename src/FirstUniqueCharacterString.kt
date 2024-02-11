fun main() {
    println(firstUniqueCharacterString("hellohe"))
}

private fun firstUniqueCharacterString(word: String): Int {
    val letterA = 97
    val alphabet = List(26) { 0 }.toMutableList()

    word.forEach { alphabet[it.code - letterA]++ }
    word.forEachIndexed { index, letter ->
        if (alphabet[letter.code - letterA] == 1) return index
    }

    return -1
}