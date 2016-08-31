package klikatech._7_week._2_collections._0_list._8_collect

// https://www.garysieling.com/blog/scala-collect-example

object Example1 extends App {

    val convertFn: PartialFunction[Any, Int] = {
        case i: Int => i;
        case s: String => s.toInt;
        case Some(s: String) => s.toInt
    }

    val res0 = List(0, 1, "2", "3", Some(3), Some("4"), null).collect(convertFn)
    println(res0)

    List(1, "2").collect(
        {
            case i: Int => i
            case s: String => s.toInt
            //case _ => ???
        }
    )
}
