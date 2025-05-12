package `12_Concepto_de_funciones`

fun Menor(){
    println("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    println("Ingrese el primer valor:")
    val valor3 = readln().toInt()
    if (valor1 < valor2 && valor1 < valor3)
        println("El menor es $valor1")
    if (valor2 < valor1 && valor2 < valor3)
        println("El menor es $valor2")
    else
        println("Es menor el $valor3")
}
fun separar(){
    println("***********************************************************")
}
fun main() {
    Menor()
    separar()
    Menor()
}
