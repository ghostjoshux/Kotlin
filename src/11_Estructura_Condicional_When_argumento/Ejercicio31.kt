package `11_Estructura_Condicional_When_argumento`

fun main() {
    println("Ingrese un valor positivo entre 1 y 99999:")
    val valor = readln().toInt()
    when (valor) {
        in 1..9 -> print("Tiene 1 digito")
        in 10..99 -> print("Tiene 2 digitos")
        in 100..999 -> print("Tiene 3 digitos")
        in 1000..9999 -> print("Tiene 4 digitos")
        in 10000..99999 -> print("Tiene 5 digitos")
        else -> println("Fuera de rango")



    }
}