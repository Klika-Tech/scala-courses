package klikatech._3_week._1_call_by

object CallByTest extends App {

    def test(x: Int, y: Int): Int = x * x

    test(2, 3)
    //    CBV == CBN
    //        ↓
    //      2 * 2
    //        ↓
    //        4

    test(3 + 4, 8)
    //   CBV       <        CBN
    //    ↓                  ↓
    // test(7, 8)    (3 + 4) * (3 + 4)
    //    ↓                  ↓
    //  7 * 7              7 * (3 + 4)
    //    ↓                  ↓
    //   49                7 * 7
    //                       ↓
    //                      49

    test(7, 2 * 4)

    //   CBV       >        CBN
    //    ↓                  ↓
    // test(7, 8)          7 * 7
    //    ↓                  ↓
    //  7 * 7               49
    //    ↓
    //   49

    def loop: Int = loop

    def first(x: Int, y: => Int) = x

    /**
      * call-by-name -> return 1
      * call-by-value -> evaluation not terminates
      */
    println(first(1, loop))

    def parallel[A, B](taskA: => A, taskB: => B): (A, B) = ???
}
