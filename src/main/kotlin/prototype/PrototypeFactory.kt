package prototype

class PrototypeFactory {
    private val prototypes = HashMap<String, IPrototype<PriceList>>()

    fun getPrototype(prototypeName: String): IPrototype<PriceList> {
        return prototypes[prototypeName]!!.deepClone()
    }

    fun addPrototype(prototypeName: String, prototype: IPrototype<PriceList>) {
        prototypes[prototypeName] = prototype
    }
}