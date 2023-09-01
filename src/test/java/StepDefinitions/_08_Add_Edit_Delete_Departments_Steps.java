package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _08_Add_Edit_Delete_Departments_Steps extends MyMethods {
// making comment for merging
    LeftNavBar ln = new LeftNavBar();
    DialogContent dc = new DialogContent();
    @And("Navigate to Departments")
    public void navigateToDepartments() {
        waitUntilVisible(ln.departmentsButton);
        ln.departmentsButton.click();

    }

    @When("Add new Department")
    public void addNewDepartment() {
        clickMethod(dc.addButton);
        sendKeysMethod(dc.searchNameInput, "Art & Craft");
        sendKeysMethod(dc.searchCodeInput,"ArtCraft");
        clickMethod(dc.saveButton);

    }

    @Then("New Department should be displayed")
    public void newDepartmentShouldBeDisplayed() {
        waitUntilVisible(dc.successMessageAddedNewDepartment);
        assertText(dc.successMessageAddedNewDepartment, "Art & Craft");

    }

    @When("Edit Department")
    public void editDepartment() {
        clickMethod(dc.editButton);
        dc.searchCodeInput.clear();
        sendKeysMethod(dc.searchCodeInput,"Art And Craft");
        clickMethod(dc.saveButton);
    }

    @Then("Edited Department should be displayed")
    public void editedDepartmentShouldBeDisplayed() {
        waitUntilVisible(dc.successMessageEditNewDepartment);
        assertText(dc.successMessageEditNewDepartment, "Art And Craft");
    }

    @When("Delete Department")
    public void deleteDepartment() {
        clickMethod(dc.deleteButton);
        clickMethod(dc.deleteConfirmButton);


    }


//    @Then("Added Department should not be displayed")
//    public void addedDepartmentShouldNotBeDisplayed() {
//
//        assertTextFalse(dc.successMessageEditNewDepartment, "Art And Craft");
//    }

}

