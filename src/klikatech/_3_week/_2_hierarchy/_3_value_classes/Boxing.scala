package klikatech._3_week._2_hierarchy._3_value_classes

// more - http://www.blog.project13.pl/index.php/coding/1769/scala-2-10-and-why-you-will-love-implicit-value-classes/
object Boxing extends App {

    trait Distance extends Any

    case class Centimeter(value: Int) extends AnyVal with Distance

    case class Meter(value: Double) extends AnyVal with Distance {
        def +(m: Meter): Meter = Meter(value + m.value)
        def +(m: Centimeter): Meter = Meter(value + (m.value * 1.0) / 100)
    }

    implicit class RichDouble(val self: Double) extends AnyVal {
        def toHexString: String = java.lang.Double.toHexString(self)
    }

    val m1 = Meter(1)
    val m2 = Meter(2)

    val m3 = m1 + m2

    val с50 = Centimeter(50)

    val oneAndHalf = m1 + с50

    println(m3.value.toHexString)   // static RichDouble$.MODULE$.extension$toHexString(3)

    // Array
    val a = Array(m1, m2)           // boxed

    // Generic
    val b = Option(m1)              // boxed

    // Upcast
    val any = m1: Any               // boxed
    val anyVal = m2: AnyVal         // boxed
    val distance = m2: Distance     // boxed

    print(oneAndHalf)               // boxed

    def print(distance: Distance): Unit = {
        distance match {
            case Meter(value) =>
                println(s"$value meters")
            case Centimeter(value) =>
                println(s"$value meters")
        }
    }

}
