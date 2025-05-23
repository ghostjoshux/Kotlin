package `14_Funciones_con_retorno`

fun SacarPromedio(v1: Int, v2: Int, v3: Int ): Int{
    val promedio = (v1 +v2 + v3) /3
    return promedio
}
fun main() {
    println("Digite un numero:")
    val valor1 = readln().toInt()
    println("Digite otro numero:")
    val valor2 = readln().toInt()
    println("Digite otro numero:")
    val valor3 = readln().toInt()
    println("EL promedio de los numeros $valor1 , $valor2 , $valor3 es ${SacarPromedio(valor1, valor2, valor3)}")
}