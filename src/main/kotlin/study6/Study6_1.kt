package study6

fun main(args: Array<String>) {
    println(3 + 5)
    println(3 - 5)
    println(3 * 5)
    println(3 / 5)

    var i = 100
    var j = 200

    println("처음 $i, $j")

    var temp: Int = i
    i = j
    j = temp

    println("변경 $i, $j")

    var number = 10
    number = number - 1
    println(number)

}