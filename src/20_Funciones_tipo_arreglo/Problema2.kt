package `20_Funciones_tipo_arreglo`
fun elemento(): IntArray{
    print("Cuantos elementos deseea ingresar:")
    val contador = readln().toInt()
    val elementos = IntArray (contador)
    for (i in elementos.indices){
        print("Ingrese el elemento:")
        elementos[i] = readln().toInt()
    }
    return elementos
}
fun main(){
    val numero = elemento()
    var suma = 0
    var NumeroBajo: Int = 100
    for (i in numero.indices){
        if(NumeroBajo > numero[i]) {
            NumeroBajo = numero[i]
        }
    }
    println("El número menor es: $NumeroBajo")
    for (i in numero.indices){
        if (NumeroBajo == numero[i]){
            suma ++
        }
    }
    if (suma >= 1){
        println("El número menor se repite")
    }
}