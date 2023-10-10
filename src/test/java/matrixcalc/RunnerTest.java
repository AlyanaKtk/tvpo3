package matrixcalc;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "matrixcalc.test.java.matrixcalc",
        tags = "@all",
        dryRun = false,
        strict = true,
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        name = "^Успешное|Успешная.*"
)

public class RunnerTest {
}
