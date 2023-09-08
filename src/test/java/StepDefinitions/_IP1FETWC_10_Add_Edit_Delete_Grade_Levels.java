package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _IP1FETWC_10_Add_Edit_Delete_Grade_Levels extends MyMethods {
    DialogContent dialogContent = new DialogContent();
    LeftNavBar leftNavBar = new LeftNavBar();
    @And("Click on Parameters")
    public void clickOnParameters() {
        clickMethod(leftNavBar.parametersButton);
    }

    @And("Click on Grade Levels")
    public void clickOnGradeLevels() {
        clickMethod(leftNavBar.gradeLevels);
    }

    @And("Fill the form with Grade Levels Data")
    public void fillTheFormWithGradeLevelsData(io.cucumber.datatable.DataTable dataTable) {
            List<String> dataTableList = dataTable.asList(String.class);
            dialogContent.sendKeysMethod(dialogContent.nameFormGradeLevel, dataTableList.get(0));
            dialogContent.sendKeysMethod(dialogContent.shortNameFormGradeLevel, dataTableList.get(1));
            dialogContent.sendKeysMethod(dialogContent.orderFormGradeLevel, dataTableList.get(2));

    }

    @When("Clicked on Grade Levels Edit button")
    public void clickedOnGradeLevelsEditButton() {
        clickMethod(dialogContent.editGradeLevels);
    }

    @And("Edit the name with {string}")
    public void editTheNameWith(String text) {
        dialogContent.sendKeysMethod(dialogContent.editNameGradeLevel, text);
    }

    @And("Delete a grade level")
    public void deleteAGradeLevel() {
    }
}
