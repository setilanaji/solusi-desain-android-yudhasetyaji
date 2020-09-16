package basicFunction

fun main() {
    print("Masukan nama: ")
    val name = readLine().toString()
    println(hello(name))
}

fun hello(name: String?): String{
    return if (name!!.isNotEmpty()) ("Hello, $name!") else ("Hello, world!")
}