package abstractFactory

class ProductServiceRestImpl: IProductService {

    private val products = listOf("REST-Teclado", "REST-Mouse", "REST-Monitor")

    override fun getProduct(): List<String> {
        return this.products
    }
}