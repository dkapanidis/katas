import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class calculator extends FlatSpec with ShouldMatchers {

  "A calculator" should "return 0 when empty string is provided" in {
     Calculator("") should be (0)
  }

  it should "return the value as an integer when a string representing an integral number is provided" in {
     Calculator("23") should be (23)
  }

  it should "return the sum of two integer separated with a comma" in {
     Calculator("23,4") should be (27)
  }
}
