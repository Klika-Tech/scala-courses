package klikatech._7_week._2_collections._0_list._2_init_last_reverse

object Example2 extends App {

    def init[A](xs: List[A]): List[A] = xs.reverse.tail.reverse

    def tail[A](xs: List[A]): List[A] = xs.reverse.init.reverse

    def last[A](xs: List[A]): A = xs.reverse.head

    def head[A](xs: List[A]): A = xs.reverse.last
}
