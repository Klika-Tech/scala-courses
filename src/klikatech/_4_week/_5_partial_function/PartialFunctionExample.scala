package klikatech._4_week._5_partial_function

object PartialFunctionExample extends App {

    val listOfStuff = List(13, "Scott", null, 25.50, "Bob", null)

    val stringLengths = new PartialFunction[Any, (String, Integer)] {

        def apply(item: Any) = item match { case s: String => Tuple2(s, s.length) }

        def isDefinedAt(item: Any) = item != null && item.isInstanceOf[String]
    }

    val stringsAndLengths = listOfStuff collect stringLengths
    for(x <- stringsAndLengths) {
        println(x)
    }

    println("\n=> more function style!\n")

    val stringsAndLengths2 =
    13 :: "Scott" :: null :: 25.50 :: "Bob" :: null :: Nil collect {
        case item: Any if item.isInstanceOf[String] =>
             item match {
                 case s: String => (s, s.length)
             }
    }

    for(x <- stringsAndLengths2) {
        println(x)
    }
}
