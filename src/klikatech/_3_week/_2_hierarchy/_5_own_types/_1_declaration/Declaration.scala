package klikatech._3_week._2_hierarchy._5_own_types._1_declaration

trait Buffer {
    type T
    val elements: T
}

abstract class SeqBuffer extends Buffer {
    type U
    type T <: Seq[U]
    def length = elements.length
}

abstract class IntSeqBuffer extends SeqBuffer {
    type U = Int
}
object AbstractTypeTest1 extends App {
    def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
        new IntSeqBuffer {
            type T = List[U]
            val elements = List(elem1, elem2)
        }
    val buf = newIntSeqBuf(7, 8)
    println("length = " + buf.length)
    println("content = " + buf.elements)
}
