package sorting

fun main() {
    print("banyak nya angka: ")
    val num = readLine()!!.toInt()
    val arr = Array<Int>(num){0}
    repeat(num){
        print("ke-${it+1} : ")
        arr[it] = readLine()!!.toInt()
    }
    println("angka yang telah dimasukan: ${arr.asList().toString()}")
    println("proses:")
    val count = sorting(arr)
    println("Jumlah swap: $count")
}

fun sorting(arr: Array<Int>): Int {
    var temp: Int
    var num = 0
    for (i in arr.indices){
        for (j in i + 1 until arr.size){
            if (arr[i] > arr[j]) {
                num++
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                printArr(num, arr[i], arr[j], arr)
            }
        }
    }
    return num
}

fun printArr(num: Int, a: Int, b: Int, arr: Array<Int>){
    print("${num}. [${a},${b}] -> ")
    arr.forEach { print("$it ")}
    println()
}

