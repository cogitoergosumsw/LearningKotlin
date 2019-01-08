enum class LootType {
    POTION, RING, ARMOUR
}
class Loot(val name: String, val type: LootType, val value: Double) {
    override fun toString(): String {
        return "Loot is $name of type: $type and is worth $value"
    }
}