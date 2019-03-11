// Basics

println("Hello World")

val x = 1+1
println(x)

val x2: Int = x+2
println(x2)

var x3 = 1+1
x3 = 3
println(x3*x3)

// Blocks

println({
  val x = 1+1
  x + 1
})

// Functions

val addOne = (x: Int) => x + 1
addOne(2)

val add = (x: Int, y: Int) => x+y
add(4, 5)

val getTheAnswer = () => 42
getTheAnswer()

// Methods

def adder(x: Int, y: Int): Int = x+y
adder(1, 3)

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x+y)*multiplier
addThenMultiply(4,5)(3)

def name: String = System.getProperty("user.name")

def getSquareString(input: Double): String = {
  val square = input*input
  square.toString
}

// Classes

class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit = {
    println(prefix + name + suffix)
  }
}

val greeter = new Greeter("Hello, ", " !")
greeter.greet("Scala Developer")

// Case Classes

case class Point(x: Int, y: Int)

// Objects

object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

// Traits

trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter2 = new DefaultGreeter()
greeter2.greet("Scala Developer")

val greeter3 = new CustomizableGreeter("How are you, ", "?")
greeter3.greet("Scala Developer")





