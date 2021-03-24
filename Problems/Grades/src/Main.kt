fun main() {
    val times = readLine()!!.toInt()
    var timesA = 0
    var timesB = 0
    var timesC = 0
    var timesD = 0
    repeat(times) {
        val next = readLine()!!.toInt()
        if (next == 2) {
            timesD++
        } else if (next == 3) {
            timesC++
        } else if (next == 4) {
            timesB++
        } else {
            timesA++
        }
    }
    print("$timesD $timesC $timesB $timesA")
}