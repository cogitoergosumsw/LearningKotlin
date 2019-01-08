/**
 * Project Name: KotlinTutorial
 * Created by sengwee on 8/1/19.
 */
class VampyreKing(name: String): Vampyre(name) {
    init { // sort of a constructor
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}