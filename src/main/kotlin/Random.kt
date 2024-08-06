import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val names = mutableListOf<String>()

    println("이름 입력 고고")

    while (true) {
        val name = scanner.nextLine()

        if (name.isBlank()) {
            break
        }
        names.add(name)
    }

    println("result: ${names.randomOrNull() ?: "없음"}")
}