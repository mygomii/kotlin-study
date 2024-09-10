package study7

fun main(args: Array<String>) {
    val numbers = getNumbers()

    for (number in numbers) {
        when {
            number % 2 == 0 -> {
                println("${number}는 짝수입니다.")
            }

            else -> {
                println("${number}는 홀수입니다.")
                continue
            }
        }

        var count = number / 2
        while (count > 0) {
            println("$count")
            count--
        }
    }
}


fun getNumbers(): Array<Int> {
    val numbers = Array(5) { 0 }
    for (i in numbers.indices) {
        println("숫자를 입력하세요")
        numbers[i] = getNumber()
    }

    return numbers
}


fun getNumber(): Int {
    return try {
        readlnOrNull()?.toInt() ?: 0
    } catch (e: Exception) {
        println("숫자입력 고고")
        getNumber()
    }
}