package `14_Funciones_con_retorno`

fun RetornarSuperficie(lado1: Int,lado2: Int): Int{
    val superficie = lado1 * lado2
    return superficie
}
fun main() {
    println("Digite un lado:")
    val valor1 = readln().toInt()
    println("Digite otro lado:")
    val valor2 = readln().toInt()
    println("La superficie es ${RetornarSuperficie(valor1, valor2)}")
}