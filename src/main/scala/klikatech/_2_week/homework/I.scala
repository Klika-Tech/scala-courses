package klikatech._2_week.homework

case class I(i: Int) {

  def +(that: I): I = I(this.i + that.i)
  def -(that: I): I = I(this.i - that.i)
  def *(that: I): I = I(this.i * that.i)
  def /(that: I): I = I(this.i / that.i)

  def +:(that: I): I = I(this.i + that.i)

  def -:(that: I): I = I(this.i - that.i)

  def *:(that: I): I = I(this.i * that.i)

  def /:(that: I): I = I(this.i / that.i)

}
