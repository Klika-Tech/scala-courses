package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._1_wildcard

object WildcardExample extends App {
    // The wildcard pattern ( _ ) matches any object
    Pair(1, 2) match {
        case Pair(x, y) =>
            println(s"Sum is ${x + y}")
        case _ => // handle the default case
    }

    Pair(1, 2) match {
        case Pair(x, _) => // ignore parts of an object that you do not care about
            println(s"Just x = $x")
        case _ => // handle the default case
    }
}
