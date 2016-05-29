
class Calculator{}

object Calculator {

  def apply(input: String) : Int = {
    sum(input)
  }

  var regexp = "([^,]*),(.*)".r

  def sum(input: String):Int ={
    input match {
      case "" => 0 
      case _ => input.split(",").foldLeft(0)(_+Integer.valueOf(_))
    }
  }
}
