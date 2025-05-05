package `9_Estructura_Repetitiva_For`

fun main() {
    print("Ingrese la cantidad de puntos: ")
    val n = readLine()!!.toInt()

    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0

    for (i in 1..n) {
        print("Ingrese x: ")
        val x = readLine()!!.toInt()
        print("Ingrese y: ")
        val y = readLine()!!.toInt()

        if (x == 0 || y == 0) {
            println("El punto está sobre un eje, no se cuenta.")
        } else if (x > 0 && y > 0) {
            q1++
        } else if (x < 0 && y > 0) {
            q2++
        } else if (x < 0 && y < 0) {
            q3++
        } else if (x > 0 && y < 0) {
            q4++
        }
    }

    println("Primer cuadrante: $q1")
    println("Segundo cuadrante: $q2")
    println("Tercer cuadrante: $q3")
    println("Cuarto cuadrante: $q4")
}