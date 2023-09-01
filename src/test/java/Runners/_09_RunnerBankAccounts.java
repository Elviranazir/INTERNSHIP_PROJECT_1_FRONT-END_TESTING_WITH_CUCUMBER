package Runners;
//#comment for merging, delete

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_09_Add_Edit_Delete_Account.feature",
        glue = "StepDefinitions"
)

public class _09_RunnerBankAccounts extends AbstractTestNGCucumberTests {
}
