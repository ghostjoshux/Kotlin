package `12_Concepto_de_funciones`

fun presentacion(){
    println("Programa que permite cargar dos valores por teclado")
    println("Efectua la suma de los valores")
    println("Muestra el resultado de la suma")
    println("*******************************")
}

fun Cargarsumar(){
    print("Ingrese el primer valor:")
    val valor1= readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 +valor2
    println("La suma de los dos valores es $suma")
}
fun finalizar(){
    println("************************************")
    println("Gracias por utilizar este programa")
}
fun main() {
    presentacion()
    Cargarsumar()
    finalizar()
}