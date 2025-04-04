package `5_Estructuras_condicionales_anidadas`

fun main() {
    println("Ingrese un valor:")
    val valor1 = readln().toInt()
    if (valor1 == 0)
        println("Es nulo")
    else
        if (valor1 > 0)
            println("Es positivo")
    else
        println("Es negativo")



}