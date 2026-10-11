val precios = listOf(30000, 25000, 15000)
val recargoNocturno = {precio:Int -> precio*110/100}

precios.forEach {
    println("Precio original: $it COP")
    println("Precio con recargo: ${recargoNocturno(it)} COP")
}
