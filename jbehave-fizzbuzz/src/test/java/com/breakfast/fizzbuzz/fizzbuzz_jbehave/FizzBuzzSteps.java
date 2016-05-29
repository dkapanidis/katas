package com.breakfast.fizzbuzz.fizzbuzz_jbehave;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 *
 */
public class FizzBuzzSteps {
    private FizzBuzz _fizzBuzz;

    private String[] _results;

    @Given("a Fizzbuzzer")
    public void givenAFizzbuzzer() {
        _fizzBuzz = new FizzBuzz();
    }

    @When("run")
    public void whenRun() {
        _results = _fizzBuzz.run();
    }

    @Then("it returns 100 items")
    public void thenItReturns100Items() {
        Assert.assertEquals(100, _results.length);
    }

}
