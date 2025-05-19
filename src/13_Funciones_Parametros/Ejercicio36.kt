package `12_Concepto_de_funciones`

fun mostrarPerimetro(Lado: Int){
    val perimetro = Lado *4
    println("El perimetro es $perimetro")
}
fun mostrarSUperficie(lado: Int){
    val superficie = lado * lado
    println("La superficie es $superficie")
}

fun main(){
    print("Ingrese el valor del lado de un  cuadrado: ")
    val lado = readln().toInt()
    println("Quiere calcular el perimetro o la superficie [Ingresar texto: perimetro/superficie]")
    var respuesta = readln()
    when (respuesta){
        "perimetro" -> mostrarPerimetro(lado)
        "superficie" -> mostrarSUperficie(lado)



    }
}