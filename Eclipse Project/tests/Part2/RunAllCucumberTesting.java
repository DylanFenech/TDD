package Part2;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // Framework to Run the tests
@CucumberOptions(features = "tests/feature") // path to feature files
public class RunAllCucumberTesting {

}
