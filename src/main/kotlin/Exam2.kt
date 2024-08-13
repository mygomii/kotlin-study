import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("사람 몇명?")

    val numberOfStudents = scanner.nextInt()
    val scores = mutableListOf<Int>()

    for (i in 0..numberOfStudents) {
        println("${i + 1}번째 점수 입력")
        val score = scanner.nextInt()
        scores.add(score)
    }

    val average = scores.average()
    println("평균: $average")
}