package `7_Estructura_repetitiva_while`

fun main() {
    println("Ingrese la cantidad de empleados:")
    val n = readln().toInt()
    val x = 1
    var pago1 = 0
    var pago2 = 0
    var resta = 0
    while (x <= n) {
        println("Ingrese el sueldo:")
        val sueldo = readln().toInt()
        if (sueldo >= 100 && sueldo <= 300) {
            pago1 = pago1 + 1
            resta = resta + sueldo
        } else {
            pago2 = pago2 + 1
            resta = resta + sueldo
        }

    }
    println("Los sueldo entre 100 y 300 son $pago1")
    println("Los sueldo mayores a 500 son $pago2")
    println("Los gasto promedio es $resta")

}