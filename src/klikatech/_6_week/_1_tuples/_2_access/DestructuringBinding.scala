package klikatech._6_week._1_tuples._2_access

object DestructuringBinding extends App {

    // таплы являются и паттернами

    val person = ("Ivan", 30)

    val (name0, age0) = person // обязательно круглые скобки, как шаблон тапл

    val (name1, _) = person

    val (_, age2) = person
}
