package `2_Entrada_de_Datos`

/*Escribir un programa en el cual se ingresan cuatro numeros
enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto
 */
fun main(){
 println("Ingrese un numero")
    val variable1: Int = readln().toInt()
    println("Ingrese otro numero")
    val variable2: Int = readln().toInt()
    println("Ingrese otro numero")
    val variable3: Int = readln().toInt()
    println("Ingrese otro numero")
    val variable4: Int = readln().toInt()
    val suma: Int = variable1 + variable2
    val producto: Int = variable3 * variable4
    println("La suma de $variable1 y $variable2 es $suma")
    println("El producto de $variable3 X $variable4 es $producto")






}