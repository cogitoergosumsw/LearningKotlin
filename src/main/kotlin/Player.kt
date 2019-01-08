// primary constructor - val name
class Player(val name: String, var level: Int = 1, var lives: Int = 7, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            Player Name: $name
            No. of lives: $lives
            Level: $level
            Score: $score
            Weapon Name: ${weapon.name.toUpperCase()}
            Damage Inflicted: ${weapon.damageInflicted}
            """
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    // new stuff
//    fun dropLoot(name: String) : Boolean {
//        for (item in inventory) {
//            if (item.name == name) {
//                println("$name will be dropped")
//                inventory.remove(item)
//                return true
//            }
//        }
//        return false
//    }

    fun dropLoot(name: String): Boolean {
        var result = false
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                result = true
                break
            }
        }
        return result
    }

    fun showInventory() {
        println()
        var total = 0.0
        println("$name's Inventory")
        println("================================")
        for (item in inventory) {
            println(item)
            total += item.value
        }
        println("================================")
        println("Total Value: $total")
        println("================================")
    }
}