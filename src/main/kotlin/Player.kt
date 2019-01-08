// primary constructor - val name
class Player(val name: String, var level: Int = 1, var lives: Int = 7, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

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