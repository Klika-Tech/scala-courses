/*
    sealed abstract class Option[+A] extends ...,
    http://www.scala-lang.org/api/current/index.html#scala.Option

    object None extends Option[Nothing],
    http://www.scala-lang.org/api/current/index.html#scala.None$

    case class Some[+A](x: A) extends Option[A]
    http://www.scala-lang.org/api/current/index.html#scala.Some

    http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html
    http://blog.originate.com/blog/2014/06/15/idiomatic-scala-your-options-do-not-match

               /*
             Option
            /      \
         None     Some(value)
        */

   Some is case class
   None is case object
*/
var m = Map("key" -> "value")

val maybeValue: Option[String] = m.get("key")

maybeValue.get

val none = m.get("key1")
//none.get
none.toList == Nil
