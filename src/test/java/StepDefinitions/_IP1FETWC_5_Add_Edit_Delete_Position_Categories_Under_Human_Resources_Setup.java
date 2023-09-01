package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _IP1FETWC_5_Add_Edit_Delete_Position_Categories_Under_Human_Resources_Setup {
    DialogContent dialogContent = new DialogContent();
    LeftNavBar leftNavBar = new LeftNavBar();

    @And("Click on Setup under Human Resources")
    public void clickOnSetupUnderHumanResources() {
        leftNavBar.clickMethod(leftNavBar.SetUpHumanResources);
    }

    @And("Click on Position Categories under Setup under Human Resources")
    public void clickOnPositionCategoriesUnderSetupUnderHumanResources() {
        leftNavBar.clickMethod(leftNavBar.humanResourcesPositionCategories);
    }

    @And("Fill the form with this Position Categories Data")
    public void fillTheFormWithThisPositionCategoriesData(DataTable dataTable) {
        List<String> dataTableList = dataTable.asList(String.class);

        dialogContent.sendKeysMethod(dialogContent.educationSetupSubjectCategoriesNameInbox, dataTableList.get(0));
    }

    @And("Search for {string} in Position Categories")
    public void searchForInPositionCategories(String text) {
        dialogContent.sendKeysMethod(dialogContent.positionCategoriesSearchNameSection, text);
    }
}
