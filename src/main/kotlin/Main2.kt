import kotlin.properties.Delegates

fun main(args: Array<String>) {

    val lazy: String by lazy {
        "Hello, Kotlin!"
    }

    println(lazy)

    val user = User()
    user.name = "Kotlin"
    user.name = "Android"
    println(user.name)

}

class User {

    var name: String by Delegates.observable("Delegation") { property, oldValue, newValue ->
        println(oldValue)
    }

}