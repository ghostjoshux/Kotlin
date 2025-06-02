package Proyecto_kotlin

fun RegistrarNota(nombre: String): Int {
    var NOTA : Int
    do {
        println("Ingrese la nota de $nombre entre 0 y 100:")
        NOTA = readln().toInt()
    } while (NOTA == null || NOTA < 0 || NOTA > 100)
    return nota
    }

fun main() {
    val estudiantes = arrayOf("Alemark","Joshua","Jeydan","Eydan","Cris")
val notas = Array(estudiantes.size){ i -> RegistrarNota(estudiantes[i])}
    var condicion: String
    var suma = 0
    var NumA = 0
    var NumB = 100
    for (nota in notas){
        suma += nota

    

}

