
inline fun <reified T> mezclarVectores(vector1:Array<T>, vector2: Array<T>):Array<Array<T>>{
    val array = Array<Array<T>>(2){ emptyArray() }
    array[0] = vector1
    array[1] = vector2
    return array
}

fun introducirPosiciones():Int{
    val int:Int
    try{
        int = readLine()?.toInt() ?:0
        return int
    } catch (_:Exception){
        return 0
    }
}

fun creaArray(coeficiente:Int,size:Int):Array<Int> = Array<Int>(size) { i -> 2 * i + coeficiente }


fun main() {

    val c1 = 5
    val c2 = 4

    println("Introduce el número de posiciones del primer vector.")
    val posv1 = introducirPosiciones()
    println("Introduce el número de posicione del segundo vector.")
    val posv2= introducirPosiciones()

    val v1 = creaArray(c1,posv1)
    val v2 = creaArray(c2, posv2)

    val matriz = mezclarVectores(v1,v2)

    println("Tu matriz está compuesta de la siguiente forma:")

    val linea = ""

    linea.let {  }

}
