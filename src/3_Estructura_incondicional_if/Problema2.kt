package `3_Estructura_incondicional_if`

fun main() {
    println("Ingrese un numero del 1 al 99:")
    val num: Int = readln().toInt()
    if (num > 9) {
        println("Tiene 2 digitos tu numero")
    }
    else {
        println("Solo tiene 1 digito")
    }
}