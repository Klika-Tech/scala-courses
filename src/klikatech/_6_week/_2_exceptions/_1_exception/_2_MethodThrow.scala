package klikatech._6_week._2_exceptions._1_exception

object _2_MethodThrow extends App {

    def fun1(): Boolean = {
        if ("a" == "b") true
        else throw new Exception
    }

    def fun2(): String = {
        if ("a" == "b") "AB"
        else throw new Exception
    }
}
