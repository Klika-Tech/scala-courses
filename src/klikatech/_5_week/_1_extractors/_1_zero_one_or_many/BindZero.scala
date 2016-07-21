package klikatech._5_week._1_extractors._1_zero_one_or_many

object BindZero extends App {

    trait User {
        def name: String

        def score: Int
    }

    class FreeUser(val name: String, val score: Int, val upgradeProbability: Double) extends User

    class PremiumUser(val name: String, val score: Int) extends User

    object PremiumCandidate {
        // It would make no sense to define an apply, as there’s nothing to construct.
        def unapply(user: FreeUser): Boolean = user.upgradeProbability > 0.75d
    }

    val userF: User = new FreeUser("Daniel", 2500, 0.8d)
    val userP: User = new PremiumUser("Martin", 5000)

    matchUser(userF)
    matchUser(userP)

    def matchUser(user: User): Unit = {
        user match {
            // Variable binding
            // передаём пустой список аргументов, поскольку в связывании переменных со значениями нет необходимости
            // тип freeUser - FreeUser
            case freeUser @ PremiumCandidate() => println(s"initiateSpamProgram(${freeUser.name})")
            case _ => println(s"sendRegularNewsletter(${user.name})")
        }
    }
}

