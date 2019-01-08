// primary constructor - val name
class Player(val name: String, var level: Int = 1, var lives: Int = 7, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)

    fun show() {
        println("""
            Player Name: $name
            No. of lives: $lives
            Level: $level
            Score: $score
            """)
    }
}