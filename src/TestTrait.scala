trait TestTrait[Type]{ //All Traits require a type

    // Are shared interface, shares fields across classes ,Almost interface
    //They are always extended by classes and objects.
    //They cannot be instantiated
    //We can't parameterize traits like class

    def hasNext : Boolean
    def next() : Type

  }

  class ImplTestTrait(to : Int) extends TestTrait[Int]{
    private var current = 1
    override def hasNext : Boolean = current < to
    override def next() : Int = {
      if(hasNext){
        val t = current
        current += 1
        return t
      }else 0
    }
  }

  object TestTraitExample extends App{
    val iterator = new ImplTestTrait(10)

    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
}
