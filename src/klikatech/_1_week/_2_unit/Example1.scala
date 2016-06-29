package klikatech._1_week._2_unit

object Example1 {

    def f1(): Unit = { println("Hello"); }

    def f2() /*type inference*/ = { println("Hello") }

    def f3() = println("Hello")

    def f4() { println("Hello") }

    def main(args: Array[String]): Unit = {
        f1()
        f2()
        f3()
        f4()
    }
}
