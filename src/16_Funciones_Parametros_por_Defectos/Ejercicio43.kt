package `16_Funciones_Parametros_por_Defectos`

fun TituloSubrayado(titulo: String, caracter: String = "*"){
    println(titulo)
    for (i in 1..titulo.length)
        println(caracter)
    println()
}
fun main() {
    TituloSubrayado("Sistema de Administracion")
    TituloSubrayado("Ventas", "-"  )
}