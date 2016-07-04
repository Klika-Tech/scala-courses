package klikatech._2_week._5_expressions

object Example1 extends App {

    // Java style = statement

    def mul0(list: List[Int]): List[Int] = {
        var tempList: List[Int] = List[Int]() // OR Nil
        for (x <- list) {
            tempList = tempList :+ x * x // x * x -> tempList.add(x2)
            //tempList = x * x +: tempList
        }
        tempList
    }

    // Scala style = expression

    def mul1(list: List[Int])/*: List[Int]*/ = for (x <- list) yield x * x

    def mul2(list: List[Int]) = list map { x => x * x }


    // 2
    def mul3(list: List[Int]) = list map { x => x * 2 }
    // OR
    def mul4(list: List[Int]) = list map { _ * 2 }
    // OR
    def mul5(list: List[Int]) = list.map(_ * 2)


}
