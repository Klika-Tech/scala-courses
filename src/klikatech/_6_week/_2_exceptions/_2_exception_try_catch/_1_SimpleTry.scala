package klikatech._6_week._2_exceptions._2_exception_try_catch

object _1_SimpleTry extends App {

    val result = try {
        "abc"
    }

    /*
        warning: A try without a catch or finally is equivalent to putting its body in a block;
        no exceptions are handled.
     */

    val result2 = {
        "abc"
    }

    val result3 = "abc"
}
