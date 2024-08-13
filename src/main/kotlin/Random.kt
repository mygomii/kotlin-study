import java.util.*

fun main(args: Array<String>) {
    var i = 5

//    val result = if (i > 10) true else false -> 이런 방식은 가독성때문에 사용하지않음

    val items = listOf(1, 2, 3, 4, 5)

    for (item in items) {
        println(item)
    }

    println("====================================")

    items.forEach {
        println(it)
    }

    println("====================================")

    for (i in 0..items.size) {
        println(i)
    }

    println("====================================")


    val items2 = mutableListOf(1, 2, 3, 4, 5)
    items2.add(6)
    items2.remove(3)

    items2.forEach {
        println("##### $it")
    }

    println("====================================")

    val items3 = arrayOf(1, 2, 3)
    items3[2] = 10

    items3.forEach {
        println("####### $it")
    }

    try {
        val item = items3[4]
        println(item)
    } catch (e: Exception) {
        println("### e: ${e.message}")
    }


    println("====================================")

    var name: String? = null
//    name = "준석"
//    println(name)

//    name = null

    var name2: String? = ""

    name2 = name!! // <- 느낌표를 사용할때는 잘 사용하기 막 쓰면 안된다.

    name?.let {
        print(it)
    } ?: "이름없다"

}


