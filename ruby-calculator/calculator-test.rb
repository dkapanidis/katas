# File:  calculator-test.rb

require "./calculator"
require "test/unit"

class TestCalculator < Test::Unit::TestCase

  def test_sums_zero
    assert_equal(0, Calculator.new().add("") )
  end

  def test_sums_one
    assert_equal(1, Calculator.new().add("1") )
  end
  
  def test_sums_two_digits_separated_by_comma
    assert_equal(3, Calculator.new().add("1,2") )
  end
end
