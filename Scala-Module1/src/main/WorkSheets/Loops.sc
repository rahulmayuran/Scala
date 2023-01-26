
//While Loop
var x = 1
while(x <= 5){
  println(s"${x} squared : ${x * x}")
  x += 1
}

//Do While loop
x = 0
do{
  x += 1
  println(s"${x} squared : ${x * x}")
} while(x < 5)

//Inner Loops to print 25 times
var x = 1
while(x <= 5){
  var y = 1
  while (y <= 5) {
    println(s"${x} times ${y} is ${x * y}")
    y += 1
  }
  x += 1
}

