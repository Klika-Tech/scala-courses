package klikatech._5_week._1_extractors._1_zero_one_or_many

object BindOne extends App {

    trait Role {
        def name: String
    }

    class Assistant(val name: String) extends Role
    class Manager(val name: String) extends Role

    object ManagerExtractor {
        // the method apply - optional
        // the extraction method - Option of two or more
        def unapply(role: Manager): Option[String] = Some(role.name)
    }

    object AssistantExtractor {
        def unapply(role: Assistant): Option[String] = Some(role.name)
    }

    println("Assistant and Manager examples")
    println(AssistantExtractor.unapply(new Assistant("assistant")))
    println(ManagerExtractor.unapply(new Manager("manager")))


    println("\nRole extractor example")
    object RoleExtractor {
        def unapply(role: Role): Option[String] = Some(role.name)
    }

    println(RoleExtractor.unapply(new Assistant("assistant")))
    println(RoleExtractor.unapply(new Manager("manager")))

    val role: Role = new Assistant("assistant")

    println("\nRole before Assistant")
    role match {
        case RoleExtractor(name) => println(s"case Role($name)")
        case AssistantExtractor(name) => println(s"case Assistant($name)")
        case ManagerExtractor(name) => println(s"case Manager($name)")
        case _ => println("...")
    }

    println("\nManager before Assistant")
    role match {
        case ManagerExtractor(name) => println(s"case Manager($name)")
        case AssistantExtractor(name) => println(s"case Assistant($name)")
        case RoleExtractor(name) => println(s"case Role($name)")
        case _ => println("...")
    }

}
