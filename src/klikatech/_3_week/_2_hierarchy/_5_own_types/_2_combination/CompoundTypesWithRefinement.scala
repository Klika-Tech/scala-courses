package klikatech._3_week._2_hierarchy._5_own_types._2_combination

case class Bird(name: String)

case class Plane(callsign: String)

object CompoundTypesWithRefinement extends App {

    def takeoff(runway: Int, r: {def callsign: String}) = {
        println(r.callsign + " requests take-off on runway " + runway)
    }

    val bird = new Bird("Parrot") {
        val callsign = name
    }

    val a380 = new Plane("A-380")
    takeoff(42, bird)
    takeoff(1, a380)
}
