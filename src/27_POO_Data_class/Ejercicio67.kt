package `27_POO_Data_class`
/*
Declar un data class llamado persona que almacene el nombre y la edad, sobreescribir el metodo toString para retornar
 */
data class  Persona(var nombre: String, var edad: Int){
    override fun toString(): String {
        return "$nombre, $edad"
    }
}

fun main() {
    var persona1 = Persona("Juan",22)
    var persona2 = Persona("Ana",59)

    println(persona1)
    println(persona2)
}