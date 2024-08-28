package study5

import java.util.*

fun main(args: Array<String>) {
//    println(readLine())

    println("이름 입력 ㄱㄱ")
    var name = readLine()
    println("안녕하세요 : $name")


    println("나이 입력ㄱ")
    val tempInt = readlnOrNull()?.toInt()
    val intAge: Int = tempInt ?: 0

    println("당신의 나이는? $intAge")

    println("몸무게 ㄱㄱ")
    val input = readLine() ?: ""
    val weight: Double = input.toDoubleOrNull() ?: 0.0
    println("당신의 몸무게는 : $weight")


    val scanner = Scanner(System.`in`)
    println("정수 :")
    val number = scanner.nextInt()

    println("실수: ")
    val real = scanner.nextDouble()

    println("$number, $real")
}