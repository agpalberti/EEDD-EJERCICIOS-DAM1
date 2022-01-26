fun notas(nota: Int) {
    when {
        nota < 5 -> println("Suspenso")
        nota in 5 until 7 -> println("Aprobado")
        nota in 7 until 9 -> println("Notable")
        nota in 9..10 -> println("Sobresaliente")
        else -> println("El valor introducido no es correcto.")
    }
}


fun main() {

    println("Cual es tu nota")
    var nota: Int
    try {
        nota = readLine()?.toInt() ?: 0
    } catch (_: Exception) {
        nota = 20
    }

    notas(nota)
}

