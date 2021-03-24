fun nextNumber(a: Int): Int {
    if (a % 2 == 0) {
        return a / 2
    } else {
        return a * 3 + 1
    }
}

fun main() {
    val next = readLine()!!.toInt()
    var result = next
    while (result != 1) {
        print("$result ")
        result = nextNumber(result)
    }
    print("1")
}