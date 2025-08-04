package _POO_Colaboracion_clases

class Estudiantes(var nombre: String, var asistencias: Int){

    fun RegistrarAsistencia(){
        this.asistencias ++
    }

    fun imprimir(){
        println("Las asistencias de $nombre son: $asistencias ")
    }
}
class clase {
    val est1: Estudiantes = Estudiantes("Juan",6)
    val est2: Estudiantes = Estudiantes("Maria",8)
    val est3: Estudiantes = Estudiantes("Dilan",2)

    fun marcarAsistencia(){
        est1.RegistrarAsistencia()
        est2.RegistrarAsistencia()
        est3.RegistrarAsistencia()
    }
    fun reporte(){
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()
    }
}

fun main() {
    val est1 = clase()
    est1.marcarAsistencia()
    est1.reporte()
}