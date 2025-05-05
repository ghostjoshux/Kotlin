package `8_Estructura_repetitiva_Do_While`

fun main() {
    var opcion = 0
    do {
        println("Calculadora Básica")
        println("1. Sumar dos números")
        println("2. Restar dos números")
        println("3. Multiplicar dos números")
        println("4. Dividir dos números")
        println("5. Salir")
        print("Seleccione una opción: ")
        opcion = readln().toInt()
        if (opcion >= 1 && opcion <= 4) {
            print("Ingrese el primer número: ")
            val num1 = readln().toInt()
            print("Ingrese el segundo número: ")
            val num2 = readln().toInt()
            if (opcion == 1) {
                val resultado = num1 + num2
                println("Resultado: $num1 + $num2 = $resultado")
            } else if (opcion == 2) {
                val resultado = num1 - num2
                println("Resultado: $num1 - $num2 = $resultado")
            } else if (opcion == 3) {
                val resultado = num1 * num2
                println("Resultado: $num1 * $num2 = $resultado")
            } else if (opcion == 4) {
                if (num2 == 0) {
                    println("Error: No se puede dividir por cero.")
                } else {
                    val resultado = num1 / num2
                    println("Resultado: $num1 / $num2 = $resultado")
                }
            }
        } else if (opcion != 5) {
            println("Opción no válida")
        }
    } while (opcion != 5)
    println("Gracias por usar la calculadora")
}
