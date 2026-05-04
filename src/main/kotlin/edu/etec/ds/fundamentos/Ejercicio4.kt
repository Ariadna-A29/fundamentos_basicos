package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    return if (numero > 0) "Positivo" else "No positivo"
}

fun clasificarNumero(numero: Int): String {
    return when{
        numero > 10 -> "Mayor a 10"
        numero < 10 -> "Menor a 10"
        else -> "Igual a 10"
    }
}

fun evaluarEdad(edad: Int): String {
    return when{
        edad < 18 -> "Menor de edad"
        edad <= 65 -> "Adulto"
        else -> "Adulto mayor"
    }
}

fun obtenerDescuento(monto: Double): Double {
    return when{
        monto >= 200 -> 0.30
        monto >= 150 -> 0.20
        monto >= 100 -> 0.10
        else -> 0.0
    }
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    return when(operador){
        '+' -> (a+b).toDouble()
        '-' -> (a-b).toDouble()
        '*' -> (b-a).toDouble()
        '/' -> (a/b).toDouble()
        else -> 0.0
    }
}

