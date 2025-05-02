package `7_Estructura_repetitiva_while`

fun main() {
    var x = 1
    var suma1 = 0
    var suma2 = 0

    println("Ingrese los 5 valores de la lista 1:")
    while (x <= 5){
        println("Valor $x:")
        val valor = readln().toInt()
        suma1 += 1
    }

    x = 1
    println("Ingrese los 5 valores de la lista 2:")
    while (x <= 5){
        println("Valor $x:")
        val valor = readln().toInt()
        suma2 += valor
        x += 1
    }
}