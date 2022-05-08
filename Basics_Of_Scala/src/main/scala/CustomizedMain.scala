object CustomizedMain {

  /**
   *
   * @param args
   * def In Scala the def keyword is used to define a function.
   * main This is our function name.
   * (args: Array[String]) Our main function takes in a named parameter args which is an Array of String.
   * : Unit = In Scala, the Unit keyword is used to define a function which does not return anything.
   * This is similar to the void keyword similar to Java or .NET
   *
   */
  def main(args: Array[String]): Unit = {
    println("From Default main method")
    customMain(args)
  }
  def customMain(a: Array[String]): Unit ={
    println("From Customized main method")
  }
  def intMain(i: Array[Int]): Unit ={
    println("Anyhow I won't be called")
    println(3)
  }
}
