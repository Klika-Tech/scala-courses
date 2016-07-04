package klikatech._1_week._6_java_scala.user

// JavaUserApp VS ScalaUserApp
object ScalaUserApp extends App {

    // JAVA

    val user = new JavaUser()
    println(user.name())

    user.name_$eq("New name")
    // OR
    //user.name = "Superman" // not correct
    println(user.name())

    // use setter
    user.setName("Setter")



    // SCALA

    val user2 = new ScalaUser()
    println(user2.name) // not name()

    user2.name_$eq("New name")
    // OR
    user2.name_=("Superman") // "name_(...)" = method name
    // OR
    user2.name = "Batman"  // comment
    println(user2.name)

    // use setter
    user2.setName("Setter")

}
