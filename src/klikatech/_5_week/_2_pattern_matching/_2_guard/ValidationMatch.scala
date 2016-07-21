package klikatech._5_week._2_pattern_matching._2_guard

object ValidationMatch extends App {

    object validationLength {
        def unapply(token: String): Boolean = token.length >= 6
    }

    def validationPassword(maybePassword: Any): Boolean = {
        maybePassword match {
            case string: String if string.length >= 6 => true
            case _ => false
        }
    }

    def correctPassword(maybePassword: Any): Option[String] = {
        maybePassword match {
            // type of password - String
            case password @ validationLength() => Some(password)
            case _ => None
        }
    }

    // 1
    println("validation password: " + validationPassword("123"))
    println("validation password: " + validationPassword("123456"))
    println("validation password: " + validationPassword(123456789))

    // 2
    println("correct password: " + correctPassword("123"))
    println("correct password: " + correctPassword("123456"))
    println("correct password: " + correctPassword(123456789))

    def resolveDriver(url: String): Option[String] = url match {
        case u if u.startsWith("jdbc:mysql:") => Some("com.mysql.jdbc.Driver")
        case u if u.startsWith("jdbc:postgresql:") => Some("org.postgresql.Driver")
        case _ => None
    }

    // 3
    println(resolveDriver("jdbc:mysql:"))
}
