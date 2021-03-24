fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    val result = n1 in n2..n3 || n1 in n3..n2
    print(result)
}