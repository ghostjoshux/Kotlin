package `25_POO_Modificadores_private_Y_Public`

class Operaciones {
    private var valor1: Int = 0
    private var valor2: Int = 0

    fun cargar(){
        println("Ingrese primer valor:")
        valor1 = readln().toInt()
        println("Ingrese primer valor:")
        valor2 = readln().toInt()
        sumar()
        restar()
    }
    private fun sumar (){
        val suma = valor1 + valor2
        println("La suma de $valor1 y $valor2 es $suma")
    }
    private fun restar(){
        val resta = valor1 - valor2
        println("La resta de $valor1 y $valor2 es $resta")
    }
}

fun main() {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}