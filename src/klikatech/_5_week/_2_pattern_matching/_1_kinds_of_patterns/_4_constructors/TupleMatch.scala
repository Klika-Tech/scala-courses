package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._4_constructors

object TupleMatch extends App {

    def console(caseIndex: Int, name: String, age: Int = -10, weight: Int = -100) =
        println(s"[case: $caseIndex] ==> Name: $name, age: $age, weight: $weight")

    def fun(tuple: Any): Unit = {
        tuple match {
            case (name: String, age: Int) => console(1, name, age)
            case (name: String, _) => console(2, name)
            case (name: String, _, weight: Int) => console(3, name, weight = weight)

            //  something = ignore type
            case (something, _, weight: Int) => console(4, something.toString, weight = weight)

            //case _ => println("no matches") // without "case _" return scala.MatchError
        }
    }

    fun { Tuple2("Ivan", 32) }
    fun { Tuple2("Ivan", "Mark") }
    fun { Tuple3("Ivan", "Mark", 32) }

    fun { Tuple3(2016, "Mark", 32) }

    // fun { Tuple3("Ivan", "Mark", "Pol") } // MatchError

    // Nested Pattern Matching
    case class Address(street: String, city: String, country: String)
    case class Person(name: String, age: Int, address:Address)
    def checkPerson(p: Person): Option[String] = {
        p match {
            case Person(name, age, null) if age > 18 => Some(s"Hi $name! age $age")
            case Person(name, age, Address(_, _, ctr)) => Some(s"Hi $name! age $age $ctr")
            case _ => None
        }
    }

}
