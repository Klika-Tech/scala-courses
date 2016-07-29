package klikatech._6_week._2_exceptions._2_exception_try_catch

import scala.util.control.NonFatal

object _7_TryCatchExtractor extends App {

    try {
        // code
    } catch {
        // matching by extractor
        case NonFatal(e) => println("non fatal")
        case _ => println("fatal")
    }
}
