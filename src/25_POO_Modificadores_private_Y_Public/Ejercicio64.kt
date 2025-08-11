package `25_POO_Modificadores_private_Y_Public`

class Dado {
    private var valor: Int = 1

    public fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }
    fun imprimir(){
        separador()
        println("Valor del dado: $valor")
        separador()
    }
    private fun separador() = println("*******************************************************************************")
}

fun main() {
    val Dado1 = Dado()
    Dado1.tirar()
    Dado1.imprimir()
}