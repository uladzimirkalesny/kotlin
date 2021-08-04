package by.learning.kotlin.basic.loops

fun main() {

    // for each
    println("===For Loop===")
    val numbers: List<String> = listOf("1", "2", "3") // Immutable
    val colors: List<String> = mutableListOf("orange", "blue", "red") // Mutable

    for (number in numbers)
        println(number)

    // while
    println("===While Loop===")
    var index = 0
    while (index < colors.size) {
        println("While Loop : ${colors[index]}")
        index++
    }

    // range
    println("===Range===")
    val intRange = 1..5
    println(3 in intRange)

    for (i in intRange)
        println(i)

    for (i in 1 until 5)
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 1..100 step 10)
        println(i)

    // when expression
    testWhen("Test")
    testWhen(1)
    testWhen(12)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("Number")
        is String -> println("String")
        in 10..20 -> println("Range")
        else -> println("Something else")
    }
}