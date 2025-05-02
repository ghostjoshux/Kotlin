package `7_Estructura_repetitiva_while`

fun main(){
    println("Dijiste el numero de altura que va a ingresar")
    val n = readln().toInt()
    var x = 1
    var suma = 0.0
    while (x <= n){
        println("Ingrese su altura")
        val valor = readln().toDouble()
        suma = suma + valor
        x = x + 1
    }
    val promedio = suma / n
    println("Elpromedio de las alturas es $promedio")
}