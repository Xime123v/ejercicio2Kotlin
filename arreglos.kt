fun main() {
    val arreglo: Array<String> = arrayOf("Luis","Maria jose","Fernando")
    val array = arrayOf("Luis","Maria jose","Fernando")
    println( arreglo.joinToString())


    for (i in arreglo.indices){
        println("[$i, ${arreglo[i]}")
    }


        for(c in "Jimena"){
            println(c)
        }

    val negativeNumbers = Array(10) { -(it + 1) }
     println(negativeNumbers.joinToString())


    /*var array2 = doubleArrayOf(1.1,2.2,3.3,4.4,5.5)
    println(array2.joinToString())*/
}