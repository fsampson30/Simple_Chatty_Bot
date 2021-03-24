fun main() {
    val n1 = readLine()!!.toInt()
    val bool = readLine()!!.toBoolean()
    print(n1 in 10..20 && !bool || n1 in 15..25 && bool)
}