package `18_Funciones_Internas`

fun General() {
    fun MayorOMenor(val1: Int, val2: Int): Int {
        var mayor = 0
        if (val1 > val2) {
            mayor += val1
            println("El mayor es $val1")
        } else if (val1 < val2) {
            mayor += val2
            println("El mayor es $val2")
        } else {
            println("Los numeros son iguales")
        }
        return mayor
    }
        for (i in 1..5) {
            println("Ingrese valor:")
            val valor1 = readln().toInt()
            println("Ingrese otro valor:")
            val valor2 = readln().toInt()
            val numero = MayorOMenor(valor1,valor2)
            if (valor1 > valor2){
        }
    }
}
fun main() {
    General()
}




