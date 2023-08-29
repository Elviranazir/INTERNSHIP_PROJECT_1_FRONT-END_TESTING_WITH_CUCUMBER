package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_IP1FETWC-2_Add-Edit-Delete Attestations.feature",
        glue = "StepDefinitions"
)

public class _IP1FETWC_2_Add_Edit_Delete_Attestations extends AbstractTestNGCucumberTests {

}
