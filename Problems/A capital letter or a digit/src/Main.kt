fun main() {
    val c1 = readLine()!!.first()
    print(c1.isUpperCase() || c1 in '\u0031'..'\u0039')
}