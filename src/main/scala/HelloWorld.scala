import scala.io.StdIn

object HelloWorld extends App {

  val name = StdIn.readLine("Hi, what's your name?")
  println(s"hello $name")

}
