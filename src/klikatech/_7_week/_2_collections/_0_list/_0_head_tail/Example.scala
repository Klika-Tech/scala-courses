package klikatech._7_week._2_collections._0_list._0_head_tail

object Example extends App {

    // list = list.head :: list.tail

    println(List(0, 1, 2).head) // 0
    println(List(0, 1, 2).tail) // List(1, 2)

    println(List().head)
    println(List().tail)
    // or
    // List() = Nil
    println(Nil.head) // java.util.NoSuchElementException
    println(Nil.tail) // java.lang.UnsupportedOperationException
}
