package templetemethod

object OnMemoryDataBase {
    val PROCESS_DOCUMENTS = HashMap<String, String>()
    val CUSTOMERS = intArrayOf(
        1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 20, 30, 40, 50, 60, 70, 80, 90, 100
    )

    fun getFileStatus(fileName: String): String? {
        return PROCESS_DOCUMENTS[fileName]
    }

    fun setProcessFile(fileName: String) {
        PROCESS_DOCUMENTS[fileName] = "Procesado"
    }

    fun customerExist(id: Int): Boolean {
        for (i in CUSTOMERS) {
            if (i == id) {
                return true
            }
        }
        return false
    }
}