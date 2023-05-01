package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"StepDef"}, tags = "@Run and not @Defect", stepNotifications = true, plugin = {"pretty", "html:target/html-reports"})
public class TestRunner {
}
