fun main(){
    val Product1 = Apple(Category("Phones"), Description("Iphone 11", 3200))
    val Product2 = Apple(Category("Notebooks"), Description("MacBook Air", 3600))
    val Product3 = Samsung(Category("Watches"), Description("Galaxy Watch", 1900))

    println("-------------------------------------------------")
    println("Producent: ${Product1.javaClass.name}")
    println(Product1.category.info())
    println(Product1.description.showProductName())
    println("${Product1.description.showProductPrice()} PLN")
    //println(Product1.sale(10))
    println("-------------------------------------------------")

    println("Producent: ${Product2.javaClass.name}")
    println(Product2.category.info())
    println(Product2.description.showProductName())
    println("${Product2.description.showProductPrice()} PLN")
    //println(Product1.sale(10))
    println("-------------------------------------------------")

    println("Producent: ${Product3.javaClass.name}")
    println(Product3.category.info())
    println(Product3.description.showProductName())
    println("${Product3.description.showProductPrice()} PLN")
    println(Product1.sale(10))
    println("-------------------------------------------------")

}