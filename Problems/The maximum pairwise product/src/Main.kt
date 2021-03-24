fun main() {
    val range = readLine()!!.toInt()
    var a = 0
    var b = 0
    if (range == 1) {
        print(range)
    } else {
        for (i in 1..range) {
            val next = readLine()!!.toInt()
            if (next > a) {
                a = next
            } else {
                b = next
            }
        }
    }
    print(a * b)
}