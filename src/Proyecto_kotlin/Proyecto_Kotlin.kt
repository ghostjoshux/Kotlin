package Proyecto_kotlin

fun RegistrarNota(nombre: String): Int {
    var NOTA : Int
    do {
        println("Ingrese la nota de $nombre entre 0 y 100:")
        NOTA = readln().toInt()
    } while (NOTA == null || NOTA < 0 || NOTA > 100)
    return NOTA
    }

fun main() {
    val estudiantes = arrayOf("Alemark","Joshua","Jeydan","Eydan","Cris")
val notas = Array(estudiantes.size){ i -> RegistrarNota(estudiantes[i])}
    var aprobados = 0
    var reprobados = 0
    var suma = 0
    var NumA = 0
    var NumB = 100
    for (nota in notas) {
        suma += nota
        if (nota >= 70)
            aprobados++
        else
            reprobados++
        if (nota > NumA)
            NumA = nota
        if (nota < NumB)
            NumB = nota

        when (nota) {
            in 90..100 -> println("Excelente")
            in 80..89 -> println("Buena")
            in 70..79 -> println("Aprobada")
            else -> println("Reprobado")
        }
    }
        val promedio = suma/notas.size
        println("Aprobados: $aprobados")
        println("Reprobados: $reprobados")
        println("Promedio: $promedio")
        println("Nota mas alta: $NumA")
        println("Nota mas baja: $NumB")
    }

