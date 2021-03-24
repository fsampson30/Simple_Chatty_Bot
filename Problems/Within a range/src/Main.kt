fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    val n4 = readLine()!!.toInt()
    val n5 = readLine()!!.toInt()
    print(n5 in n1..n2 || n5 in n3..n4)
}