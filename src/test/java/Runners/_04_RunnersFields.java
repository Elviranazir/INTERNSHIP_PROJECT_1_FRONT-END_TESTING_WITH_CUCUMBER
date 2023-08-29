package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_IP1FETWC-4-Add-Edit-Delete_Fields_under_Parameters_Setup.feature",
        glue = "StepDefinitions"
)

public class _04_RunnersFields extends AbstractTestNGCucumberTests {

}