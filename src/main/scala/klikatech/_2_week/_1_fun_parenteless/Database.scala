package klikatech._2_week._1_fun_parenteless

/*
    This supports the "uniform access principle",
    which enables the _def_ to be changed into a _val_ without requiring a change to client code.
*/
trait Database {
    def table(): String = "null"
    def database(): String // abstract method
}

class MyDatabase extends Database {
    override val table: String = "my_table"
    override val database: String = "my_database" // vs def database() = "text"
}

object Main extends App {
    val d = new MyDatabase()
    println("Table name: " + d.table)
    println("Database name: " + d.database)
}
