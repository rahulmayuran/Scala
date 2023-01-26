/**
 * Tuples can return more than 1 thing from a method
 * has an arity up-to 22
 */
def sum_Difference(a: Int, b: Int): (Int, Int) = {
  val sum = a + b
  val difference = a - b
  (sum, difference)
}
val res = sum_Difference(15, 12)

//res is Stored in this format
res._1
res._2

//Another way to get the results from method
val (s, d) = sum_Difference(15, 14)

// Dynamic Assignment
val (a, b, c ,d , e) = (0, 'u', Array(1, 2), List(22, 33), "too")

//Some more Dynamic Assignments
val tupify = (0, 'u', Array(11, 22), List(22, 33), "too")
val (z, y, x, v, w) = tupify

tupify._4
tupify._1