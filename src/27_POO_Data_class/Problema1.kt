package `27_POO_Data_class`

import kotlin.random.Random
    data class Butacas(var ocupada: Boolean, var numero: Int) {


        fun main() {
            val Butaca1 = Butacas(false, 1,)
            val Butaca2 = Butacas(true, 2)
            val Butaca3 = Butacas(false, 3)
            val Butaca4 = Butacas(true, 4)
            val Butaca5 = Butacas(false, 5)
            
        }
    }
    class  Dado ( var valor: Int) {

        fun Tirar() {
            this.valor = Random.nextInt(1, 5).toInt()
            println("La butaca $valor se cerrara")

        }
}

