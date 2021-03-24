fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()
    print(
        if (h in a..b) {
            "Normal"
        } else if (h > a) {
            "Excess"
        } else {
            "Deficiency"
        }
    )

}