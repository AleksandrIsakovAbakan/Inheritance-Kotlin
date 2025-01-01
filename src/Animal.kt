open class Animal {

    var name = ""
    var weight = 0

    fun animalEats() = println("Animal eats")

    override fun toString(): String {
        return "${javaClass.name}(name='$name', weight=$weight)"
    }
}