package `3_Estructura_incondicional_if`

fun main() {
    print("Ingrese el primer valor:")
    val valor1: Int = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2: Int = readln().toInt()
    if (valor1 < valor2) {
        val suma: Int = valor1 + valor2
        val resta: Int = valor1 - valor2
        println("La suma de los dos valores es $suma")
        println("La resta de los dos valores es $resta")
    }
    else {
        val producto: Int = valor1 * valor2
        val division: Int = valor1 / valor2
        println("El producto de los 2 valores es $producto")
        println("La division de los 2 valores es $division")
    }






}