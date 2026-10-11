val edad: Int = 1
var esUrgencia: Boolean = false

val categoria: String = when (edad) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8 .. Int.MAX_VALUE -> "Senior"
    else -> "Edad no válida"
}

println("Categoría: Mascota $categoria")

if (esUrgencia || categoria == "Senior") {
    println("Prioridad Alta")
} else {
    println("Atención Regular")
}
