package `9_Estructura_Repetitiva_For`

fun main() {
    var cant = 0
    println("Cuantos valores ingresara para analizar:")
    val cantidad = readln().toInt()
    for (i in 1 .. cantidad){
        println("Ingrese valor:")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            cant++
    }
    println("Cantidad de pares: $cant")
}