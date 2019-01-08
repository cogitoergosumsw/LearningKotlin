fun main(args: Array<String>) {
    /*
    Part 3
    Classes
    */
    val sw = Player(name = "Seng Wee")
    sw.show()

    val huat = Player(name = "Ah Huat")
    huat.level = 99

    val seng = Player(name = "Ah Seng", lives = 9, level = 7)
    seng.weapon = Weapon("Sword", 100)
    seng.show()

    huat.weapon = seng.weapon
    huat.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 10.0)
    seng.inventory.add(redPotion)
    seng.showInventory()
    println(seng)
    /*
    Part 2
    1. Conditions
    */
//    val lives = 3
//    var isGameOver = lives < 1
//
//    if (isGameOver) {
//        println("Game Over!")
//    } else {
//        println("Stil ALIVE!")
//    }

//    println("How old are you: ")
//    val age = readLine()!!.toInt()
//    println("Your age is $age.")
//
//    val message: String
//    message = when {
//        age < 21 -> "You are too young to vote!"
//        age >= 100 -> "Congratulations! You are a centenarian, you are eligible to vote!"
//        else -> "You are eligible to vote in the next General Elections!"
//    }

//    message = if (age < 21) {
//        "You are too young to vote!"
//    } else if (age >= 100) {
//        "Congratulations! You are a centenarian, you are eligible to vote!"
//    } else {
//        "You are eligible to vote in the next General Elections!"
//    }

//    println(message)

    /*
    Part 1
    1. Variables and Types
    2. String Concatenation & String Interpolation
    3. val vs var
    */
//    println("Hello World")
//    println("My first Kotlin program")
//
//    val sw: String
//    sw = "Seng Wee"
//    println(sw)
//    println()
//    // val vs var - val variables are immutable while var variables are mutable.
//
//    var salary: Int = 100000
//    var annualSalary: Int = salary * 12
//    println("My annual salary is $" + annualSalary + ".") //String concatenation
//
//    println("My name is $sw.") // String interpolation
//
//    var daysInWeek : Int = 7
//    println("Number of week(s) in $daysInWeek days is ${daysInWeek / 7}.")
}