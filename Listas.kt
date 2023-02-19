fun main() {
    //listas inmutables osea solo lecturas

    val listas: List<Int> = listOf(1, 2, 3, 4, 5)
    val lista2 = listOf(1, 2, 3, 4, 5)
    println(listas)
    println(lista2)




    //listas mutables

    val listasDeColores = mutableListOf("Rosado", "Azul", "Morado")

    listasDeColores.sortDescending()
    println(listasDeColores)

    //println(listasDeColores.get(0))
    //println(listasDeColores.get(1))
    //println(listasDeColores.get(2))

    //listasDeColores.sortDescending()
    //println(listasDeColores)

    //listasDeColores.add("Negro") //Para agregar elemntos
    //println(listasDeColores)

    //listasDeColores[1] = "Verde" //para actualizar
    //println(listasDeColores)

   // listasDeColores.add(3, "Naranja") //para agregar elementos en una posicion especifica
    //println(listasDeColores)

    //listasDeColores.removeAt(0) // para eliminar elementos
    //println(listasDeColores)

    //for (i in listasDeColores.indices) {
      //  println(listasDeColores[i])
    //}

    //listasDeColores.forEach { println(it) }

    val numeros = mutableListOf(8, 1, 5, 7, 3)



    //numeros.sortByDescending { it }
    numeros.sort()
    println(numeros)

}