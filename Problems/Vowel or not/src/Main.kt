fun isVowel(digit: Char) = digit == 'a' || digit == 'A' || digit == 'e' ||
            digit == 'E' || digit == 'i' || digit == 'I' ||
            digit == 'o' || digit == 'O' || digit == 'u' ||
            digit == 'U'

fun main() {

    val letter = readLine()!!.first()

    println(isVowel(letter))
}