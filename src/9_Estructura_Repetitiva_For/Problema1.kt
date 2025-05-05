package `9_Estructura_Repetitiva_For`

fun main() {
    var cantidad= 0
    var superficie= 0
    print("cuantos triangulos quiere ingresar:")
    val numerodato = readln().toInt()
    for (i in 1..numerodato) {
        println("escriba la base del triangulo:")
        var base = readln().toInt()
        println("ingresa la altura del triangulo:")
        var altura = readln().toInt()
        println("las bases es : $base")
        println("las alturas es : $altura")
        val superfucie = base * altura / 2
        println ("La superficie es: $superfucie")
        if (superfucie >= 12) {
            cantidad++
        }

    }
    println("Los triangulos con superficie mayor a 12 son: $cantidad")
}