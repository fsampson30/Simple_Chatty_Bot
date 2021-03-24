fun main() {
    val s = readLine()!!
    val digits = s.map(Character::getNumericValue).toIntArray()
    println(digits[0])
}
