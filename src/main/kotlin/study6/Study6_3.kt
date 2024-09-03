package study6

fun main(args: Array<String>) {
    var x = 3
    var y = 5

    println(x == y) // false
    println(x != y) // true
    println(x > y)  // false
    println(x >= y) // false
    println(x < y) // true
    println(x <= y) // true

    println(true && false) // true
    println(true && true) // false

    println(false || true) // ture 하나라도 참이면 참
    println(false || false) // false // 둘다 거짓이면 거짓

    println(!true) // false
    println(!false) // true


    var i = 3
    var j = 5
    var r = false

    r = (i == 3) && (j != 3) // true && ture => true
    println(r)

    r  = (i != 3) || (j == 3) // false || false -> false
    println(r)

}