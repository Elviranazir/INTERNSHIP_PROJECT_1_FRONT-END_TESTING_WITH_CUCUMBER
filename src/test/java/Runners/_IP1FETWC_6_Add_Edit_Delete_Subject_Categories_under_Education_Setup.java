package Runners;

import Utilities.ParameterDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_IP1FETWC-6-Add-Edit-Delete_Subject_Categories_under_Education_Setup.feature",
        glue = "StepDefinitions"

)

public class _IP1FETWC_6_Add_Edit_Delete_Subject_Categories_under_Education_Setup extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browser){
        ParameterDriver.setThreadDriverName(browser);
    }

}
