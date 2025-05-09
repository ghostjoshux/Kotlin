package `10_Estructura_condicional_when`

fun main() {
    println("Ingrese un valor:")
    val valor1 = readln().toInt()
    when {
        valor1 > 0 -> println("Es positivo")
        valor1 == 0 -> println("Es nulo")
        else -> println("Es negativo")
        }

    }