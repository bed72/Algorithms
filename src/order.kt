fun main() {
    val numbers = mutableListOf(0, 10, 4, 6, 3, 1)
    val response = mutableListOf<Int>()


    for (number in numbers) {
        var index = 0
        while (index < response.size && response[index] < number) index++

        response.add(index, number)
    }

    println(response)
}