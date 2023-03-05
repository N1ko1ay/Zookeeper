fun sum(a: Int,b: Int,c: Int): Int {
    val result = a + b + c
    return result
}

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}
