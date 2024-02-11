fun main() {
    var a = 0
    var b = 1

    (0..10).forEach { _ ->
        val sum = a + b
        b = a
        a = sum
        println(b)
    }
}