package `7_Estructura_repetitiva_while`

fun main(){
    println("ingrese n valor:")
    val valor = readln().toInt()
    var x = 1
    while ( x <= valor){
        println(x)
        x = x + 1
    }
}