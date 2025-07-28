package `22_POO_Constructor3`

class Libro(var título : String,var autor: String,var cantidad_de_páginas: Int){

    constructor():this(" "," ",0){
        println("Digite el título del libro:")
        val título = readln().toString()
        println("Digite el autor del libro:")
        val autor = readln().toString()
        println("Digite la cantidad de páginas del libro:")
        val cantidad_de_páginas = readln().toInt()
        println("_____________________________________________________________________________________________________")
    }

    fun leer(paginasleidas:Int){
        val páginas_por_leer = cantidad_de_páginas - paginasleidas
        println("Quedan $páginas_por_leer páginas por leer")
    }
    fun InfoLibro(){
        println("El título del libro es $título")
        println("El autor del libro es $autor")
        println("Cantidad de pagínas del libro son $cantidad_de_páginas")
    }
}
fun main(){
    val libro = Libro()
    libro.InfoLibro()
    println("Cuantas páginas ah leído?")
    val páginas = readln().toInt()
    libro.leer(páginas)
}
