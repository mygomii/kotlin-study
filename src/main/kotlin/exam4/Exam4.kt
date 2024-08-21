package exam4

fun main(args: Array<String>) {
    val name = getName()
    val age = getAge()
    val major = getMajor()

    println("===============================")

    val student = Student(major)
    val person = Person()

    person.introduce(name, age)
    student.introduceMajor()
}

fun getName(): String {
    return input("이름")
}

fun getMajor(): String {
    return input("전공")
}

fun getAge(): Int {
    val age = input("나이")

    return try {
        age.toInt()
    } catch (e: NumberFormatException) {
        println("숫자를 입력하세요")
        getAge()
    }
}

fun input(inputInfo: String): String {
    print("$inputInfo: ")
    val readIn = readln()

    if (readIn.isEmpty()) {
        input(inputInfo)
    }

    return readIn
}

