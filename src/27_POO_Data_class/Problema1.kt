package `27_POO_Data_class`

import kotlin.random.Random

data class Butacas(val numero: Int, var ocupada: Boolean) {
    override fun toString(): String {
        val estadosdelabutacas = if (ocupada) "(ocupada)" else "(libre)"
        return "Butaca $numero $estadosdelabutacas"
    }
}

fun main() {
    val butaca1 = Butacas(1, false)
    val butaca2 = Butacas(2, false)
    val butaca3 = Butacas(3, false)
    val butaca4 = Butacas(4, false)
    val butaca5 = Butacas(5, false)
/*Lista de butacas*/
    val butacas = listOf(butaca1, butaca2, butaca3, butaca4, butaca5)

    val listaDebutacas = listOf(
        Butacas(1, butaca1.ocupada),
        Butacas(2, butaca2.ocupada),
        Butacas(3, butaca3.ocupada),
        Butacas(4, butaca4.ocupada),
        Butacas(5, butaca5.ocupada)
    )

    var num1 = Random.nextInt(1, 6)
    var num2 = Random.nextInt(1, 6)
    while (num2 == num1) {
        num2 = Random.nextInt(1, 6)
    }

    for (butaca in butacas) {
        if (butaca.numero == num1 || butaca.numero == num2) {
            butaca.ocupada = true
        }
    }

    println("Esta es la lista de butacas")
    println(butacas)

    println("Butacas disponibles y ocupadas:")
    for (butaca in butacas) {
        val estado = if (butaca.ocupada) "ocupada" else "libre"
        println("Butaca $butaca.numero → $estado")
    }

    val sonIguales = butacas == listaDebutacas
    println("¿Las listas son iguales? $sonIguales")
}



