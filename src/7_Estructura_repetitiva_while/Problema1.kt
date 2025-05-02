package `7_Estructura_repetitiva_while`

fun main() {
    var mayor = 0
    var menor = 0
    var X = 0
    while (X <= 9) {
        println("Ingresar una nota")
        var nota = readln().toInt()
        if (nota >= 7) {
            mayor = mayor + 1
        } else
            menor = menor + 1
        X = X + 1
        nota = 0
    }
    println("Las notas mayores son $mayor")
    println("Las notas menores son $menor")
}