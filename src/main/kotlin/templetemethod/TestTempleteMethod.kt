package templetemethod

import java.io.File

fun main(){
    val logDir = "/home/jorgealavez/templatemethod/logs"
    val processDir = "/home/jorgealavez/templatemethod/process"
    val files = arrayOf("/home/ajorgealavez/templatemethod/abc.drug",
        "/home/jorgealavez/templatemethod/123.grys" )
    println("> Monitoring start")

    val fileDrug = File(files[0])

    DrugstoreFileProcess(fileDrug, logDir, processDir).execute()

    println("File processed  > " + fileDrug.name)

    val fileGry = File(files[1])
    GroceryFileProcess(fileGry, logDir, processDir).execute()
    println("File processed  > " + fileGry.name)

}