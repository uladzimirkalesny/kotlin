package by.learning.kotlin.basic.functions

fun main() {
    println("sum(1, 2) = ${sum(1, 2)}")
    println(stringDescription(2))
    println(namedArguments(value3 = 123, value1 = 1, value2 = 412))
    println(defaultArguments(1, 2))
    println(defaultArguments())
    println(foo("Uladzimir"))
    printVararg(1, 2, 3, 4, 5, 6)
    printVararg(*intArrayOf(99, 91))
}

fun sum(value1: Int, value2: Int): Int = value1 + value2

fun stringDescription(value: Int): String {
    return "Description of value : $value"
}

fun namedArguments(value1: Int, value2: Int, value3: Int): List<Int> = listOf(value1, value2, value3)

fun defaultArguments(x: Int = 2, y: Int = 3) = (x + y)

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.uppercase() else name) + number
}

fun printVararg(vararg args: Int) = args.forEach { arg -> println(arg) }