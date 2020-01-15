package com.aescolar.stringcalculator


val delimiters = arrayOf(",", "\n")

fun calculateString(str: String): Int {
    if (str.isBlank()) return 0

    val values = str.split(*delimiters)

    return values.map { it.toInt() }.sum()
}
