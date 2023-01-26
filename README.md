**Applied Scala - I**
================

Intro
-----------
For Official Documentation [>> click](https://www.scala-lang.org/)

![](https://miro.medium.com/max/1100/0*gOL3eqI1olDj9I-1.webp)

1. Use **REPL** {Read Evaluate Print Loop}, Type **scala** in cmd. 
2. Use SBT as Build Tool >> CMD - **sbt version** to check version
   1. mkdir <Project-name> followed by cd/
   2. type nul > build.sbt 
   3. (echo scalaVersion := "3.2.2") > build.sbt
   4. sbt console 

Basics in REPL
-----------

1. vals and vars - val is a final variable assignment whereas var can be reassigned
2. Scopes in REPL - By Default every command you type has its own scope. If you want to change the scope of a val then you can use:

```bash
    val x = 10
    println(x)
    {
       val x = 100
       println(x)
    }
    10
    100
   ```

3. defining a method

```scala
    def add(x: Int, y: Int): Int = x+y
    add(1, 4)
    
    val res0 = 5 
   ```
4. If statements

```scala
    val a = 2
    val b = 2.5
    val res = if(a > b) a else b
    
    val res0: AnyVal = 2.5
   ```
Functional Style - emphasis on expressions (returns value) rather than statements (doesn't return value) and it doesn't need a `return` keyword

```scala
   val a = 10; val b = 12
   val maxSquareDoubled = if(a > b) {
       val aSquared = a * a
       aSquared * 2
   } else {
      val bSquared = b * b
      bSquared * 2
   }

  maxSquareDoubled: Int = 288
```
5. ...Continued  in Project section.
