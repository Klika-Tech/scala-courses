package klikatech._4_week._2_eta_expansion

/*
    Eta-conversion,
    https://en.wikipedia.org/wiki/Lambda_calculus#.CE.B7-conversion

    !!!
    http://blog.jaceklaskowski.pl/2013/11/23/how-much-one-ought-to-know-eta-expansion.html
    !!!

    Eta-expansion: method => function
 */
object Eta extends App {

    // methods:
    def add(x: Int): Int = x + 1

    def add2(x: Int, y: Int): Int = x + y

    def myFilter(that: Int): Boolean = that > 0

    val fun22: (Int => Int) = add // константа функционального типа

    // method
    def fun2(f: Int => Int) = (x: Int) => f(x + 1): Int

    // -------------- 1 ---------------

    // explicit eta-expansion
    //val g0 = add // error
    val f0: (Int => Int ) = add

    val f1 = add _
    // f0 == f1 == g1
    val g1 = new Function1[Int, Int] { def apply(x: Int): Int = add(x) }

    // -----------------------------

    // implicit eta-expansion
    fun2(add) // fun2 в параметрах ожидает функцию, add - метод

    // -----------------------------

    val list0 = List(-4,-3,-2,0,1,2,3,4) filter myFilter map add
    // ==
    val list00 = List(-4,-3,-2,0,1,2,3,4).filter(myFilter)
    val list01 = list00.map(add)

    println(list0)

    val list1 = list0 map add _
    val list2 = list0 map add

    // -----------------------------

    val f00: (Int => Int) = (x) => add(x)
    // ==
    val f01: ((Int) => Int) = add

    val f02: ((Int, Int) => Int) = add2
    // ==
    val f03: ((Int, Int) => Int) = (x: Int, y: Int) => add2(x,y)

    //val f04 = add2(_, 4) error!!! что такое "_" для компилятора??? необходимо указывать тип "_: Int"
    val f04 = add2(_: Int, 4) // с указанием типа, "пропускаемого параметра x", все Ок
    val ppp = f04(3) // 3 это наш x

    // in theory:       f00 != f01
    // in practice:     f00 == f01

    // Interestingly, uniform access principle makes understanding eta expansion a bit tricker.
    object A {
        def foo(bar: () => Int) = 1
        def foo(n: Int) = 2
    }

    def method() = 4

    /*
        scala> def method() = 4
        method: ()Int

        scala> method _
        res6: () => Int = <function0>
    */

    println(A.foo(method))
    println(A.foo(method _))

    // A.foo _ error
    // but
    // A.foo _ : ((Int) => Int)

}
