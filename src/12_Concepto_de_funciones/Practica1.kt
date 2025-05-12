package `12_Concepto_de_funciones`

fun CargarMulti() {
    println("Ingrese un valor:")
    val valor1 = readln().toInt()
    val X = valor1 * valor1
    println("El cuadrado de $valor1 es $X")
}

fun Producto(){
    println("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")
}
fun Separacion(){
    println("***********************************************************************")
}
fun main() {
    Cargarsumar()
    separacion()
    Producto()
}