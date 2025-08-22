package `26_POO__Metodos_set_y_get`

import `20_Funciones_tipo_arreglo`.sumar
import java.util.*

class Jardin{

    var ancho : Int = 0
        set(valor) {
            if (valor <= 0) {
                field = 1
            } else
                field = valor
        }
        get(){
            return field
        }


    var largo:Int = 0

    set(valor) {
        if (valor <= 0) {
            field = 1
        } else
            field = valor
    }
        get(){
            return field
        }



    fun TipoDeZacate(){
        println("Que tipo de zacate quieres(Pon el numero): " +
                "1 -> CRIOLLO || " +
                "2 -> AMERICANO || " +
                "3 -> SINTETICO")
        var opcion:Int = readln().toInt()
        when (opcion){
            1 -> println("Elegiste Criollo")
            2 -> println("Elegiste Americano")
            3 -> println("Elegiste Sintetico")
            else -> println("Error")
        }
    }
    fun Area(){
        println("De cuanto de ancho quieres el zacate:")
        var Ancho = readln().toInt()
        println("De cuanto de largo quieres el zacate:")
        var Largo = readln().toInt()

        val calculo = Largo * Ancho
        println("El area es de $calculo")
    }
    fun Precio(){
        var precio : Int = readln().toInt()
        
        }
    }
    fun Subtotal(){

    }


fun main() {
    var jardin1 = Jardin()
    jardin1.Area()
    jardin1.TipoDeZacate()
}
