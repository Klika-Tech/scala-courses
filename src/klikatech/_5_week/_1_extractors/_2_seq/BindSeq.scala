package klikatech._5_week._1_extractors._2_seq

object BindSeq extends App {

    object Name {
        def unapply(input: String): Option[(String, String)] = {
            val pos = input.indexOf(" ")
            if (pos == -1) None
            else Some((input.substring(0, pos), input.substring(pos + 1)))
        }
    }

    val author = "Ivan Ivanovich Ivanov"
    val Name(first, last) = author

    println(s"first: $first, last: $last")

    // Case 1 - def unapplySeq(object: S): Option[Seq[T]]
    object GivenNames {
        // the extraction method (mandatory)
        def unapplySeq(name: String): Option[Seq[String]] = {
            val names = name.trim.split(" ")
            if (names.forall(_.isEmpty)) None else Some(names)
        }
    }

    // Sequence pattern, see pattern matching
    def greetWithFirstName(name: String) = name match {
        case GivenNames(firstName, other @ _*) => s"Good morning, $firstName ($other)!"
        case _ => "Welcome! Please make sure to fill in your name!"
    }

    println(greetWithFirstName(author))

    // Case 2 - def unapplySeq(object: S): Option[(T1,  .., Tn-1, Seq[T])]
    object Names {
        // the extraction method (mandatory)
        def unapplySeq(name: String): Option[(String, String, Seq[String])] = {
            val names = name.trim.split(" ").toSeq
            if (names.size < 2) None
            else Some((names.head, names.last, names.drop(1).dropRight(1)))
        }
    }

    def greet(fullName: String) = fullName match {
        case Names(firstName, lastName, other @ _*) =>
            s"Good morning, $firstName $lastName ! ($other)"
        case _ => "Welcome! Please make sure to fill in your name!"
    }

    println(greet(author))
}
