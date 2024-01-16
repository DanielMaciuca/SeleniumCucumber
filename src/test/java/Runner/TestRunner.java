package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // we define that we want to use cucumber test runner
@CucumberOptions(features = "src/test/resources/features", glue = {"StepDef"}, tags = "@Run", stepNotifications = true, plugin = {"pretty", "html:target/html-reports"})
public class TestRunner {
}
