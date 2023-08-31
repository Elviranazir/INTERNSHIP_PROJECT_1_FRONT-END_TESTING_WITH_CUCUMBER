package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_08_Add_Edit_Delete_Departments.feature",
        glue = "StepDefinitions"
)

public class _08_RunnerDepartments extends AbstractTestNGCucumberTests {
}
