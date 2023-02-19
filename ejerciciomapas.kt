fun main() {
    val jugadores = mapOf(
        "lola" to 10,
        "jimena" to 5,
        "sara" to 11,
        "ernesto" to 7
    )

    val lista= jugadores.map { "${it.key} obtuvo ${it.value} puntos" }
    lista.forEach { println(it) }
}