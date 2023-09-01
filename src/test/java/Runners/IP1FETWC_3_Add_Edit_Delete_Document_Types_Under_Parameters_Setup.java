package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/FeatureFiles/_IP1FETWC_3_Add_Edit_Delete_Document_Types_Under_Parameters_Setup.feature",
        glue = "StepDefinitions"


)
public class IP1FETWC_3_Add_Edit_Delete_Document_Types_Under_Parameters_Setup {
}
