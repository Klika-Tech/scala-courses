import scala.util.Try

//http://blog.bruchez.name/2011/10/scala-partial-functions-without-phd.html

// It is defined for any Int input value:
def inc(i: Int): Int = i + 1

// It is not defined for d == 0 and fraction(0) will throw an exception
def fraction0(d: Int) = 42 / d



def fraction1 = new PartialFunction[Int, Int] {
    override def apply(d: Int): Int = 42 / d

    override def isDefinedAt(d: Int): Boolean = d != 0
}

fraction1.isDefinedAt(42)
fraction1.isDefinedAt(0)

fraction1(42)
val default = (i: Int) => "<undefined>"
fraction1 applyOrElse(0, default)

def fraction2: PartialFunction[Int, Int] =
    { case d: Int if d != 0 => 42 /d }

fraction2.isDefinedAt(42)
fraction2.isDefinedAt(0)
//fraction2(0)

val incAny: PartialFunction[Any, Int] =
    { case i: Int => i + 1 }

incAny.isDefinedAt(42)
incAny.isDefinedAt("cat")
//incAny("cat")

List(42, "cat") collect { case i: Int => i + 1 }

val liar: PartialFunction[Any, Try[Int]] = {
    case i: Int => Try(i);
    case s: String => Try {
        s.toInt
    }
}

liar.isDefinedAt(42)
liar.isDefinedAt("42")
liar.isDefinedAt("cat")

liar(42)
liar("42")
liar("cat")
