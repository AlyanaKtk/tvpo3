package matrixcalc;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/multnum.feature",
        glue = "matrixcalc"

)

public class RunnerTest {
}
