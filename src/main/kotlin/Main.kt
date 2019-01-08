fun main(args: Array<String>) {
    /*
    Part 7
    1. Loops Revisited
    */

//    for (i in 1..10) {
//    val dracula = VampyreKing("Dracula")
//    println(dracula)
//
//    dracula.lives = 0
//    do {
//        if (dracula.dodges()) {
//            dracula.lives += 1
//            continue
//        }
//        if (dracula.runAway()) {
//            println("Dracula ran away!")
//            break
//        } else {
//            dracula.takeDamage(80)
//        }
//    } while (dracula.lives > 0)
//    println("+++++++++++++++++++++++++++++++++++")
//    }

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOUR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
//    conan.getLoot(Loot("Cursed Shield", LootType.ARMOUR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOUR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.ARMOUR, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    val dropped = conan.dropLoot("NIL")
    println(dropped)
    /*
    Part 6
    1. Inheritance
    */
//    val enemy = Enemy("Test Enemy", 10, 3)
//    println(enemy)
//
//    enemy.takeDamage(4)
//    println(enemy)
//
//    enemy.takeDamage(11)
//    println(enemy)

//    val uglyTroll = Troll("Ugly Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//    val vlad = Vampyre("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    val dracula = VampyreKing("Dracula")
//    println(dracula)
//    while (dracula.lives > 0) {
//        if (dracula.dodges()) {
//            continue
//        }
//        if (dracula.runAway()) {
//            println("Dracula ran away!")
//            break
//        } else {
//            dracula.takeDamage(12)
//        }
//    }

    /*
    Part 5
    1. Encapsulation
    */
//    val sw = Player(name = "Seng Wee")
//    sw.show()
//
//    val huat = Player(name = "Ah Huat")
//    huat.level = 99
//
//    val seng = Player(name = "Ah Seng", lives = 9, level = 7)
//    seng.weapon = Weapon("Sword", 100)
//    seng.show()
//
//    huat.weapon = seng.weapon
//    huat.show()
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 10.0)
//    seng.getLoot(redPotion)
//    val chestArmour = Loot("+3 Chest Armour", LootType.ARMOUR, 99.0)
//    seng.getLoot(chestArmour)
//    seng.getLoot(Loot("Ring of Protection", LootType.RING, 45.0))
//    seng.getLoot(Loot("Invisibility Potion", LootType.POTION, 30.0))
//    seng.showInventory()
//
//    if (seng.dropLoot(redPotion)) {
//        seng.showInventory()
//    } else {
//        println("You don't have a ${redPotion.name}")
//    }
//
//    val bluePotion = Loot("Blue Potion", LootType.POTION, 42.0)
//    if (seng.dropLoot(bluePotion)) {
//        seng.showInventory()
//    } else {
//        println("You don't have ${bluePotion.name}")
//    }
//    if (seng.dropLoot("Invisibility Potion")) {
//        seng.showInventory()
//    } else {
//        println("You don't have an Invisibility Potion!")
//    }

//    println(seng)

    /*
    Part 4
    1. For Loops
    */
//    println("================================")
//    for (i in 0..10) { // last value is included
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//    for (i in 0 until 10) { // last value is NOT included
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//    for (i in 10 downTo 0) { // count downwards
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//
//    for (value in 3..100 step 3) {
//        if (value % 5 == 0) {
//            println(value)
//        }
//    }

    /*
    Part 3
    1. Classes
    2. Objects and Instances
    3. toString
    */
//    val sw = Player(name = "Seng Wee")
//    sw.show()
//
//    val huat = Player(name = "Ah Huat")
//    huat.level = 99
//
//    val seng = Player(name = "Ah Seng", lives = 9, level = 7)
//    seng.weapon = Weapon("Sword", 100)
//    seng.show()
//
//    huat.weapon = seng.weapon
//    huat.show()
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 10.0)
//    seng.inventory.add(redPotion)
//    val chestArmour = Loot("+3 Chest Armour", LootType.ARMOUR, 99.0)
//    seng.inventory.add(chestArmour)
//    seng.inventory.add(Loot("Ring of Protection", LootType.RING, 45.0))
//    seng.inventory.add(Loot("Invisibility Potion", LootType.POTION, 30.0))
//    seng.showInventory()
//    println(seng)

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