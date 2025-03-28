package `2_Entrada_de_Datos`

    /*Se debe desarrolar un programa que pida el ingreso del precio
     de un articulo y la cantidad de un articulo y la cantidad que lleva el cliente
      y mostrar lo que debe abonar al comprador
     */
    fun main(){
    println("Ingrese  el precio del producto:")
        val precio: Double = readln().toDouble()
        println("Ingrese la camtidad de productos:")
        val cantidad: Int = readln().toInt()
        val total: Double = precio * cantidad
        println("El total a pagar es $total")









}