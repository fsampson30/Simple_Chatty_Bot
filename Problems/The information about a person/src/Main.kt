import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val firstName = scanner.next()
    val lastName = scanner.next()
    val age = scanner.nextInt()
    print("${firstName.first()}. $lastName, $age years old")
}