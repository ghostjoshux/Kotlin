package `22_POO_Constructor`

class Triangulo( var lado1 : Int = 0, var lado2 : Int = 0,var lado3 : Int = 0){


    fun ladoMayor(){
        println("Lado mayor:")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
    fun esEquilatero(){
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triangulo equilatero")
        else
            println("No es un triangulo equilatero")
    }
}

fun main() {
    val triangulo1 = Triangulo(12,45,24)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}