package `24_POO_Colaboracion_clases`

import kotlin.random.Random

class  Dado ( var valor: Int){

    fun Tirar(){
        this.valor = Random.nextInt(1,7).toInt()
        imprimir()
    }
    fun imprimir(){
        println("Valor del dado: $valor")
    }
}
class JuegoDeDados(){
     val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar(){
        dado1.Tirar()
        dado2.Tirar()
        dado3.Tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Ganaste")
        else
            println("Perdiste")
    }
}

fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}