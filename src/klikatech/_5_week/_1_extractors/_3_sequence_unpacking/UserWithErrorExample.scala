package klikatech._5_week._1_extractors._3_sequence_unpacking

object UserWithErrorExample extends App {

    case class User(name: String, age: Int)

    val someUser = User("Mark", 45)

    val User(name, age) = someUser

    println(s"name: $name, age: $age")

    def scores: List[Int] = Nil

    //val best :: rest = scores // MatchError
}
