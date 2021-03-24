import java.util.*

fun main() {
    val inicialMoney = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)
    var current = 0
    var result = 0
    var test = false
    result = inicialMoney
    while (scanner.hasNext()) {
        current = scanner.nextInt()
        if (current <= result) {
            result -= current
        } else {
            print("Error, insufficient funds for the purchase. You have $result, but you need $current.")
            test = true
        }
    }
    if (result >= 0 && !test) {
        print("Thank you for choosing us to manage your account! You have $result money.")
    }
}
