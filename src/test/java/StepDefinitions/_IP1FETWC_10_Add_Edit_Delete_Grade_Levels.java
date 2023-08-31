package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import io.cucumber.java.en.*;

import java.util.List;

public class _IP1FETWC_10_Add_Edit_Delete_Grade_Levels extends MyMethods {

    DialogContent dialogContent = new DialogContent();
    LeftNavBar leftNavBar = new LeftNavBar();

    @And("Click on Parameters")
    public void navigateToParameters() {
        clickMethod(leftNavBar.parametersButton);
    }
    @Given("Click on Setup")
    public void navigate_to_setup() {
        leftNavBar.clickMethod(leftNavBar.setUpButton);
    }

    @Given("Click on Grade Levels")
    public void click_on_grade_levels() {
        leftNavBar.clickMethod(leftNavBar.gradeLevels);
    }

    @When("Fill the form with Grade Levels Data")
    public void fill_the_form_with_grade_levels_data(io.cucumber.datatable.DataTable dataTable) {
        List<String> dataTableList = dataTable.asList(String.class);

        dialogContent.sendKeysMethod(dialogContent.nameFormGradeLevel, dataTableList.get(0));
        dialogContent.sendKeysMethod(dialogContent.shortNameFormGradeLevel, dataTableList.get(1));
        dialogContent.sendKeysMethod(dialogContent.orderFormGradeLevel, dataTableList.get(2));
    }
}