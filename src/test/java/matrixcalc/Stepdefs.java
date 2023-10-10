package matrixcalc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;


public class Stepdefs
{
    private int[][] matrix;
    private int num;
    private int[][] result;

    @Given("I have entered {int[][]} into the calculator")
    public void i_have_entered_into_the_calculator(int[][] matrixA){
        this.matrix = matrixA;

    }
    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number){
        this.num = number;

    }

    @When("I press multiply")
    public void i_press_multiply()
    {
        matrix A = new matrix();
        result = A.multiplyByNumber(matrix, num);
    }
    @Then("the result should be {int[][]}")
    public void the_result_should_be(int[][] expectedAnswer)
    {
        if (result != expectedAnswer) {
            throw new AssertionError("Expected " + expectedAnswer + " but was " + result);
        }
    }


}
