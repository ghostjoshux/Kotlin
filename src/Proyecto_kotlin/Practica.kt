package Proyecto_kotlinasdf

import Proyecto_kotlin.main

fun registrarNota (nombre: String): Int {
    var NOTA = 0
    do {


        println("Ingrese una nota del $nombre 0 a 100")
        NOTA = readln().toInt()
    }while (NOTA == null || NOTA < 0 || NOTA > 100)
            println("Error, porfavor repite")

        return NOTA
    }
fun Resumen () {
    val estudiantes = arrayOf("Joshua", "Alemark", "Eydan", "Cris", "Eydan")
    val notas = Array(estudiantes.size) { i -> registrarNota(estudiantes[i]) }
    var aprobados = 0
    var reprobados = 0
    var suma = 0
    var NotaAlta = 0
    var NotaBaja = 100
    for (nota in notas) {
        suma += nota
        if (nota >= 70)
            aprobados++
        else
            reprobados++
        if (nota > NotaAlta)
            NotaAlta = nota
        if (nota < NotaBaja)
            NotaBaja = nota

        when (nota) {
            in 90..100 -> println("excelente")
            in 80..89 -> println("Buena")
            in 70..79 -> println("Aprobada")
            in 0..70 -> println("Reprobada")
        }
        val promedio = suma / 5
        println("Los aprobados son: $aprobados")
        println("Los reprobados son: $reprobados")
        println("El promedio es $promedio")
        println("Los aprobados son: $aprobados")
        println("La nota màs alta es: $NotaAlta")
        println("La nota màs baja es: $NotaBaja")

    }
}
fun main() {
    Resumen()
}