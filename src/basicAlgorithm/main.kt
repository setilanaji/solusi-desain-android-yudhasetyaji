package basicAlgorithm

fun main() {
    print("masukan angka: ")
    val n = readLine()!!.toInt()
    val table = multiplicationTable(n)
    table.forEach { println("${it.asList()} ")}
}

fun multiplicationTable(n: Int): List<IntArray> {
    val table  = Array(n) { IntArray(n) }
    for (i in 0 until n){
        for (j in 0 until n){
            table[i][j] = (i+1)*(j+1)
        }
    }
    return table.toList()
}