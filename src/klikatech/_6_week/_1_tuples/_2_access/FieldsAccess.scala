package klikatech._6_week._1_tuples._2_access

object FieldsAccess extends App {

    val person = ("Name", 30) // <- case class Tuple2(val name: String, val age: Int)

    //person._1 = "Mark"

    val mark = person.copy(_1 = "Mark")
    println("Mark -> " + mark)

    val ivan = person.copy(_1 = "Ivan", _2 = 45)
    println("Ivan -> " + ivan)
}
