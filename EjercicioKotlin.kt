fun main() {
    val semanas = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(semanas.get(0))
    println(semanas.get(1))
    println(semanas.get(2))
    println(semanas.get(3))
    println(semanas.get(4))
    println(semanas.get(5))
    println(semanas.get(6))

    if(semanas.size >= 8){
        println(semanas.get(7))
    }else{
        println("no tiene más elementos el arreglo")
    }
}