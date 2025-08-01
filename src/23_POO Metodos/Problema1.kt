package `23_POO Metodos`

class Notas {
    var valor1 : Int = 0
    var valor2: Int = 0
    var valor3: Int = 0
    var valor4: Int = 0
    fun CargarNotas(){
        println("Ingrese la primera calificacion:")
        valor1 = readln().toInt()
        println("Ingrese la segunda calificacion:")
        valor2 = readln().toInt()
        println("Ingrese la tercera calificacion:")
        valor3 = readln().toInt()
        println("Ingrese la cuarta calificacion:")
        valor4 = readln().toInt()
            PromedioNotas()
            Aprobados()
    }
    fun PromedioNotas(){
        val suma = valor1 + valor2 + valor3 + valor4
        val promedio = suma / 4
        println("El promedio es $promedio")
    }
    fun Aprobados(){
        var aprobados:Int = 0
        if (valor1 >= 70)
            aprobados++
        if (valor2 >= 70)
                aprobados++
        if (valor3 >= 70)
                aprobados++
        if (valor4 >= 70)
                aprobados++
        println("El numero de aprobados es $aprobados")

    }
}

fun main() {
    val cargarnotas1 = Notas()
    cargarnotas1.CargarNotas()
}