package by.learning.kotlin.basic.oop

data class Rectangle(var height: Int, var length: Int) {
    var perimeter = (height + length) * 2

    var numericField: Int = 1
        get() = field + 1 //field = this
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}

fun main() {
    val rectangle1 = Rectangle(5, 2)
    println(rectangle1.perimeter)

    val rectangle2 = Rectangle(5, 2)
    println(rectangle1 == rectangle2)

    println(rectangle2.area())
}