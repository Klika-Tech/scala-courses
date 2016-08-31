package klikatech._7_week._2_collections._0_list._2_init_last_reverse

import scala.annotation.tailrec

object Example extends App {

    // 1
    println(List(0, 1, 2, 3).last)      // 3
    println(List(0, 1, 2, 3).init)      // List(0, 1, 2)
    println(List(0, 1, 2, 3).reverse)   // List(3, 2, 1, 0)

    println(List().last)
    println(List().init)
    println(List().reverse)
    // or
    println(Nil.last) // java.util.NoSuchElementException
    println(Nil.init) // java.lang.UnsupportedOperationException
    println(Nil.reverse)

    // 2
    @tailrec
    def last[A](xs: List[A]): A = {
        if (xs.isEmpty) throw new NoSuchElementException("empty.last")         // () => throw new Exception
        else if (xs.tail.isEmpty) xs.head                                      // (x) => x.head
        else last(xs.tail) // ignore xs.head                                   // (x, y, z, ...) => (y, z, ...)
    }

    def init[A](xs: List[A]): List[A] = {
        if (xs.isEmpty) throw new UnsupportedOperationException("empty.init")  // () => throw new Exception
        else if (xs.tail.isEmpty) Nil  // ignore xs.head                       // (x) => ()
        else xs.head :: init(xs.tail)                                          // (x, y, z, ...) => x :: (y, z, ...)
    }

    def reverse[A](xs: List[A]): List[A] = {
        if (xs.isEmpty) Nil                                                     // () => ()
        else reverse(xs.tail) :+ xs.head                                        // (x, y, z) => (y, z, ...) +: x
    }
}
