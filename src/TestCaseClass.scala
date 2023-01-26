case class Trees(name :String)
{
    val leaf : String = "Palm"
}
abstract class Banyan extends Trees("Banyan"){
    def branch(twig : String) : String 
}

abstract class Papaya extends Trees("Papaya"){
    def fruit(seed : String) : String
}

/*object TestCaseClass extends App{
    val casecls = new Trees("Banyan")
    println(casecls.branch("Branching and Evoluting"))
    println(casecls.fruit("papaya seeds"))
}*/