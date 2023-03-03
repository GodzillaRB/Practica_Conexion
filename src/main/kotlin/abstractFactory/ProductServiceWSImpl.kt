package abstractFactory

class ProductServiceWSImpl: IProductService {

    private val products = listOf("SOA-Refresco", "SOA-Jugo", "SOA-Fruta")

    override fun getProduct(): List<String> {
        return this.products
    }
}