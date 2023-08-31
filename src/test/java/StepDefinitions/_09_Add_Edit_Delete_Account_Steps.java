package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _09_Add_Edit_Delete_Account_Steps extends MyMethods {

    LeftNavBar lb = new LeftNavBar();
    DialogContent dc = new DialogContent();

    @And("Navigate to Setup")
    public void navigateToSetup() {
        clickMethod(lb.setUpButton);
    }

    @And("Navigate to Parameters")
    public void navigateToParameters() {
        clickMethod(lb.parametersButton);
    }


    @And("Navigate to Bank Accounts")
    public void navigateToBankAccounts() {

        clickMethod(lb.bankAccountsButton);
    }


    @When("Add new Account")
    public void addNewAccount() {
        clickMethod(dc.addButton);
        sendKeysMethod(dc.nameNewBankAccountFrom, "Luda");
        sendKeysMethod(dc.newAccountFormIBAN, "YUTR");
        clickMethod(dc.newAccountFormCurrency);
        clickMethod(dc.newAccountFormEUR);
        sendKeysMethod(dc.newAccountFormIntegrationCode, "1234567");
        clickMethod(dc.saveButton);
    }

    @Then("New Account should be displayed")
    public void newAccountShouldBeDisplayed() {
        waitUntilVisible(dc.successMessageAddedNewAccount);
        assertText(dc.successMessageAddedNewAccount, "Luda");
    }

    @When("Edit Account")
    public void editAccount() {
        waitUntilVisible(dc.searchNameInput);
        sendKeysMethod(dc.searchNameInput, "Luda");
        clickMethod(dc.searchButton);
       // waitUntilVisible(dc.editButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickMethod(dc.editButton);
        sendKeysMethod(dc.nameNewBankAccountFrom, "Mirabella");
        clickMethod(dc.saveButton);
        dc.searchNameInput.clear();
        clickMethod(dc.searchButton);




    }

    @Then("Edited Account should be displayed")
    public void editedAccountShouldBeDisplayed() {

        waitUntilVisible(dc.successMessageEditNewAccount);
        assertText(dc.successMessageEditNewAccount, "Mirabella");
    }

    @When("Delete Account")
    public void deleteAccount() {
        sendKeysMethod(dc.searchNameInput, "Mirabella");
        waitUntilVisible(dc.deleteButton);
        clickMethod(dc.deleteButton);
        clickMethod(dc.deleteConfirmButton);
    }


}
