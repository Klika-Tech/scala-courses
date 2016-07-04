package klikatech._2_week.homework

case class D(i: Double) {

  def +(that: D): D = D(this.i + that.i)

  def -(that: D): D = D(this.i - that.i)

  def *(that: D): D = D(this.i * that.i)

  def /(that: D): D = D(this.i / that.i)

  def +:(that: D): D = D(this.i + that.i)

  def -:(that: D): D = D(this.i - that.i)

  def *:(that: D): D = D(this.i * that.i)

  def /:(that: D): D = D(this.i / that.i)

}

