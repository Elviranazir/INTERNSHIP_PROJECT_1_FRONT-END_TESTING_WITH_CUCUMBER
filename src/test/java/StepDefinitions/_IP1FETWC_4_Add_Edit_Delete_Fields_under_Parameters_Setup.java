package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.ParameterDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class _IP1FETWC_4_Add_Edit_Delete_Fields_under_Parameters_Setup extends DialogContent {
    DialogContent dc = new DialogContent();
    LeftNavBar lb = new LeftNavBar();
    @Given("Navigate to Setup")
    public void navigate_to_Setup(){
        lb.setUpButton.click();
    }

    @Given("Click on Fields")
    public void click_on_fields() {
      lb.FieldsButton.click();

    }
    @Given("Click on Parameters")
    public void click_on_parameters() {
        lb.parametersButton.click();
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}



