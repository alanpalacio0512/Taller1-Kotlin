val contactoEmergencia:String?=null

val cantidadCaracteres:Int?=contactoEmergencia?.length
println("Cantidad de caracteres: $cantidadCaracteres")

val contactoFinal:String=contactoEmergencia ?: "Sin contacto registrado"
println("Contacto de emergencia: $contactoFinal")


