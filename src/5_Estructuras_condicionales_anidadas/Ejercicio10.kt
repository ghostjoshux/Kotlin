package `5_Estructuras_condicionales_anidadas`

    fun main() {
        println("Ingrese la primer nota:")
        val nota1 = readln().toInt()
        println("Ingrese la segunda nota:")
        val nota2 = readln().toInt()
        println("Ingrese la tercera nota:")
        val nota3 = readln().toInt()
        val promedio = (nota1 + nota2 + nota3) / 3
        if (promedio >= 7)
            print("promocionado")
        else
            if (promedio >= 4)
                print("Regular")
            else print("Reprobado")
}