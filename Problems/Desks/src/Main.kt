fun main() {
    val firstGroup = readLine()!!.toInt()
    val secondGroup = readLine()!!.toInt()
    val thirdGroup = readLine()!!.toInt()
    val remainder = firstGroup%2 + secondGroup%2 + thirdGroup%2
    print(firstGroup / 2 + secondGroup / 2 + thirdGroup / 2 + remainder)
}