/*
* Fecha: 26/01/2022
* Versión 1.0
* Autor: Alejandro González Parra
* Empresa/Entidad: IES Rafael Alberti
* Proyecto: Un array de numerous randoms con una fun main para testing.
* */


fun main(){
    val arrayRandom = Array(20){ (1..1000).random() }

    println("Imprimimos los números pares del array.")
    arrayRandom.forEach { if ((it % 2) == 0 ) println(it) }
    val sortedArray = arrayRandom.sortedArray()
    println("Ordenamos el array e imprimimos el primer elemento de este:${sortedArray.first()}")
    println("El último elemento del array: ${sortedArray.last()}")
    println("La suma de todos los elementos del array da: ${sortedArray.sum()}")
    sortedArray.forEach { if ((it % 2) != 0) { sortedArray[sortedArray.indexOf(it)] = -1 } }
    println("Imprimimos los elementos restantes del array tras borrar todos los elementos impares.")
    sortedArray.forEach { if (it != -1) { println(it) } }
}