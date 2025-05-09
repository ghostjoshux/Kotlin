package `10_Estructura_condicional_when`

fun main() {
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var total = 0
    for (i in 1..5) {
        println("Ingrese un numero:")
        val num1 = readln().toInt()
        println("Ingrese un segundo numero:")
        val num2 = readln().toInt()
        println("Ingrese un tercer numero:")
        val num3 = readln().toInt()
        when {
            num1 > num2 && num1 > num3 -> {
                total += num1
            }

            num2 > num1 && num2 > num3 -> {
                total += num2
            }
            num3 > num1 && num3 > num2 ->{
                total += num3
            }
            else -> {
                println("todos son iguales")
            }
        }
    }
    println("La suma de los numeros mayores es $total")
}