fun main() {
    val h1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()
    if(h1 == h2 && h2 == h3 && h1 == h3){
        print(true)
    } else if (h2 in h1..h3 || h2 in h3..h1){
        print(true)
    } else{
        print(false)
    }
}
