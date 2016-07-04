package klikatech._2_week.homework

object App extends App {

  val plus = I(2) * I(3) +: I(3)
  println(plus)

  val s = "22 + 45 * 55 + 46 / 66"

  val numbers = s.split("[/*-+]").map(s => s.toDouble).map(s => D(s))
  val operators = s.filter(ch => Array('+', '-', '*', '/').contains(ch))
  println(operators(2))

  println(numbersExec(operators, numbers))

  def numbersExec(operators: String, numbers: IndexedSeq[D]): IndexedSeq[D] = {

    val operationsMap = Map[Char, (D, D) => D](
      '+' -> ((x, y) => x + y),
      '-' -> ((x, y) => x - y),
      '*' -> ((x, y) => x * y),
      '/' -> ((x, y) => x / y))

    def doNextOperation() = {
      doOperation(getOperationNumber(operators, 0))
    }

    def doOperation(pos: Int): IndexedSeq[D] = {
      val number = operationsMap.get(operators(pos)).get.apply(numbers(pos), numbers(pos + 1))
      for (i <- numbers.indices if i != pos + 1) yield if (i == pos) number else numbers(i)
    }

    def getOperationNumber(operators: String, i: Int): Int = {
      if (operators.length == 0) 0
      else if (Array('*', '/').contains(operators.head)) i
      else getOperationNumber(operators.tail, i + 1)
    }

    def removeOperation() = {
      operators.replaceFirst("[" + operators(getOperationNumber(operators, 0)) + "]", "")
    }

    if (operators.length == 0) numbers
    else numbersExec(removeOperation(), doNextOperation())
  }
}
