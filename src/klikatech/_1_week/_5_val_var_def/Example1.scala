package klikatech._1_week._5_val_var_def

object Example1 {
    def f0(x: Int, y: Int): Int = {
        return x + y; // semicolon inference
    }

    def f1(x: Int, y: Int): Int = {
        x + y // last expression return
    }

    def f2(x: Int, y: Int): Int = x + y // single expression

    def f3(x: Int, y: Int) = x + y // return type inference

    def f4(x: Int, y: Int) = {  // method
        def sqr(t: Int) = t * t // function
        sqr(x) + sqr(y)
    }

    // not recommended, use f3 variant, or function(): Unit = {}
    def f5(x: Int, y: Int)/*: Unit*/ {
        x + y
    }
}
