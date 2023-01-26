/**
 * Scala Style - There's no void
 * Always has a return type
*/
def sayHi(name: String): Unit = println(s"Hi ${name}")
sayHi("Rahul")

//Java Style
def sayHello(name: String): Unit = {
  println(s"Hello ${name}")
}
sayHello("Rahul")

//Returning a Val - Should avoid
def addMe(x: Int, y: Int): Unit = {
  val sum = x+y
}
val sum1 = addMe(10, 11)
println(sum1)
println(addMe(10, 11))

