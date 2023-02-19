fun main() {
    val nombresEdad: Map<String, String> = mapOf(
        "jimena" to "15",
        "pepe" to "20",
        "lolita" to "34",
        "andres" to "12"
    )
    println("$nombresEdad")
    println(nombresEdad.get("lolita"))

    println(nombresEdad.keys) //solo imprime las llaves
    println(nombresEdad.values) // solo imprime los valores

    val materias = mutableMapOf(
        "matematicas" to 2.0,
        "ingles" to 4.0,
        "etica" to 5.0,
        "danzas" to 1.6
    )

    println(materias)

    println(materias["etica"])//permite obtener el valor a partir de la clave en el corchete.

    println(materias.getOrDefault("danzas", "1.6")) //Obtiene el valor
    // correspondiente a la clave, de lo contrario retorna a defaultValue

    println(materias.isEmpty()) //imprime si esta vacio de lo contrario da false

    //println(materias.size) //para saber cuantos elementos tiene

    //materias.put("español", 5.0)//para añadir elementos
    //println(materias)

    materias["español"] = 4.0 //para actualizar elementos
   // println(materias)

   // materias.remove("ingles") //para eliminar elementos
    //println(materias)

    //for ((nombres, nota) in materias) {
      //  println("$nombres : $nota")
    //}
}