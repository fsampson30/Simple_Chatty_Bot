fun main() {
    val duration = readLine()!!.toInt()
    val totalFood = readLine()!!.toInt() * duration
    val totalFlight = readLine()!!.toInt() * 2
    val totalNights = readLine()!!.toInt() * (duration - 1)
    val sum = totalFood + totalFlight + totalNights
    print(sum)
}