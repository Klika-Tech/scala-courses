package klikatech._6_week._2_exceptions._1_exception

object _4_ThrowAndOption extends App {

    val option: Option[String] = Some("Hello") // vs None

    val optionalValue: String = option.get

    val value1: String = option.getOrElse("default value")

    val value2: String = option.getOrElse(default())

    val valueOrException: String = option.getOrElse(throw new Exception)

    def default(): String = {
        println("default()")
        "abc"
    }
}
