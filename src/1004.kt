package kr.bi

import kotlin.math.pow
import kotlin.math.sqrt

//https://www.acmicpc.net/problem/1004

fun main() {
    val t = readln().toInt()
    val result = mutableListOf<Int>()

    repeat(t) {
        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }
        val n = readln().toInt()
        var count = 0

        repeat(n) {
            val (cx, cy, cr) = readln().split(" ").map { it.toInt() }
            val dis1 = calculateDistance(x1, y1, cx, cy)
            val dis2 = calculateDistance(x2, y2, cx, cy)

            if (cr > dis1 && cr > dis2) {
                // 원의 중심에서 출발,도착지점까지 거리보다 반지름이 크면 진입또는 이탈하지 않는다.
            } else if ((cr > dis1) xor (cr > dis2)) {
                count += 1
            }

            result += count
        }
    }

    repeat(t) {
        println(result[it])
    }
}

fun calculateDistance(
    x1:Int,
    y1:Int,
    x2:Int,
    y2:Int,
) : Double {
    return sqrt((x1 - x2).toDouble().pow(2) + (y1 - y2).toDouble().pow(2))
}
