package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C:\\Users\\RYZEN\\IdeaProjects\\Cucumber\\src\\test\\resources\\userLogin.feature",
                glue = "stepDefinitions",
                dryRun = true,
                plugin = {"pretty", "html:C:\\Users\\RYZEN\\IdeaProjects\\Cucumber\\target\\test-output"}

        )
public class TestRunner {
}
