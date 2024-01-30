package kr.bi

//https://www.acmicpc.net/problem/19637

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val style = Array(n) {
        val (name, value) = readln().split(" ")
        name to value.toInt()
    }.sortedBy { it.second }

    val powers = Array(m) { readln().toInt() }

    for (power in powers) {
        println(biSearch(style, power))
    }
}

fun biSearch(
    style: List<Pair<String, Int>>,
    power: Int,
): String{

    var right = style.size
    var left = 0
    var result = 0

    while (left <= right) {
        val mid = (left + right) / 2
        if (style[mid].second >= power) {
            result = mid
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return style[result].first
}
