package `8_Estructura_repetitiva_Do_While`

fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        println("Ingrese un valor entre 0 y 9999")
        val num = readln().toInt()
        if (num > cant1)
            cant1++
        else
            if (num == cant2)
                cant2++
    }while (num != 9999)
    val suma = cant1 + cant2
    println("El valor acumulable es: $suma")
}