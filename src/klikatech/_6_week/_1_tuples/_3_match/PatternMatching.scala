package klikatech._6_week._1_tuples._3_match

object PatternMatching extends App {

    def console(caseIndex: Int, name: String, age: Int = -10, weight: Int = -100) = println(s"[case: $caseIndex] ==> Name: $name, age: $age, weight: $weight")

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

    fun { ("Ivan", 32) }
    fun { ("Ivan", "Mark") }
    fun { ("Ivan", "Mark", 32) }

    fun { (2016, "Mark", 32) }

    //fun { ("Ivan", "Mark", "Pol") }

}
