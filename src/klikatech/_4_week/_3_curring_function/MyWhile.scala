package klikatech._4_week._3_curring_function

import scala.annotation.tailrec

object MyWhile extends App {

    @tailrec
    def _while(condition: => Boolean)(block: => Unit): Unit = {
        if(condition) {
            block
            _while(condition)(block)
        }
    }

    var x = 1
    _while(x != 10) {
       println("hello")
    }

}
