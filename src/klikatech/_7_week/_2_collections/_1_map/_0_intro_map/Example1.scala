package klikatech._7_week._2_collections._1_map._0_intro_map

// http://docs.scala-lang.org/overviews/collections/maps.html
// http://docs.scala-lang.org/overviews/collections/performance-characteristics

object Example1 extends App {

    // Map[Key, Value]
    //
    val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)

    val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

    val countryOfCapital = capitalOfCountry.map {
        case(key, value) => println(s"$key -> $value")
    }


    // Getting value = Option[String]
    //
    val value0: String = capitalOfCountry("US")     // not recommended
    val value1: Option[String] = capitalOfCountry.get("Andorra")

    println(capitalOfCountry get "Andorra") // None
    println(capitalOfCountry get "US")      // Some(Washington)

    val bestOfCountry = capitalOfCountry.get("US").getOrElse("Minsk")
    println(bestOfCountry)


    capitalOfCountry.get("US").getOrElse("Minsk")
    // to
    capitalOfCountry.getOrElse("US", "Minsk")   // getOrElse("key", "default value")
    capitalOfCountry.getOrElse("US", throw new Exception("Ops!"))

    println(capitalOfCountry.isDefinedAt("US"))
    println(capitalOfCountry.isDefinedAt("Belarus"))

    def showCapital(country: String) = capitalOfCountry.get(country) match {
        case Some(capital) => capital
        case None => "missing data"
    }

    println("showCapital -> " + showCapital("US"))
}
