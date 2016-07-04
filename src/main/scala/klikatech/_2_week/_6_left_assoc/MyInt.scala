package klikatech._2_week._6_left_assoc

/*
    http://www.scala-lang.org/files/archive/spec/2.11/06-expressions.html#prefix-infix-and-postfix-operations
    http://www.scala-lang.org/files/archive/spec/2.11/06-expressions.html#infix-operations

    инфиксная нотация 2 + 2   !!! скобки, окружающие группы операндов и операторов, определяют порядок,
                              !!! в котором будут выполнены операции
    префиксная + 2 2
    постфиксная 2 2 +
*/

// precedence operations
class MyInt(val i: Int) {    // or case class MyInt(i: Int)

    // v1, where 'plus, mul' - using method's name as words
    def plus(that: MyInt): MyInt = MyInt(this.i + that.i)
    def mul(that: MyInt): MyInt = MyInt(this.i * that.i)

    // v2
    def +(that: MyInt): MyInt = MyInt(this.i + that.i)
    def *(that: MyInt): MyInt = MyInt(this.i * that.i)

    // *v3
    def +:(that: MyInt): MyInt = MyInt(this.i + that.i)
    def -:(that: MyInt): MyInt = MyInt(this.i - that.i)

    // ***v4
    def *:(that: MyInt): MyInt = MyInt(this.i * that.i)
}

object MyInt { // remove object, if MyInt is case class
    def apply(i: Int) = new MyInt(i) // ~= constructor
}

object MyIntApp extends App {

    println("-- v1 --")

    // (1+2) * 3
    val xx0 = MyInt(1) plus MyInt(2) mul MyInt(3)       // 9  left-associative, вызов методов через пробел ("pointless style") не влияет на приоритет операций
    println("xx0: " + xx0.i)                            //    так как названия методов - слова, а не спец. знаки операторов

    // 1 + (2*3)
    val xx1 = MyInt(1) plus (MyInt(2) mul MyInt(3))     // 7
    println("xx1: " + xx1.i)

    // (1+2) * 3
    val xx2 = (MyInt(1) plus MyInt(2)) mul MyInt(3)     // 9
    println("xx2: " + xx2.i)

    // ((1+2) * 3)
    val xx3 = MyInt(1).plus(MyInt(2)).mul(MyInt(3))     // 9
    println("xx3: " + xx3.i)



    // -------------------------------------------------
    // The precedence of an infix operator is determined by the operator's first character.
    // Characters are listed below in increasing order of precedence, with characters on the same line having the same precedence.
    //
    println("-- v2 --")

    // 1 + (2*3)
    val yy0 = MyInt(1) + MyInt(2) * MyInt(3)     // 7  right-associative, вызов методов через пробел = "pointless style"
    println("yy0: " + yy0.i)

    // 1 + (2*3)
    val yy1 = MyInt(1) + (MyInt(2) * MyInt(3))   // 7
    println("yy1: " + yy1.i)

    // (1+2) * 3
    val yy2 = (MyInt(1) + MyInt(2)) * MyInt(3)   // 9
    println("yy2: " + yy2.i)

    // (1+2) * 3
    val yy3 = MyInt(1).+(MyInt(2)).*(MyInt(3))    // 9 - !!! приоритета операции умножения '*' нет, так как мы ЯВНО вызываем методы '+, *' с указанием аргументов,
    println("yy3: " + yy3.i)                      //     !!! в первом примере v2 методы вызываются через пробел - только в этом случае имеет место быть приоритет операций



    // -------------------------------------------------
    // The associativity of an operator is determined by the operator's last character.
    // Operators ending in a colon ':' are right-associative. All other operators are left-associative.
    //
    println("-- v3 --")

    /*
        A left-associative binary operation e1;op;e2 is interpreted as e1.op(e2).
        If op is right-associative, the same operation is interpreted as { val x=e1; e2.op(x) }, where x is a fresh name.
     */
    val zz0 = MyInt(4) -: MyInt(2) +: MyInt(3)      // 1 - !!! разворачивается в MyInt(3) + MyInt(2) - MyInt(4)
    println("zz0: " + zz0.i)

    val zz1 = MyInt(4) -: (MyInt(2) +: MyInt(3))    // 1 - скобки не влияют на ассоциативность операций
    println("zz1: " + zz1.i)

    val zz2 = (MyInt(4) -: MyInt(2)) +: MyInt(3)    // 1 - скобки не влияют на ассоциативность операций
    println("zz2: " + zz2.i)

    val zz3 = MyInt(4).-:(MyInt(2)).+:(MyInt(3))    // 5 - выполнение вычислений последовательно, left-associative
    println("zz3: " + zz3.i)



    // -------------------------------------------------
    println("-- v4 --")
    // 2*4 = 8
    // 2-1 = 1
    // 1+8 = 9
    val uu0 = MyInt(2) * MyInt(4) +: MyInt(1) -: MyInt(2)   // 9 - !!! разворачивается в (2*4) + (2-1) = (перевернуть) =  1 + 8
    println("uu0: " + uu0.i)

    // 4*2 = 8
    // 2-1 = 1
    // 1+8 = 9
    val uu1 = MyInt(2) *: MyInt(4) +: MyInt(1) -: MyInt(2)  // 9 - !!! разворачивается в (4*2) + (2-1) = 1 + 8
    println("uu1: " + uu1.i)

    // compile error, wrong associativity
    // приоритет операций одинаковый, но разная ассоциативность операций

    //val uu2 = MyInt(2) * MyInt(4) *: MyInt(1) * MyInt(2)

    //val uu3 = MyInt(2) + MyInt(4) +: MyInt(1) + MyInt(2)
}
