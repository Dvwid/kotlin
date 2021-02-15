class Apple(override val category: Category, override val description: Description) : Product() {
    override fun sale(value: Int):String {
        return "Special offer! Buy now this product $value% less"
    }

    override fun isNotAvailable():String {
        return "Sorry but this product is not Available :("
    }
}