package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._6_typed

object TypeMatch extends App {

    def matchByType(z: Any): String =
        z match {
            case b: Boolean => s"A boolean : $b"
            case d: Double => s"A double : $d"
            case _ => " Unknown type "
        }

    println(matchByType(true))
    println(matchByType(0.0))
    println(matchByType(0))

    def generalSize(x: Any) = x match {
        case s: String => s.length
        case m: Map[_, _] => m.size // This pattern matches any value that is a Map of some arbitrary key and value types, and lets m refer to that value.
        case _ => -1
    }

    println(generalSize("abc"))
    println(generalSize(Map(1 -> 'a', 2 -> 'b')))
    println(generalSize(generalSize(math.Pi)))

    def isIntIntMap(x: Any) = x match {
        case m: Map[Int, Int] => true   // Warning: non-variable type argument Int in type pattern scala.collection.immutable.Map[Int,Int] (the underlying of Map[Int,Int]) is unchecked
                                        // since it is eliminated by erasure -> This means that no information about type arguments is maintained at runtime.
        //case m: Map[Int, Int] => m.head._1 / m.head._2 // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        case _ => false
    }

    println(isIntIntMap(Map(1 -> 1)))
    println(isIntIntMap(Map("abc" -> "abc")))
}
