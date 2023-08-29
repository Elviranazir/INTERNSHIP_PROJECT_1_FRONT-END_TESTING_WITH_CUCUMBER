package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_IP1FETWC-1-Add-Edit-Delete_Position.feature",
        glue = "StepDefinitions"
)

public class _IP1FETWC_1_Add_Edit_Delete_Position extends AbstractTestNGCucumberTests {

}
