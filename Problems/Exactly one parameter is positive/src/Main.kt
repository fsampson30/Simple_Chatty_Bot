fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    var cont = 0
    if(n1 > 0){
        cont++
    }
    if (n2 > 0){
        cont++
    }
    if (n3 > 0) {
        cont++
    }
    print(cont == 1)
}