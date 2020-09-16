package stringManipulation

fun main() {
    print(stringManipulation("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizz").toString())
}

fun stringManipulation(text: String): List<String>{
    val arr = listOf( "Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke")
    val res = mutableListOf<String>()
        for (i in arr){
            var from = 0
            while(text.indexOf(i.toLowerCase(), from) > -1){
                from = text.indexOf(i.toLowerCase(), from)
                res.add(i)
                from++
            }
        }
    return res

}