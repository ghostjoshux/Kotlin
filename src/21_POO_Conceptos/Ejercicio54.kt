package `21_POO_Conceptos`

class Triangulo{
    var lado1 : Int = 0
    var lado2 : Int = 0
    var lado3 : Int = 0

    fun inicializar(){
        println("Ingrese lado 1:")
        lado1 = readln().toInt()
        println("Ingrese lado 2:")
        lado2 = readln().toInt()
        println("Ingrese lado 3:")
        lado3 = readln().toInt()
    }
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
    val triangulo1 = Triangulo()
    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}