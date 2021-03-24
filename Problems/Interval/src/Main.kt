fun main() {
    val number = readLine()!!.toInt()
    if (number in -15..12 || number in 14..17 || number >= 19){
        print("True")
    } else
        print("False")
}