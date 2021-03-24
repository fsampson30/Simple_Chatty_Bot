fun main() {
    var c1 = readLine()!!.first()
    var c2 = readLine()!!.first()
    val c3 = readLine()!!.first()
    print(c2 == ++c1 && c3 == ++c2)
}
