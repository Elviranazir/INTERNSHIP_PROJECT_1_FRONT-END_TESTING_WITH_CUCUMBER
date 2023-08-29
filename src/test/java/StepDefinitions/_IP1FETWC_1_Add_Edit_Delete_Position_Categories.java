package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _IP1FETWC_1_Add_Edit_Delete_Position_Categories {

    DialogContent dc = new DialogContent();
    LeftNavBar lb = new LeftNavBar();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");
    }

    @Given("Enter username and password")
    public void enter_username_and_password() {
        dc.sendKeysMethod(dc.username,"turkeyts");
        dc.sendKeysMethod(dc.password,"TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }

    @And("Navigate to Human Resources page")
    public void navigateToHumanResourcesPage() {
        lb.HumanResources.click();
    }

    @And("Click on Setup")
    public void clickOnSetup() {
        lb.setUpButton.click();
    }

    @And("Click on Positions")
    public void clickOnPositions() {
        lb.Positions.click();
    }

    @When("Add a new position")
    public void addANewPosition() {
        dc.addButton.click();
        dc.searchNameInput.sendKeys("Alina");
        dc.searchShortNameInput.sendKeys("Ali");
    }



    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.assertText(dc.successMessage, "successfully");
    }

    @When("Edit a new position")
    public void editANewPosition() {
    }


    @When("Delete a new position")
    public void deleteANewPosition() {
    }
}
