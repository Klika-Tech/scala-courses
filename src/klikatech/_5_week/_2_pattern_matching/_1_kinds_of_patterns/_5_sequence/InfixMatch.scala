package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._5_sequence

object InfixMatch extends App {

    case object ==: {
        def unapply[T](input: List[T]): Option[(T, Seq[T])] = {
            if (input.isEmpty) None else Some(Tuple2(input.head, input.tail))
        }
    }

    // инфиксная форма записи
    10 +: 20 +: 30 +: 40 +: 50 +: Nil match {
        case a ==: b ==: c => println(s"a=$a, b=$b, c=$c") // ==:(a, ==:(b, c))
    }

    List(10, 20, 30, 40, 50) match {
        case ==:(first, ==:(second, _)) => println(first + second)
    }
}
