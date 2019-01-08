/**
 * Project Name: KotlinTutorial
 * Created by sengwee on 8/1/19.
 */
open class Vampyre(name: String): Enemy(name,20,3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}