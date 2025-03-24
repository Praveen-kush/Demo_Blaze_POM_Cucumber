package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // Path to the feature files where the Gherkin scenarios are written
        features = "src/main/resources/Features",

        // The package where your step definition classes are located
        glue = "StepDefinitions",  // Replace with your package for step definitions

        // Report configuration: Using ExtentReports adapter for better test reporting
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        // Uncomment the line below to run only tests with a specific tag, such as "@Regression"
        tags = "@zooz"

        // Monochrome makes the console output cleaner and easier to read (no color codes)
//        monochrome = true
)
public class TestRunners extends AbstractTestNGCucumberTests {


}