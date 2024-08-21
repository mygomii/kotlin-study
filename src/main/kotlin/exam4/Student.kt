package exam4

open class Student(
    private val major: String
) {
    fun introduceMajor() {
        println("전공: $major")
    }
}

