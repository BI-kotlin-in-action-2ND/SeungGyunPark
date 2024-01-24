package kr.bi

//https://www.acmicpc.net/problem/1032

fun main() {
    val n = readln().toInt()
    val names = Array(n) { readln() }
    val pattern = findPattern(names)

    println(pattern)
}

fun findPattern(names: Array<String>): String {
    val length = names[0].length
    var result = ""

    for (i in 0 until length) {
        val ch = names[0][i]

        if (names.all { it[i] == ch }) {
            result += ch
        } else {
            result += '?'
        }
    }

    return result
}
