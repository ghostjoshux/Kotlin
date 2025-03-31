package `4_Estructura_incondicional_como_expresion`

fun main() {
    println("Ingrese un numero entero:")
    val valor1: Int = readln().toInt()
    println("Ingrese otro numero:")
    val valor2: Int = readln().toInt()
    if (valor1 > valor2) {
        println("El mayor es $valor1")
    } else {
        println("El mayor es $valor2")
    }
}