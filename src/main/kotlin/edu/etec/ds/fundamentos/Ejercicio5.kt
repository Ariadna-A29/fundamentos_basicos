package edu.etec.ds.fundamentos

fun sumarHasta(norte: Int): Int {
    var suma = 0
    for (i in 1..norte){
        suma += norte
    }
    return suma
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin){
        if (i % 2 == 0)contador++
    }
    return contador
}

fun fibonacci(norte: Int): Int {
    if (norte <=1)return norte
    var a = 0
    var b = 1
    var resultado = 0

    for (i in 2..norte){
        resultado = a+b
        a=b
        b=resultado
    }
    return resultado
}

fun factorial(norte: Int): Int {
    var resultado = 1
    for (i in 1..norte){
        resultado *= norte
    }
    return resultado
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var max = numeros[0]
    for (num in numeros) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var min = numeros[0]
    for (num in numeros) {
        if (num > min) {
            min = num
        }
    }
    return min
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (n in numeros){
        suma += n
    }
   return suma
}

fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    val vocales ="aeiouAEIOU"
    return texto.count { it in vocales }
}

fun esPalindromo(texto: String): Boolean {
    val limpio =texto.replace(" ","").lowercase()
    return limpio==limpio.reversed()
}

fun tablaMultiplicar(numero: Int): List<Int> {
    return (1..10).map { it * numero}
}
