fun main() {
    val data = mutableListOf(0,1,5,0,72,0)

    println(moveZeros(data))
}

private fun moveZeros(numbers: MutableList<Int>): List<Int> {
    var lastZero = 0

    for ((index, number) in numbers.withIndex()) {
        if (number != 0) {
            val swap = numbers[lastZero]
            numbers[lastZero++] = number
            numbers[index] = swap
        }
    }

    return numbers.toList()
}
