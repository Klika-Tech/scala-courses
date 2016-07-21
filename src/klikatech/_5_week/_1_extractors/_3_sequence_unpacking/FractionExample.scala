package klikatech._5_week._1_extractors._3_sequence_unpacking

object FractionExample extends App {

    class Fraction(val number: Int, val double: Double) {
        def *(that: Fraction): Fraction = {
            Fraction(this.number * that.number, this.double * that.double)
        }
    }

    object Fraction {
        def apply(n: Int, d: Double) = new Fraction(n, d)

        def unapply(input: Fraction): Option[(Int, Double)] =
            if (input.double == 0) None else Some((input.number, input.double))
    }

    var Fraction(n, d) = Fraction(3, 4.2) * Fraction(2, 5.5)

    println(s"number: $n, double: $d")
}
