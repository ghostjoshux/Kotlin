package `9_Estructura_Repetitiva_For`

fun main() {
    var suma = 0
    for (i in 1..10){
        println("Escriba 10 numeros:")
        val num = readln().toInt()
        if (i > 5)
            suma = suma + num
    }
    println("La suma de los ultimos 5 digitos es: $suma ")
}