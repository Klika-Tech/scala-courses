package klikatech._7_week._2_collections._0_list._5_reduce

object Example1 extends App {

    def reduceRight[A](xs: List[A], op: (A, A) => A): A = {
        if (xs.isEmpty) throw new UnsupportedOperationException
        else if (xs.tail.isEmpty) xs.head
        else op(xs.head, reduceRight(xs.tail, op))
    }

    def reduceLeft[A](xs: List[A], op: (A, A) => A): A = {
        if (xs.isEmpty) throw new UnsupportedOperationException
        else if (xs.tail.isEmpty) xs.head
        else op(reduceLeft(xs.init, op), xs.last)
    }

    def reduceLeft2[A](xs: List[A], op: (A, A) => A): A = {
        if (xs.isEmpty) throw new UnsupportedOperationException
        var acc = xs.head
        var these = xs.tail
        while (these.nonEmpty) {
            acc = op(acc, these.head)
            these = these.tail
        }
        acc
    }

    def reduceLeft3[A](xs: List[A], op: (A, A) => A): A = {
        reduceRight(xs.reverse, (x: A, y: A) => op(y, x))
    }

    println(reduceLeft3(List(1, 2, 3, 4, 5), (x: Int, y: Int) => x - y))
}
