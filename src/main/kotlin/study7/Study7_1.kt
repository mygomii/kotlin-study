package study7

fun main(args: Array<String>) {
    var score = 60

    // score 60 이상이면 '합격' 출력
    if (score >= 60) {
        println("합격")
    }

    var x = 10
    if (x == 10) {
        println("x는 $x 입니다.")
    }

    if (x != 20) {
        println("x는 20 아니다")
    }

    var s1 = "hello"
    var s2 = "hello"

    if (s1 == s2) {
        println("same")
    }

    if (s1.equals(s2)) {
        println("name")
    }

    var bin: Boolean = false

    if (!bin) {
        println("bin: false -> ! -> true")
    }

}