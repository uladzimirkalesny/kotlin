package by.learning.kotlin.basic.variables

fun main() {

    val const: String = "This is constant"
    println(const)
//    const = "val-variable cannot be reassigned !!!!"

    var data: String = "Test data"
    data = "Updated data"
    println(data)

    println("$data!")
    println("3 + 4 = ${3 + 4}")

}