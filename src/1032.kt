package kr.bi

//https://www.acmicpc.net/problem/1032

fun main() {
    val n = readln().toInt()
    val names = List(n) { readln() }
    val pattern = findPattern(names)

    println(pattern)
}

fun findPattern(names: List<String>): String {
    val length = names[0].length
    val result = StringBuilder()

    for (i in 0 until length) {
        val ch = names[0][i]

        if (names.all { it[i] == ch }) {
            result.append(ch)
        } else {
            result.append('?')
        }
    }

    return result.toString()
}