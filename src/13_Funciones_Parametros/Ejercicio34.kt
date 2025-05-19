package `13_Funciones_Parametros`

import `12_Concepto_de_funciones`.Cargarsumar

fun MostrarMensaje (mensaje: String){
    println("********************************************")
    println(mensaje)
    println("********************************************")
}

fun CargarSuma(){
    println("Digite un numero:")
    val valor1 = readln().toInt()
    println("Digite otro numero:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los 2 valores es: $suma")
}

fun main() {
    MostrarMensaje("El programa calcula la suma de " + "dos valores ingresados por teclado")
    Cargarsumar()
    MostrarMensaje("Gracias por utilizar este" + " Programa")
}