fun main() {
    val hour = readLine()!!.toString()
    val date = readLine()!!.toString()
    val hourFormatted = hour.replace(" ", ":")
    val dateFormatted = date.replace(" ", "/")
    print("$hourFormatted $dateFormatted")
}
