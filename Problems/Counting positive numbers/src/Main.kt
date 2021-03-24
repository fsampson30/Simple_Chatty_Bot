fun main() {
    val times = readLine()!!.toInt()
    var result = 0
    repeat(times) {
        val next = readLine()!!.toInt()
        if (next > 0) {
            result++
        }
    }
    print(result)
}