package klikatech._6_week._2_exceptions._1_exception

object _5_ThrowAndMap extends App {

    val map: Map[String, String] = Map.empty

    val optionalValue: Option[String] = map.get("key")

    val value1: String = map.getOrElse("key", "default value")

    val value2: String = map.getOrElse("key", default())

    val valueOrException: String = map.getOrElse("key", throw new NoSuchElementException)

    def default(): String = {
        println("default()")
        "abc"
    }
}
