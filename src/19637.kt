package kr.bi

//https://www.acmicpc.net/problem/19637

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val style = List(n) {
        val (name, value) = readln().split(" ")
        name to value.toInt()
    }.sortedBy { it.second }

    val powers = Array(m) { readln().toInt() }

    for (power in powers) {
        val index = style.indexOfFirst { it.second >= power }
        println(style[index].first)
    }
}
