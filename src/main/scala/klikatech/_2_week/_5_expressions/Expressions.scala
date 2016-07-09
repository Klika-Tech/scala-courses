package klikatech._2_week._5_expressions

/*
    Scala is Expression-Oriented language

    http://www.scala-lang.org/files/archive/spec/2.11/06-expressions.html
 */
object Expressions {

    // Statements (not return a value)
    case class User(name: String, age: Int, hasCar: Boolean = false)    // hasCar is default parameter

    //val incorrect = class User(val value: String)

    // "Classic" expressions
    val literal = "Hello"
    val instance = new StringBuilder("Hello")

    // Expressions (return a value)
    val correct: String = if (true) "it's true" else "it's false"
    val any: Any = if (true) 10 else ()

    // (Int, Int) => Int
    def max(x: Int, y: Int): Int = if (x > y) x else y
    // or
    def max2: ((Int, Int) => Int) = (x, y) => if (x > y) x else y

    // Unit ~= void in java
    val x1: Unit = while (true) { "it's true" }

    // for loop
    val x2: Unit = for (i <- 0 to 10) { "for loop" }            // 0 <- 10

    val x2_until: Unit = for (i <- 0 until 10) { "for loop" }   // 0 <- 9

    val users = List[User](User("Ivan", 24), User("Lena", 22))

    val voidUser: Unit = for(user <- users) { user }

    val voidUser2: Unit = users.foreach {user => user.age + 1}

    // for comprehension
    val goodGirlList: List[User] = for (user <- users if user.age >= 18) yield user

    val goodManList: List[User] = for (user <- users) yield { user.copy(hasCar = true) }


    val x3: Int = try {
        "abc".toInt
    } catch {
        case _: NumberFormatException => -1
    }

    // throw, used to produce exceptions, are expressions of type Nothing,
    // which is a bottom type to all types in Scala
    val x4: Nothing = throw new IllegalArgumentException("Ops!")

    // Multi-expressions
    def randomUser(users: List[User] = Nil): Option[User] = {  // Nil is default parameter
        if (users.isEmpty)
            None
        else {
            val index = scala.util.Random.nextInt(users.size)
            val user = users(index)
            Some(user) // Option(user) vs Some(user) - in next lessons!
        }
    }
            /*
         Option
        /      \
     None     Some(value)
    */

    val maybeUser = randomUser() match {
        case Some(user) => "it's random user"
        case None => "Ops!"
    }
}
