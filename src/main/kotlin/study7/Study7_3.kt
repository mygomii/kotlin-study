package study7

fun main(args: Array<String>) {
    for (i in 1..2) {
        println("안녕")
    }

    for (i in 1..3) {
        println("반갑")
    }

    for (i in 1..5 step 2) {
        println("$i\t")
    }

    for (i in 5 downTo 1) {
        println("$i\t")
    }

    for (i in 1 until 5) {
        println("$i")
    }


    for ((index, value) in "Hello".withIndex()) {
        println("$index\t$value")
    }


    var n = 3
    var sum = 0
    for (i in 1..n) {
        sum = sum + i
    }

    println("1부터 $n 까지 합 $sum")
}