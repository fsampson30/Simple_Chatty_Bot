fun main() {
    val range = readLine()!!.toInt()
    var minimunNumber = 1000
    for (i in 1..range) {
        val next = readLine()!!.toInt()
        if (next < minimunNumber) {
            minimunNumber = next
        }
    }
    print(minimunNumber)
}