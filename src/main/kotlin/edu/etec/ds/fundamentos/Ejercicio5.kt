package edu.etec.ds.fundamentos

fun sumarHasta(norte: Int): Int {
    var suma = 0
    for (i in 1..norte){
        suma +=¡
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
        resultado *=¡
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
    for (i in numeros){
        if (n < min) min = n
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
    var contador = 0
    val vocales ="aeiouAEIOU"
    for(c in texto){
        if (c in vocales)contador++
    }
    return contador
}

fun esPalindromo(texto: String): Boolean {
    val limpio =texto.replace(" ","").lowercase()
    return limpio==limpio.reversed()
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val lista = mutableListOf<Int>(
        for (i in 1..10){
            lista.add(numero*¡)
        }
        return lista
    )
}
