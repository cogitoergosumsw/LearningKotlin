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
    fun dropLoot(name: String) : Boolean {
        println("$name will be dropped")
        return inventory.removeIf {
            it.name == name
        }
    }

    fun showInventory() {
        println()
        println("$name's Inventory")
        println("================================")
        for (item in inventory) {
            println(item)
        }
        println("================================")
    }
}