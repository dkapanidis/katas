# File:  calculator.rb

class Calculator

  def initialize() 
  end

  def add( input ) 
    if input.empty?
      return 0
    else
      #return Integer(input)
      return ("0," + input).split(',').inject{|l,r| Integer(l) + Integer(r)}
# {|l,r| Integer(l) + Integer(r)}
    end
  end

end
