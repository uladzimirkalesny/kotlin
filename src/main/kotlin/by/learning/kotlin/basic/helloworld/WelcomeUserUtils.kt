package by.learning.kotlin.basic.helloworld

class WelcomeUserUtils {

    fun welcomeUserByName(name: String) {
        print("Welcome $name")
    }

}

fun main() {

    val instance = WelcomeUserUtils()
    instance.welcomeUserByName("Uladzimir")

}