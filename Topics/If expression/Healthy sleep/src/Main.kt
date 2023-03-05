fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    if (h >= a && h <= b) {
        println("Normal")
    } else if (h <= a && h <= b) {
        println("Deficiency")
    } else if (h >= a && h >= b) {
        println("Excess")
    }
}