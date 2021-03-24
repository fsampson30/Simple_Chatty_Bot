fun main() {
    val c1 = readLine()!!.first()
    val c2 = readLine()!!.first()
    print(c1 == c2 || c1.toUpperCase() == c2 || c2.toUpperCase() == c1)
}