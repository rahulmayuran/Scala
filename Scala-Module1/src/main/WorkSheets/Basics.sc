
//Simple Function Definition
val a = 10; val b = 12
def subtract(b: Int, a: Int): Int = b - a

subtract(b, a)

//Scala is expression based
def maxSquareNdDouble(a: Int, b: Int): Int =
  if(a > b){
    val aSquare = a * a
    aSquare * 2
  } else {
    val bSquare = b * b
    bSquare * 2
  }

println(s"Of ${a} and ${b}, The greater number is squared and Doubled -> "+ maxSquareNdDouble(a, b))

// Try Catch Block
try{
  maxSquareNdDouble(a, b/0)
} catch {
  case ae : ArithmeticException => "Exception Occurred -> "+ae.getMessage
}

// Recursion
def recurse(x: Int) : String =
  if(x == 0)
    " -> Ended when x is 0"
  else {
    println(s"Recursed ${(x-1)} times")
    recurse(x-1)
  }

recurse(10)