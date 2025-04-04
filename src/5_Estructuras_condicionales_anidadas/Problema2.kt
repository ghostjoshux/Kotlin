package `5_Estructuras_condicionales_anidadas`

fun main() {
    println("Ingrese un numero maximo de 3 cifras:")
    val valor1 = readln().toInt()
    val resultado = if (valor1 <= 9)
        println("Solo tiene un digito")
    else
        if (valor1 <= 99)
            println("tiene 2 digitos")
    else
        if (valor1 <=999)
        println("tiene 3 digitos")
    else
        println("Error son 3 cifras lo maximo")
}