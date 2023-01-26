//return type of one function is value of other function
class Decorate(left: String,right : String){
  def layout[A] (x:A): String = left + x.toString + right
}

object TestHigherOrderFunction extends App{

  def apply(f: Int => String, v:Int) = f(v)
  //f(v) does the entire operation 
  val decorator  = new Decorate("{{{","}}}")


  println(apply(decorator.layout, 88))
  //apply method internally calls the layout method
}