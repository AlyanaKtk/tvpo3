package matrixcalc;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.Objects;

import static junit.framework.TestCase.assertEquals;


public class Stepdefs
{
    private int[][] matrix;
    private int num;
    private int[][] result;

    @Given("I have entered [[{int}, {int}, {int}], [{int}, {int}, {int}], [{int}, {int}, {int}]] into the calculator")
    public void iHaveEnteredIntoTheCalculator(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.matrix = new int[][]{{arg0, arg1, arg2}, {arg3, arg4, arg5}, {arg5, arg6, arg7}};

    }

    @And("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number){
        this.num = number;

    }

    @When("I press multiply")
    public void i_press_multiply()
    {
        matrix A = new matrix();
        result = A.multiplyByNumber(matrix, num);
    }


    @Then("the result should be [[{int}, {int}, {int}], [{int}, {int}, {int}], [{int}, {int}, {int}]] on the screen")
    public void theResultShouldBeOnTheScreen(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int[][] expectedAnswer = new int[][]{{arg0, arg1, arg2}, {arg3, arg4, arg5}, {arg5, arg6, arg7}};

        if (!Objects.equals(result, expectedAnswer)) {
            throw new AssertionError("Expected " + Arrays.deepToString(expectedAnswer) + " but was " + Arrays.deepToString(result));
        }
    }
}
