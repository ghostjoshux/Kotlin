package `14_Funciones_con_retorno`

fun retornarSuperficie(lado: Int): Int {
    val sup = lado * lado
    return sup
}

fun main() {
    println("Ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    val superficie = retornarSuperficie(lado)
    println("La superficie del cuadrado es $superficie")
}