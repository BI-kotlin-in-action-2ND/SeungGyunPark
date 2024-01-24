package kr.bi

//https://www.acmicpc.net/problem/1748

fun main() {
    val n = readln().toInt()

    val result = countNum(n)
    println(result)
}

fun countNum(n: Int): Int {
    var count = 0
    var current = 1
    var length = 1

    while (current * 10 <= n) {
        count += length * 9 * current
        current *= 10
        length++
    }

    count += length * (n - current + 1)

    return count
}
