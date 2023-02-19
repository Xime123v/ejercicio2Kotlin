fun main() {
    val conjuntos: Set<Int> = setOf(1, 3, 4)
    println(conjuntos)



    val conjuntosMezclado = mutableSetOf(2, 4.4, "Armenia", 'B')

    conjuntosMezclado.add(9)// para añadir elementos
    println(conjuntosMezclado)

    conjuntosMezclado.remove(4.4) //para eliminar elementos
    println(conjuntosMezclado)

    conjuntosMezclado.forEach { println(it) }

    for (i in conjuntosMezclado) {
        println(i)
    }

    val coleccion1 = setOf(1, 2, 5, 3)
    val coleccion2 = setOf(6, 4, 10, 7)
    println(coleccion1 union coleccion2)

    println( setOf(9, 1, 6, 3)
            intersect
            setOf(2, 3, 6, 5))

    val diferente= setOf(9, 120, 11, 13) subtract setOf(9, 120, 11, 8)
    println("A\\B = $diferente")

}