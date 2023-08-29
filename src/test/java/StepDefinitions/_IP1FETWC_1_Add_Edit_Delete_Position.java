package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.ThreeDEval;

public class _IP1FETWC_1_Add_Edit_Delete_Position extends MyMethods {

    DialogContent dc = new DialogContent();
    LeftNavBar lb = new LeftNavBar();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");
    }

    @Given("Enter username and password")
    public void enter_username_and_password() {
        dc.sendKeysMethod(dc.username, "turkeyts");
        dc.sendKeysMethod(dc.password, "TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }

    @And("Navigate to Human Resources page")
    public void navigateToHumanResourcesPage() {
        waitUntilVisible(lb.HumanResources);
        lb.HumanResources.click();
    }

    @And("Click on Setup")
    public void clickOnSetup() {
        waitUntilVisible(lb.SetUpHumanResources);
        lb.SetUpHumanResources.click();
    }

    @And("Click on Positions")
    public void clickOnPositions() {
        waitUntilVisible(lb.Positions);
        lb.Positions.click();
    }

    @When("Add a new position")
    public void addANewPosition() {
        clickMethod(dc.addButton);
        sendKeysMethod(dc.formNameInput, "alina");
        sendKeysMethod(dc.addShortName, "a");
        clickMethod(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dc.assertText(dc.successMessage, "successfully");
    }

    @When("Edit a new position")
    public void editANewPosition() throws InterruptedException {
        sendKeysMethod(dc.searchNameInput, "alina");
        sendKeysMethod(dc.searchShortNameInput, "a");
        clickMethod(dc.searchButton);
        Thread.sleep(2000);
        clickMethod(dc.editButton);
        Thread.sleep(2000);
        sendKeysMethod(dc.formNameInput, "Bella");
        sendKeysMethod(dc.addShortName, "b");
        clickMethod(dc.saveButton);
    }

    @When("Delete a new position")
    public void deleteANewPosition() {
        sendKeysMethod(dc.searchNameInput, "Bella");
        sendKeysMethod(dc.searchShortNameInput, "b");
        clickMethod(dc.deleteButton);
        clickMethod(dc.deleteConfirmButton);
        successMessageShouldBeDisplayed();
    }
}
