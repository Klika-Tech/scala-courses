package klikatech._5_week._3_for_comprehension

object ForOption extends App {

    case class User(name: String, age: Int)
    case class Role(name: String, enabled: Boolean = true) {
        def isManager = if (name == "manager") true else false
    }

    def getUserById(userToken: String): Option[User] = {
        // find in database...
        if (userToken == "123456") Some(User("Ivan", 42))
        else None
    }

    def getRoleByUser(user: User): Option[Role] = {
        // find in database
        Some(Role("manager"))
    }

    def hasManagerRole(userToken: String): Boolean = {
        val maybeManager =
            for {
                user <- getUserById(userToken)
                role <- getRoleByUser(user)
            } yield role.isManager

        maybeManager.getOrElse(false)
    }

    println(hasManagerRole("123456"))
    println(hasManagerRole("123"))
}
