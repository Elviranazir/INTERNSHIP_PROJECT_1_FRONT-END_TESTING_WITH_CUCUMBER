package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _07_Add_Edit_Delete_Location_Steps extends MyMethods {


    LeftNavBar ln = new LeftNavBar();
    DialogContent dc = new DialogContent();


    @And("Navigate to School Setup")
    public void navigateToSchoolSetup() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ln.clickMethod(ln.setUpButton);
        waitUntilVisible(ln.schoolSetupButton);
        clickMethod(ln.schoolSetupButton);
    }

    @And("Navigate to School Location")
    public void navigateToSchoolLocation() {
        clickMethod(ln.locationsButton);
    }

    @When("Add new location")
    public void addNewLocation() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // waitUntilVisible(dc.addButton);
        clickMethod(dc.addButton);
        sendKeysMethod(dc.searchNameInput, "San Francisco");
        sendKeysMethod(dc.shortNameLocation, "SF");
        clickMethod(dc.classroomSelectorNewLocation);
        clickMethod(dc.classroomLocation);
        sendKeysMethod(dc.capacityNewLocation,"2");
        clickMethod(dc.toolbarNewLocation);
        clickMethod(dc.saveButton);


    }

    @Then("New location should be displayed")
    public void successMessageShouldBeDisplayed() {
        assertText(dc.successMessageAddedNewLocation, "San Francisco");
    }

    @When("Edit location")
    public void editLocation() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
     //   waitUntilVisible(dc.editButton);
        clickMethod(dc.editButton);
        sendKeysMethod(dc.shortNameLocation,"Edited");
        clickMethod(dc.saveButton);


    }

    @Then("Edited location should be displayed")
    public void editedLocationShouldBeDisplayed() {
        waitUntilVisible(dc.successMessageEditNewLocation);
        assertText(dc.successMessageEditNewLocation, "Edited");
    }

    @When("Delete location")
    public void deleteLocation() {
        waitUntilVisible(dc.deleteLocationButton);
        clickMethod(dc.deleteLocationButton);
        clickMethod(dc.deleteConfirmButton);

    }


//    @Then("New Location shouldn't be displayed")
//    public void newLocationShouldnTBeDisplayed() {
//        assertTextFalse(dc.successMessageAddedNewLocation, "San Francisco");
//    }
}
