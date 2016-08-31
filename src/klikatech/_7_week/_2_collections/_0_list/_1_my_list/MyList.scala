package klikatech._7_week._2_collections._0_list._1_my_list

sealed abstract class MyList[+A] {
    def head: A
    def tail: MyList[A]
    def isEmpty: Boolean
    def :><:[B >: A](x: B): MyList[B] = new :><:(x, this)
}

final case class :><:[A](head: A, tail: MyList[A]) extends MyList[A] {
    override def isEmpty: Boolean = false
}

case object MyNil extends MyList[Nothing] {
    override def head: Nothing = throw new NoSuchElementException("head of empty list")
    override def tail: MyList[Nothing] = throw new UnsupportedOperationException("tail of empty list")
    override def isEmpty: Boolean = true
}

object MyList {
    def apply[A](elems: A*): MyList[A] = {
        var result: MyList[A] = MyNil
        for (elem <- elems.reverse) {
            result = :><:(elem, result)
        }
        result
    }
}
