fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var result = 0
    if (a < b) {
        for (i in a..b) {
            result += i
        }
    }
    print(result)
}