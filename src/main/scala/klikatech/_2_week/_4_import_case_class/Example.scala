package klikatech._2_week._4_import_case_class

case class User(name: String, age: Int) // where "name, age" is val fields

object Example extends App {
    println("-- import user --")
    val user = User("Ivan", 28)

    import user._
    println("name: " + name + ", age: " + age)

    // or
    println("\n-- extract user --")
    val user2 = User("Michal", 32)

    val User(userName, userAge) = user2
    println("name: " + userName + ", age: " + userAge)   // fields val

    // ***or
    println("\n-- tupled user --")
    val userLikeData = ("John", 34)
    val user3 = (User.apply _).tupled(userLikeData)     // (User.apply _) is Function2 "(String, Int) => User"
    println("name: " + user3.name + ", age: " + user3.age)
}
