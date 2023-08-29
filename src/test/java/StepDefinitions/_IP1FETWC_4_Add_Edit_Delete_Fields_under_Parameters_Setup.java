package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.ParameterDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _IP1FETWC_4_Add_Edit_Delete_Fields_under_Parameters_Setup extends DialogContent {
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
    @Given("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();

    }
    @Given("Navigate to Setup")
    public void navigate_to_setup() {
        lb.setUpButton.click();

    }
    @Given("Click on Parameters")
    public void click_on_parameters() {
        lb.parametersButton.click();

    }
    @Given("Click on Fields")
    public void click_on_fields() {
      lb.FieldsButton.click();

    }
    @When("Add a new Fields")
    public void add_a_new_fields() {
        dc.addButton.click();
        dc.searchNameInput.sendKeys("Hidayet");
        dc.searchCodeInput.sendKeys("Boya");
        dc.saveButton.click();


    }
    @When("Edit a new Fields")
    public void edit_a_new_fields() {
        dc.editButton.click();
        dc.searchNameInput.sendKeys("Elif");
        dc.searchCodeInput.sendKeys("Boya");
        dc.saveButton.click();




    }
    @When("Delete a new Fields")
    public void delete_a_new_fields() {
        dc.deleteButton.click();
        dc.DeleteConfirmButton.click();

    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dc.assertText(dc.successMessage, "Successfully");

    }
}
