package edu.etec.ds.fundamentos

fun obtenerDiaSemana(dia: Int): String {
    return when(dia){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia invalido"
    }
    TODO("Usar when para retornar el nombre del dia (1=Lunes, 7=Domingo)")
}

fun obtenerNombreMes(mes: Int): String {
    return when(mes){
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes invalido"
    }
}

fun clasificarNumeroWhen(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}

fun clasificarEdad(edad: Int): String {
    return when{
        edad < 3 -> "Bebe"
        edad in 3..12 -> "Nino"
        edad in 13..17 -> "Adolescente"
        edad in 18..65 -> "Adulto"
        else -> "Anciano"
    }
}

fun convertirMoneda(moneda: String, monto: Double): Double {
    return when(moneda.uppercase()){
        "USD" -> monto*1.85
        "EUR" -> monto*18.0
        "JPY" -> monto*0.10
        else -> 0.0
    }
}

fun realizarOperacion(operador: Char, a: Int, b: Int): Double {
    TODO("Usar when para realizar + - * / %. Division por cero retorna 0.0")
}

fun obtenerDescuentoWhen(monto: Double): Double {
    return when{
        monto > 200 -> monto*0.25
        monto > 150 -> monto*0.15
        monto > 100 -> monto*0.10
        else -> 0.0
    }
    TODO("Usar when como expresion: >200 -> 25%, >150 -> 15%, >100 -> 10%, else 0%")
}

fun obtenerCalificacion(nota: Int): String {
    return when{
        nota >=90 ->"Promocionado"
        nota >=60 ->"Aprobado"
        else -> "Desaprobado"
    }
    TODO("Usar when con rangos: >=90 Promocionado, >=60 Aprobado, else Desaprobado")
}

fun esVocal(caracter: Char): Boolean {
    return carácter.lowercasseChar() in listOf('a','e','i','o','u')
    TODO("Usar when para verificar si es vocal (a, e, i, o, u mayusculas y minusculas)")
}

fun esPrimo(numero: Int): Boolean {
    if(numero <1)return false
    for(i in 2 until numero){
        if (numero % i == 0)return false
    }
    return true
    TODO("Usar when para determinar si un numero es primo (mayor a 1 divisible solo por 1 y si mismo)")
}
