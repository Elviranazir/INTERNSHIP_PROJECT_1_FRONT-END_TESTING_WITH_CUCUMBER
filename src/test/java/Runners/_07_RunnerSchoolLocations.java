package Runners;
//#comment for merging, delete

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_07_Add_Edit_Delete_Location.feature",
        glue = "StepDefinitions"
)



public class _07_RunnerSchoolLocations extends AbstractTestNGCucumberTests {
}
