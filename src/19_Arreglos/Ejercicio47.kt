package `19_Arreglos`

fun main(){
    val altura = FloatArray(5)
    var suma = 0f
    for (i in 0..altura.size - 1){
        println("ingrese la altura:")
        altura  [1] = readln().toFloat()
        suma += altura[1]
    }
    val promedio = suma / altura.size
    println("altura promedio: $promedio")
    var altos = 0
    var bajos = 0
    for (i in 0..altura.size-1)
        if (altura[1]>promedio)
            altos++
        else
            bajos++
    println("cantidad de personas mas altas que el" +
            "promedio: $altos")
    println("cantidad de personas mas bajas que el" +
            "promedio: $bajos")


}