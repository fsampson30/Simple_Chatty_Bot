fun main() {
    val times = readLine()!!.toInt()
    var maxNumber = 0
    repeat(times) {
        val next = readLine()!!.toInt()
        if (next % 4 == 0 && next > maxNumber) {
            maxNumber = next
        }
    }
    print(maxNumber)
}