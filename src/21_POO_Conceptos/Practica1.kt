package `21_POO_Conceptos`

class Alumno{
    var nombre:String = ""
    var nota : Int = 0

    fun inicializar(nombre: String, nota: Int){
        this.nombre = nombre
        this.nota= nota
    }
    fun imprimir(){
        println("Nombre: $nombre y tiene una nota de $nota")
    }
    fun Aprobado(){
        if (nota >= 7)
            println("$nombre Esta Aprobado")
        else
            println("$nombre Esta reprobado")
    }
}

fun main() {
    val persona1:Alumno
    persona1 = Alumno()
    persona1.inicializar("Julian",5)
   persona1.imprimir()
    persona1.Aprobado()

    val persona2:Alumno
    persona2 = Alumno()
    persona2.inicializar("Ana",9)
    persona2.imprimir()
    persona2.Aprobado()
}