import kotlin.math.abs

fun main() {
    println(twoSum(22, listOf(2,11,15,7)))
}

private fun twoSum(target: Int, numbers: List<Int>): List<Int?> {
    val control = mutableMapOf<Int, Int>()

    for ((index, number) in numbers.withIndex()) {
        val numberWeNeed = abs(number - target)

        if (control.contains(numberWeNeed))
            return listOf(control[numberWeNeed], index)


        control[number] = index
    }

    return listOf()
}