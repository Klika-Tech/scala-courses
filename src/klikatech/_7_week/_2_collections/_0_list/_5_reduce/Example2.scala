package klikatech._7_week._2_collections._0_list._5_reduce

object Example2 extends App {

    // Nil => UnsupportedOperationException
    //
    val x0: Int = List[Int]().reduceRight(_ - _)
    val x1: Int = List[Int]().reduceLeft(_ - _)
    val x2: Int = List[Int]().reduce(_ - _)

    // Nil => None
    //
    val opt0: Option[Int] = List[Int]().reduceRightOption(_ - _)
    val opt1: Option[Int] = List[Int]().reduceLeftOption(_ - _)
    val opt2: Option[Int] = List[Int]().reduceOption(_ - _)


    // reduceXXX: List[A] => A
    // reduceXXX: Nil => UnsupportedOperationException

    // reduceOptionXXX: List[A] => Option[A]
    // reduceOptionXXX: Nil => None
}
