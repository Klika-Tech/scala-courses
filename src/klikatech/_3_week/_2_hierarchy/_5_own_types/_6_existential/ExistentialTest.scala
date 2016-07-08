package klikatech._3_week._2_hierarchy._5_own_types._6_existential

trait SomeApi {
    def universalLength[T](xs: List[T]): Int

    def universalLengthWithBound[T <: CharSequence](xs: List[T]): Int

    def existentialLength(xs: List[_]): Int // List[T] forSome {type T}

    def existentialLengthWithBound(xs: List[_ <: CharSequence]): Int // List[T] forSome {type T <: CharSequence}
}

class SomeClass extends SomeApi {
    def universalLength[T](xs: List[T]): Int = {
        // xs.head - тип T
        xs.length
    }

    def existentialLength(xs: List[_]): Int = {
        // xs.head - тип Any
        xs.length
    }

    def universalLengthWithBound[T <: CharSequence](xs: List[T]): Int = {
        //xs.head - тип T
        xs.length
    }

    def existentialLengthWithBound(xs: List[_ <: CharSequence]): Int = {
        //xs.head - тип CharSequence
        xs.length
    }
}


// http://www.drmaciver.com/2008/03/existential-types-in-scala/
// http://stackoverflow.com/a/8686154
// http://stackoverflow.com/questions/14299638/existential-vs-universally-quantified-types-in-haskell
object ExistentialTest extends App {

    val someClass = new SomeClass

    // здесь мы указываем коллекцию, думаем про ее тип и имеем доступ к типу внутри метода
    println(someClass.universalLength(List(1, 2, 3)))
    println(someClass.universalLengthWithBound(List("a", "b", "c")))

    // здесь мы указываем только коллекцию и имеем доступ к Upper типу внутри метода
    println(someClass.existentialLength(List(1, 2, 3)))
    println(someClass.existentialLengthWithBound(List("a", "b", "c")))

    case class Tree[T](value: T, left: Tree[T], right: Tree[T])

    // Universal type solution
    def universalHeight[T](t: Tree[T]): Double = {
        1 + math.max(universalHeight(t.left), universalHeight(t.right))
    }

    /*
        This would allow you to declare variables and create expressions of type T inside that function, if you wanted to.
        But...
        If you look at our method's body, you will notice that we're not actually accessing, or working with, anything of type T!
        There are no expressions having that type, nor any variables declared with that type...
        so, why do we have to make universalHeight generic at all? Why can't we simply forget about T?
        As it turns out, we can:
     */

    // Existential type solution
    def existentialHeight(t: Tree[_]): Double = {
        1 + math.max(existentialHeight(t.left), existentialHeight(t.right))
    }

    /*
        Existential and universal types are complementary / dual in nature.
        Thus, if the universal type solution was to make height more generic,
        then we should expect that existential types have the opposite effect:
        making it less generic, namely by hiding/removing the type parameter T.
     */

    /*
        ===========================================================
                             |    universally       existentially
                             |  quantified type    quantified type
        ---------------------+-------------------------------------
         calling method      |
         needs to know       |        yes                no
         the type argument   |
        ---------------------+-------------------------------------
         called method       |
         can use / refer to  |        yes                no
         the type argument   |
        =====================+=====================================
    */

}
