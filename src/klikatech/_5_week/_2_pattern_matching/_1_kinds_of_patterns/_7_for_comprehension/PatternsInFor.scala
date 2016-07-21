package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._7_for_comprehension

object PatternsInFor extends App {

    val capitals = Map("Belarus" -> "Minsk", "France" -> "Paris")
    for ((country, city) <- capitals)
        println("The capital of " + country + " is " + city)

    val results = List(Some("apple"), None, Some("orange"))
    for (Some(fruit) <- results) println(fruit) // NOTE: values that do not match the pattern are discarded

}
