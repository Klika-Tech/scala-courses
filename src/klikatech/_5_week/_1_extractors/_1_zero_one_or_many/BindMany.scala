package klikatech._5_week._1_extractors._1_zero_one_or_many

object BindMany extends App {

    trait User {
        def name: String

        def score: Int
    }

    class FreeUser(val name: String, val score: Int, val upgradeProbability: Double) extends User

    object FreeUser {

        // the injection method (if companion object), optional
        /*
            Injections and extractions are often grouped together in one object,
            because then you can use the object’s name for both a constructor and a pattern,
            which simulates the convention for pattern matching with case classes.
         */
        def apply(name: String, score: Int, upgradeProbability: Double): FreeUser =
            new FreeUser(name, score, upgradeProbability)

        // the extraction method (mandatory)
        def unapply(user: FreeUser): Option[(String, Int, Double)] =
            Some(user.name, user.score, user.upgradeProbability)
    }

    val user = FreeUser("Daniel", 2500, 0.8d)

    userSideEffect(user)

    // dual rules
    println(FreeUser.unapply(user) == Some("Daniel", 2500, 0.8d))

    FreeUser.unapply(user) match {
        case Some((name, score, upgradeProbability)) =>
            userSideEffect(FreeUser.apply(name, score, upgradeProbability))
        case None => println("...")
    }

    def userSideEffect(user: User): Unit = {
        user match {
            case FreeUser(userName, score, _) => println(s"userName: $userName | score: $score")
            case _ => println(s"sendRegularNewsletter($user)")
        }
    }

}

