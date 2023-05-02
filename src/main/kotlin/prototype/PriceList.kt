package prototype

data class PriceList(val listName: String?, val products: List<ProductItem>?) : IPrototype<PriceList> {

    override fun clone(): Any {
        return PriceList(listName = listName, products = this.products)

    }

    override fun deepClone(): PriceList {
        val cloneProducts: MutableList<ProductItem> = ArrayList()
        for (item in products!!) {
            val cloneItem: ProductItem = item.clone() as ProductItem
            cloneProducts.add(cloneItem)
        }
        return PriceList(listName, products = cloneProducts)
    }
}