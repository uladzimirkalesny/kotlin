package by.learning.kotlin.basic.oop

class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created : $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    constructor() : this("", "", -1)

    override fun toString(): String {
        return "Person :\n" +
                "name - $firstName\n" +
                "lastname - $lastName\n" +
                "age - $age\n" +
                "children - $children\n"
    }
}

fun main() {
    val uladzimir = Person("Uladzimir", "Kalesny", 29)
    println(uladzimir)

    val child = Person("name", "lastname", 1)
    val parent = Person("pName", "pLastName", 22, child)
    println(parent)
}