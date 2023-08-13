package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@Regression or @SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitons"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunnerRegression extends AbstractTestNGCucumberTests {
}
