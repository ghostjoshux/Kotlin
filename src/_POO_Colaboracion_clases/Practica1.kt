package _POO_Colaboracion_clases

class Libroo(var Titulo: String, var prestado: Boolean){

    fun prestar(){
        if (prestado == true)
            println("${this.Titulo} No se puede prestar")
        else
            println("${this.Titulo} esta disponible")
            prestado = true
    }

    fun devolver(prestado: Boolean){
        if (prestado == false)
            println("${this.Titulo} ahora esta prestado")
        else
            println("${this.Titulo} esta disponible")
    }
    fun ESTADO(){
            if (prestado == true)
                println("No se puede prestar")
            else
                println("Disponible")
        println("$Titulo esta $prestado")
    }
}
class Biblioteca() {
    val Libro1: Libroo = Libroo("Harry Potter", true)
    val Libro2: Libroo = Libroo("Don Quijote de la mancha", false)
    val Libro3: Libroo = Libroo("Ana Frank", true)

    fun operar(){
        Libro1.prestar()
        Libro1.devolver(true)
        println("**********************************************")
        Libro2.prestar()
        Libro2.devolver(false)
        println("**************************************************")
        Libro3.prestar()
        Libro3.devolver(true)
        println("*****************************************************")
    }

    fun estado(){
        Libro1.ESTADO()
        Libro2.ESTADO()
        Libro3.ESTADO()
    }
}

fun main() {
    val Libro1 = Biblioteca()
    Libro1.operar()
}