package klikatech._3_week._2_hierarchy._5_own_types._2_combination

trait Cloneable extends java.lang.Cloneable {
    override def clone(): Cloneable = {
        super.clone().asInstanceOf[Cloneable]
    }
}

trait Resetable {
    def reset: Unit
}

trait Addable {
    def add: Int
}

// A compound type has the form T1 with T2 with ... with Tn.
object CompoundTypesTest {

    def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
        val cloned = obj.clone()
        obj.reset
        cloned
    }

    def f(a: List[Int] with Addable {def company: Int}) =
        a.head + a.add + a.company
}



