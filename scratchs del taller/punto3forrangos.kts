val mascotas = listOf("Bigotes","Simon", "Clara", "Arnulfo")

var turno: Int = 1

for (mascota in mascotas) {
    println("$mascota: Turno $turno")
    turno++
}

println("Cuenta regresiva para abrir la clínica veterinaria:")

val conteoregresivo= 5 downTo 1

for (tiempo in conteoregresivo){
    println("Tiempo restante para abrir: $tiempo min")
}
println("¡La clínica abrió!")
