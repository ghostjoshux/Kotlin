package `15_Funciones_con_Expresion_unica`

fun retornarMayor(v1: Int , v2: Int) = if (v1 > v2) v1 else v2

fun main() {
    println("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    println("El mayor entre $valor1 y $valor2 es ${retornarMayor(valor1, valor2) }")
}