package `22_POO_Constructor`

class Rectangulo(var Base: Int,var altura: Int){
    init {
        if (Base <= 0){
            Base = 1
        }
        if (altura <= 0){
            altura = 1
        }
    }
    fun area(): Int {
        return Base * altura / 2
    }
    fun esCuadrado(){
        return if (Base == altura)
            println("Es un cuadrado")
        else
            println("Es un rectangulo")
    }
}

fun main() {
    val Numero1 = Rectangulo(5,5)
    println("Area: ${Numero1.area()}")
    (Numero1.esCuadrado())
}