describe("A FizzBuzz", function(){
  it("should return an array of 100 positions", function(){
     expect(fizzbuzz().length).toBe(100);
  });

  it("should return 1 at first position", function() {
     expect(fizzbuzz()[0]).toBe(1);
  });

  it("should return FizzBuzz every position multiple of fifteen", function() {
     expect(fizzbuzz()[14]).toBe("FizzBuzz");
  });
  it("should return Fizz every position multiple of three", function() {
     expect(fizzbuzz()[2]).toBe("Fizz");
  });

  it("should return Buzz every position multiple of five", function() {
     expect(fizzbuzz()[4]).toBe("Buzz");
  });
});

