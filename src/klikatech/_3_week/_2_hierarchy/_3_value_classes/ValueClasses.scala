package klikatech._3_week._2_hierarchy._3_value_classes

object ValueClasses extends App {

    case class Meter(val value: Double) extends AnyVal {
        def +(m: Meter): Meter = new Meter(value + m.value)
    }

    case class BYR(amount: Int) extends AnyVal {
        override def toString = amount + " BYR"
    }

    case class USD(amount: Int) extends AnyVal {
        override def toString = "$ " + amount
    }

    val rubles = BYR(100000)
    val dollars = USD(5)

    println(rubles)
    println(dollars)

    val m1 = Meter(1)
    val m2 = Meter(2)
    val result = m1 + m2

    println(result)

}
