package `9_Estructura_Repetitiva_For`

/*
Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre
 la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
 */
fun main() {
    print("ingrese un valor:")
    val num = readln().toInt()
    for (i in 1..12) {
        val result = num * i
        println("numero x i : $result")
    }
}