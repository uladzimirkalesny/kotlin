package by.learning.kotlin.basic.lambdas

fun main() {

    val list = listOf("asd", "zxcv", "qwert")
    list.forEach { value -> println(value) }
    list.filter { value -> value.length < 4 }.forEach { value -> println(value) }
    println(list.reduce { sum, value -> sum + value.length })

    list.sortedByDescending { it }.forEach { value -> println(value) }
    list.any { it.length > 2 }
    list.all { it.length < 10 }

    val map = list.groupBy { it.length } // HashMap
    println(map)

    val upperList: List<String> = list.map { value -> value.uppercase() }
    upperList.forEach { value -> println(value) }

    val (positiveList, negativeList) = listOf(1, 2, 3, -12).partition { it > 0 }
    println(positiveList)
    println(negativeList)

}