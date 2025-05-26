package `16_Funciones_Parametros_por_Defectos`


fun Retornar(n: Int = 2, sumaInicial: Int = 0 ,num1: Int = 0): Int{
    var total = sumaInicial + num1
    for (i in 1..n){
        println("Digite un valor:")
        val num = readln().toInt()
        total += num
    }
    return total
}
fun main() {
    println("Digite entre 2 y 5 digitos:")
    println("Cuantos digitos desea ingresar:")
    val num = readln().toInt()
    val total = Retornar(num)
    println("La suma total de todos los digitos es $total")

}