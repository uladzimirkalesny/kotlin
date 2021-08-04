package by.learning.kotlin.basic.nullable

fun main() {
    var stringValue: String = "Cannot be null"
//    stringValue = null

    var nullableValue: String? = "Can be null"
    nullableValue = null
    // safe call
    println(nullableValue?.length)

    // elvis operator ?: - if-else
    val value = nullableValue?.length ?: -1
    println(value)

    // !! - throw NPE if nullable-variable
    nullableValue = if ((0..10).random() > 5) "test" else null
    println(nullableValue!!.length)

}