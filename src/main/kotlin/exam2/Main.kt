/*
fun main(args: Array<String>) {
    val john = Person("John", 20)
    val john2 = Person("John", 20)

    println(john)
    println(john)
    println(john == john2)
    println(john.hobby)
}

data class Person(
    val name: String,
    var age: Int
) {
    var hobby = "축구"
        private set
        get() = "취미 :$field"

    init {
        println("init")
    }

    fun some() {
        hobby = "농구"
    }
}

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable {
    override fun move() {
        super.move()
        println("멍멍")
    }

    override fun draw() {
        println("그린다다다다")
    }
}

class Cat : Animal() {
    override fun move() {
        super.move()
        println("야옹")
    }
}

interface Drawable {
    fun draw()
}

*/
