package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _IP1FETWC_6_Add_Edit_Delete_Subject_Categories_under_Education_Setup {

    DialogContent dialogContent = new DialogContent();
    LeftNavBar leftNavBar = new LeftNavBar();

    @And("Enter {string} for username and {string} for password")
    public void enterForUsernameAndForPassword(String username, String password) {
        dialogContent.sendKeysMethod(dialogContent.username, username);
        dialogContent.sendKeysMethod(dialogContent.password, password);
    }

    @And("Navigate to Education page")
    public void navigateToEducationPage() {
        dialogContent.clickMethod(leftNavBar.education);
    }

    @And("Click on Setup under Education")
    public void clickOnSetupUnderEducation() {
        dialogContent.clickMethod(leftNavBar.educationSetup);
    }

    @And("Click on Subject Categories under Setup under Education")
    public void clickOnSubjectCategoriesUnderSetupUnderEducation() {
        dialogContent.clickMethod(leftNavBar.educationSetupSubjectCategories);
    }

    @And("Clicked on Add button")
    public void clickedOnAddButton() {
        dialogContent.clickMethod(dialogContent.addButton);
    }

    @And("Fill the form")
    public void fillTheForm(DataTable dataTable) {
        List<String> dataTableList = dataTable.asList(String.class);

        dialogContent.sendKeysMethod(dialogContent.educationSetupSubjectCategoriesNameInbox, dataTableList.get(0));
        dialogContent.sendKeysMethod(dialogContent.educationSetupSubjectCategoriesCodeInbox, dataTableList.get(1));
    }

    @When("Clicked on Save button")
    public void clickedOnSaveButton() {
        dialogContent.clickMethod(dialogContent.saveButton);
    }

    @And("Clicked on Edit button")
    public void clickedOnEditButton() {
        dialogContent.clickMethod(dialogContent.editButton);
    }

    @And("Change the name with {string}")
    public void changeTheNameWith(String text) {
        dialogContent.sendKeysMethod(dialogContent.educationSetupSubjectCategoriesNameInbox, text);
    }

    @And("Search for {string}")
    public void searchFor(String text) {
        dialogContent.sendKeysMethod(dialogContent.searchCodeInput, text);
        dialogContent.clickMethod(dialogContent.searchButton);
    }

    @And("Click on Delete button")
    public void clickOnDeleteButton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dialogContent.clickMethod(dialogContent.deleteButton);
    }

    @When("Clicked on Confirm Delete button")
    public void clickedOnConfirmDeleteButton() {
        dialogContent.clickMethod(dialogContent.deleteConfirmButton);
    }
}
