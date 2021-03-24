fun main() {
    var max = 0
    do {
        val next = readLine()!!.toInt()
        if (next > max) {
            max = next
        }
    } while (next != 0)
    print(max)
}