package study5

fun main(args: Array<String>) {
    var min: Int = -2147483648 // 정수형이 가질수 있는 가장 작은값
    var max: Int = +2147483647 // 정수형이 가질수 있는 가장 큰 값

    println("min: $min,  max: $max")

    var PI: Double = 3.141592
    println("PI: $PI")

    var i: Int = 1000
    var b: Byte = 127
    var s: Short = 1234
    var l: Long = 1234L
    var f: Float = 3.14F
    var d: Double = 3.14

    var ii: Int = 1234
    var ll: Long = ii.toLong()

    println("ii: $ii, ll: $ll")

    val dbl = 12.34
    var iii: Int = dbl.toInt()

    println("dbl: $dbl")
    println("iii: $iii")


}