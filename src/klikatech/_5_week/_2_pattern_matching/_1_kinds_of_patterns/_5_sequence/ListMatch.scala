package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._5_sequence

object ListMatch extends App {

    def matchList[T](list: List[T]) = {
        list match {
            case 0 :: Nil => "0"
            case x :: y :: Nil => s"x=$x" + ", " + s"y=$y"
            case 0 :: tail => "0 ..."
            case List(1, tail@_*) => s"List(1, tail($tail))"
            case _ => "something else"
        }
    }

    println(s"result: ${matchList(List(0))}") // result: 0
    println(s"result: ${matchList(List(1, 2))}") // result: x=1, y=2
    println(s"result: ${matchList(List(0, 1, 2))}") // result: 0 ...
    println(s"result: ${matchList(List(1, 2, 3))}") // result: List(1, tail(List(2, 3)))
    println(s"result: ${matchList(List())}") // result: 0 ...

    case class MyList[T](elems: T*)

    println {
        MyList(1, 2, 3) match {
            //case head :: tail => // error
            case MyList(1, tail@_*) => s"MyList(1, tail($tail))"
            case _ => "something else"
        }
    }
}
