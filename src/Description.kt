class Description(val productName: String, var productPrice: Int) {

    fun showProductName():String{
        return "Product name: $productName"
    }

    fun showProductPrice():String{
        return "Product price: $productPrice"
    }

}