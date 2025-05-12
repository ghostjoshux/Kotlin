package `11_Estructura_Condicional_When_argumento`

fun main() {
    println("Ingrese un valor entre el 1 y el 5:")
    val valor = readln().toInt()
    when (valor) {
        1 -> print("Uno")
        2 -> print("Dos")
        3 -> print("Tres")
        4 -> print("Cuatro")
        5 -> print("Cinco")
        else -> print("Valor fuera de rango")

    }
}