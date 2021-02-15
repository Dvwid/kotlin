abstract class Product {
    abstract val category: Category
    abstract val description: Description

    abstract fun isNotAvailable():String
    abstract fun sale(value: Int):String



}