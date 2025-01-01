open class IPhone : Smartphone() {

    var style = true

    override fun toString(): String {
        return "${javaClass.name}(screen diagonal=$screenDiagonal, screen resolution=$screenResolution, weight=$weight, style=$style)"
    }


}