// === Belajar Function ===
//fun main() {
//    variabel yang tidak dapat diubah
//    val message = "Hello Lukman"
//    println(message)

//    variabel yang dapat diubah
//    var name = "Joe"
//    name = "Lisa"
//    println(name)
//}

// === Belajar Data Types ===
//fun main () {
//    var name: String = "My age is "
//    var age : Int = 38
//    print(name + age)
//}

// === Belajar Control Flow (If dan Else) ===
//fun main() {
//    val minAge: Int = 13
//    val joeAge: Int = 12 //age of joe
//
//    if (joeAge < minAge) {
//        print("Joe accepted")
//    } else {
//        print("Joe rejected")
//    }
//}

// === Belajar Control Flow (when) ===
//fun main () {
//    val joeLevel: String = "beginner"
//
//    when (joeLevel) {
//        "beginner" -> print("Joe has basic skill")
//        "medium" -> print("Joe has a intermediate skill")
//        "hard" -> print("Joe is an expert")
//        else -> print("Joe has no skill")
//    }
//}

// === Belajar Control Flow (Looping) ==
//fun main () {
//    for (x in 1 .. 10 step 2) println(x)
//}

// === Belajar Collection ===
//fun main () {
//
//x    val names = arrayOf("Joe", "Anna", "Lisa")
//x    for (name in names) println(name)
//
//    val nameList = ArrayList<String>()
//    nameList.add("Joe")
//    nameList.add("Anna")
//    nameList.add("Lisa")
//    for (name in nameList) println(name)
//}

// === Belajar Data Class ===

//fun main () {
//    val personList = ArrayList<Person>()
//    for (x in 0 until nameList().size) {
//        val person = Person(nameList()[x], age = 20 + x)
//        personList.add(person)
//    }
//    print(personList.toString())
//}
//
//data class Person(var name: String, var age: Int)
//
//fun nameList(): ArrayList<String> {
//    val names = ArrayList<String>()
//    names.add("Joe")
//    names.add("Anna")
//    names.add("Lisa")
//    names.add("Mark")
//    return names
//
//}

// === Belajar Class Cart ===
//fun main () {
//
//    val cart = Cart("Laptop Asus")
//    cart.addToCart()
//
//}
//
//class Cart (var inputProduct: String) {
//    var product = "Laptop"
//
//    fun addToCart() {
//        println("$inputProduct added to cart!")
//    }
//}

// === Belajar Init ===
//fun main () {
//    val cart = Cart()
//}
//
//class Cart () {
//    var product = "Laptop"
//
//    fun addToCart(){
//        println("$product added to cart!")
//    }
//
//    init {
//        addToCart()
//    }
//}

// === Belajar Object Declaration ===
//fun main () {
//    Student.goToSchool()
//
//}
//
//object Student {
//    var name = "Lukman"
//
//    fun goToSchool() {
//        println("$name is going to school")
//    }
//}

// === Belajar Interface ===
fun main () {
    val button = Button()
    button.onTouch()
}

class Button: ButtonInterface {
    override var buttonName: String = "Login"

    override fun onClick() {
        println("$buttonName clicked")
    }

    override fun onTouch() {
        println("$buttonName touched")
    }

}

interface ButtonInterface {

    var buttonName: String
    fun onClick()
    fun onTouch()
}