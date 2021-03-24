fun main() {
    val times = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(times) {
        val next = readLine()!!.toInt()
        if (next == 0) {
            perfect++
        } else if (next == -1) {
            smaller++
        } else {
            larger++
        }
    }
    print("$perfect $larger $smaller")
}