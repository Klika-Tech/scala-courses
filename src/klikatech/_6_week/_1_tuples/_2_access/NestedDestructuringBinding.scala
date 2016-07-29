package klikatech._6_week._1_tuples._2_access

object NestedDestructuringBinding extends App {

    val mark = ("Mark", 30, ("Nezavisimosti ave", 19))

    val (name0, age0, (street0, house0)) = mark

    val (name1, _, (street1, _)) = mark
}
