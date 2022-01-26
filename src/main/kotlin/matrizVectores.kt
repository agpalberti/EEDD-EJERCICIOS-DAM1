/*
* Fecha: 26/01/2022
* Versión 1.0
* Autor: Alejandro González Parra
* Empresa/Entidad: IES Rafael Alberti
* Proyecto: Funciones para trabajar con matrices.
* */



inline fun <reified T> mezclarVectores(vector1: Array<T>, vector2: Array<T>): Array<Array<T>> {
    val array = Array<Array<T>>(2) { emptyArray() }
    array[0] = vector1
    array[1] = vector2
    return array
}

fun introducirPosiciones(): Int {
    val int: Int
    try {
        int = readLine()?.toInt() ?: 0
        return int
    } catch (_: Exception) {
        return -1
    }
}

fun creaArray(coeficiente: Int, size: Int): Array<Int> = Array<Int>(size) { i -> 2 * i + coeficiente }

fun <T> matrizToString(array: Array<Array<T>>): String {
    var string = ""

    array.forEach { string += "_"; it.forEach { element -> string += (element.toString() + " - ") } }
    val stringList: List<String>
    string.split("_").let { stringList = it.subList(1, it.size) }; string = ""
    val fixedStringList: MutableList<String> = mutableListOf()
    stringList.forEach { fixedStringList.add(it.removeRange(it.length - 3, it.length)) }
    fixedStringList.forEach { string += it + "_" }
    string = string.removeRange(string.length - 1, string.length)
    string = string.replace("_", "\n")
    return string
}


fun main() {

    val c1 = 5
    val c2 = 4

    println("Introduce el número de posiciones del primer vector.")
    val posv1 = introducirPosiciones()
    println("Introduce el número de posicione del segundo vector.")
    val posv2 = introducirPosiciones()

    if (posv1 > 0 && posv2 > 0) {
        val v1 = creaArray(c1, posv1)
        val v2 = creaArray(c2, posv2)

        val matriz = mezclarVectores(v1, v2)

        println("Tu matriz está compuesta de la siguiente forma:")
        println(matrizToString(matriz))

    } else println("Se ha introducido las posiciones de forma incorrecta. Deben ser mínimo 1.")

}