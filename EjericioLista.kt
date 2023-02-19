fun main() {
    val lista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }

    println(lista)
    val cant = lista.count { it == 1 }

    println("Cantidad de elementos con el valor 1: $cant")

    lista.removeAll { it == 6 }
    println(lista)
}