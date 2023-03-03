import factorymethod.IDBAdapter
import factorymethod.MySqlDBAdapter
import factorymethod.OracleDBAdapter
import factorymethod.PostgresqlDBAdapter
import properties.PropertiesUtil
import java.util.*

fun main() {

    val property: Properties? = PropertiesUtil
        .loadProperty("properties/DBMySQL")
    println(property)
    val mySql: IDBAdapter = MySqlDBAdapter()
    println(mySql.getConnection().toString())

    val oracle: IDBAdapter = OracleDBAdapter()
    println(oracle.getConnection().toString())

    val postgres: IDBAdapter = PostgresqlDBAdapter()
    println(postgres.getConnection().toString())
}

