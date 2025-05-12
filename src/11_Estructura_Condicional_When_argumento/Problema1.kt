package `11_Estructura_Condicional_When_argumento`

fun main() {
    var h1 = 0
    var h2 = 0
    var h3 = 0
    var h4 = 0

    for (i in 1..10) {
        println("Cuantos hijos tiene la familia:")
        val hijos = readln().toInt()
        when (hijos) {
            0 -> h1++
            1 -> h2++
            2 -> h3++
            else -> h4++
        }
        println("Cantidad de las familias que no tienen hijos son: $h1")
        println("Cantidad de las familias que tienen 1 hijo son: $h2")
        println("Cantidad de las familias que tienen 2 hijos son: $h3")
        println("Cantidad de las familias que tienen mas de 2 hijos son: $h4")


    }
}