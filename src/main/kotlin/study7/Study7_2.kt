package study7

fun main(args: Array<String>) {
    var first = 3
    var second = 5

    val max = if (first > second) first else second

    println("max : $max")

    val maxValue = if (max > second) {
        println("first 선택")
        first
    } else {
        println("second 선택")
        second
    }

    println(maxValue)


    var x = 2
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x is neither 1 nor 2")
    }


    println("가장 좋아하는 프로그래밍 언어는?")
    print("1. C\t")
    print("2. C++\t")
    print("3. C#\t")
    print("4. JAVA\t")
    print("5. Kotlin\n")

    val choice = (readLine() ?: "").toIntOrNull() ?: 0

    when (choice) {
        1, 2 -> println("c/c++")
        3 -> println("C#")
        4 -> println("java 선택")
        else -> println("kotlin")
    }


}