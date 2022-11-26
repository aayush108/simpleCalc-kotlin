package iohk.com.stepdefs

import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorStepDefinition {
    private var integer1: Int = 0
    private var integer2: Int = 0
    private var result: Int = 0
    private var double1: Double =1.0
    private var double2: Double = 1.0
    private var mulResult: Double = 1.0
    private var evenArray: IntArray = intArrayOf(6,10,2,34,56)
    private var oddArray: IntArray = intArrayOf(23,67,55,31,89,9)
    private var mixedArray: IntArray = intArrayOf(8,3,6,89,21,34,67,81)
    private var arrayType: String = ""
    private var evenResult: Int = 0


    @Given("there is integer {int}")
    fun `a integer`(number: Int) {
        integer1 = number
    }

    @And("there is a second integer {int}")
    fun `a second integer`(number: Int) {
        integer2 = number
    }

    @When("the numbers are added")
    fun `the numbers are added`() {
        result = SimpleCalc.add(integer1, integer2)
    }

    @Then("the total is {int}")
    fun `the total is`(result: Int) {
        assertEquals(result, this.result)
    }

    @Given("there is number {double}")
    fun `there is number`(number: Double) {
        double1 = number
    }

    @And("there is a second number {double}")
    fun `there is second number`(number: Double) {
        double2 = number
    }

    @When("the numbers are multiplied")
    fun `the numbers are multiplied`() {
        mulResult = SimpleCalc.multiply(double1, double2)
    }

    @Then("the result is {double}")
    fun `the result is`(mulResult: Double) {
        assertEquals(mulResult, this.mulResult)
    }

    @Given("there is an array of {string}")
    fun `there is an array`(myArray: String) {
        arrayType = myArray
    }

    @When("I do the sum of even numbers from the array")
    fun `sum of even numbers`() {
        evenResult = if(arrayType.contentEquals("even")) SimpleCalc.sumOffEvens(evenArray)
        else if (arrayType.contentEquals("odd")) SimpleCalc.sumOffEvens(oddArray)
        else SimpleCalc.sumOffEvens(mixedArray)
    }

    @Then("the sum of the even numbers is {int}")
    fun `the result is`(evenResult: Int) {
        assertEquals(evenResult, this.evenResult)
    }


}