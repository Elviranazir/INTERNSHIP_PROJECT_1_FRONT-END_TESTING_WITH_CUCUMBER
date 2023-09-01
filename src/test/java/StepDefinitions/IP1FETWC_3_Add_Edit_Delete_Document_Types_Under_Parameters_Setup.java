package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class IP1FETWC_3_Add_Edit_Delete_Document_Types_Under_Parameters_Setup {

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

    @And("Navigate to Setup")
    public void navigateToSetup() {
        lb.waitUntilVisible();
        lb.setUpButton.click();
    }

    @And("Navigate to Parameters")
    public void navigateToParameters() {
        lb.waitUntilVisible();
        lb.Parameters.click();

    }

    @And("Click on Document Types")
    public void clickOnDocumentTypes() {
        lb.waitUntilVisible();
        lb.DocumentTypes.click();
    }

    @When("Add a new document type")
    public void addANewDocumentType() {
        dc.clickMethod(dc.addButton);
        dc.sendKeysMethod(dc.passportName, "onur");
        dc.sendKeysMethod(dc.addShortName, "o");
        dc.clickMethod(dc.saveButton);
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
        dc.sendKeysMethod(dc.searchpassportNameInput, "onur");
        dc.sendKeysMethod(dc.searchShortNameInput, "o");
        dc.clickMethod(dc.searchButton);
        Thread.sleep(2000);
        dc.clickMethod(dc.editButton);
        Thread.sleep(2000);
        dc.sendKeysMethod(dc.passportName, "gizay");
        dc.sendKeysMethod(dc.addShortName, "g");
        dc.clickMethod(dc.saveButton);
    }
    @When("Delete a new position")
    public void deleteANewPosition() {
        dc.sendKeysMethod(dc.searchpassportNameInput, "gizay");
        dc.sendKeysMethod(dc.searchShortNameInput, "g");
        dc.clickMethod(dc.deleteButton);
        dc.clickMethod(dc.deleteConfirmButton);
        successMessageShouldBeDisplayed();
    }
}




















