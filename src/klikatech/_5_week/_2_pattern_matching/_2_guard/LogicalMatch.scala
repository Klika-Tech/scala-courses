package klikatech._5_week._2_pattern_matching._2_guard

object LogicalMatch extends App {

    def OR(p: Boolean, q: Boolean): Boolean =
        (p, q) match {
            case (x, y) if x | y => true
            case _ => false
        }

    OR(p = false, q = false) //> res1: Boolean = false
    OR(p = false, q = true) //> res2: Boolean = true

    // p q
    // p OR q
    // T T T
    // T F T
    // F T T
    // F F F
    // If (p=T | q=T) then OR(p,q) = true else OR(p,q) = false

}
