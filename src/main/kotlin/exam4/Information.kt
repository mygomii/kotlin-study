package exam4

interface Information {
    fun introduce(name: String, age: Int) {
        println("이름: $name\n나이:$age")
    }
}