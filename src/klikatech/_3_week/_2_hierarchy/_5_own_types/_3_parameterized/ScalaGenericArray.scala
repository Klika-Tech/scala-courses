package klikatech._3_week._2_hierarchy._5_own_types._3_parameterized

class A

class B extends A

object ScalaGenericArray extends App {

    //insertA(new A, Array[B]())
    println(insertL(new A, List[B](new B)))

    def insertA(a: A, bs: Array[A]) = {
        bs(0) = a
    }

    def insertL(a: A, bs: List[A]) = {
        bs.updated(0, a)
    }
}
