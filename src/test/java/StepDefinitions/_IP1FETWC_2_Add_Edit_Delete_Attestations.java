package StepDefinitions;

import Pages.DialogContent;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import javax.tools.Diagnostic;

public class _IP1FETWC_2_Add_Edit_Delete_Attestations extends MyMethods {
    DialogContent dc = new DialogContent();

    @And("Click on Attestations")
    public void clickOnAttestations(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickMethod(dc.AttestationsSetupHumanResources);
    }

    @When("Add a new Attestations")
    public void addANewAttestations() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickMethod(dc.addButton);
        sendKeysMethod(dc.formNameInput, "Li");
        clickMethod(dc.saveButton);
    }

    @When("Edit a new Attestations")
    public void editANewAttestations() {
       sendKeysMethod(dc.searchNameInput,"Li");
       clickMethod(dc.searchButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       clickMethod(dc.editButton);
       sendKeysMethod(dc.formNameInput,"Zoo");
       clickMethod(dc.saveButton);
    }

    @When("Delete a new Attestations")
    public void deleteANewAttestations() {
        sendKeysMethod(dc.searchNameInput,"Zoo");
        clickMethod(dc.searchButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickMethod(dc.deleteButton);
        clickMethod(dc.deleteConfirmButton);
    }


}
