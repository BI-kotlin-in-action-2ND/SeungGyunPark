package kr.bi

//https://www.acmicpc.net/problem/1057

fun main() {
    val (n, jimin, hansu) = readln().split(" ").map { it.toInt() }

    val result = findRound(jimin, hansu)

    println(result)
}

fun findRound(jimin: Int, hansu: Int): Int {
    var round = 0

    var jiminRound = jimin
    var hansuRound = hansu

    while (jiminRound != hansuRound) {
        jiminRound = (jiminRound + 1) / 2
        hansuRound = (hansuRound + 1) / 2
        round++
    }

    return round
}