package `22_POO_Constructor`

class Producto constructor(var nombre: String,var Precio: Int, var stock: Int) {

    init {
        if (Precio < 0)
            Precio = 0
        else
            Precio = Precio
        if (stock < 0)
            stock = 0
        else
            stock = stock
    }

    fun mostrarInfo() {
        println("El valor de el precio es $Precio")
        println("El valor de el stock es $stock")
    }
    fun haystock(){
        if (stock < 0)
            println("No esta disponible")
        else
            println("Esta disponible")
    }
}
fun main() {
    val Producto1= Producto("Arroz",1200,6)
    Producto1.haystock()
    Producto1.mostrarInfo()
    println("************************************************************")
    val Producto2= Producto("Frijoles",-1,3)
    Producto2.haystock()
    Producto2.mostrarInfo()
}