package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {


    @FindBy(css = "input[placeholder='Username']")
    public WebElement username;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//span[normalize-space()='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    public WebElement dashBoard;

    @FindBy(xpath = "//ms-add-button[@table='true']//span[3]")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement searchCodeInput;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@color='warn']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//span[normalize-space()='Delete'])[1]")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement formShortNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    public WebElement searchShortNameInput;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    public WebElement feeIntegrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    public WebElement feePriority;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement createExamName;

    @FindBy(xpath = "(//span[.='Academic Period'])[1]")
    public WebElement academicPeriod;

    @FindBy(xpath = "//span[normalize-space()='Staj 2023']")
    public WebElement academicPeriodOption;

    @FindBy(xpath = "(//span[.='Grade Level'])[1]")
    public WebElement gradeLevel;

    @FindBy(xpath = "//span[normalize-space()='Software Development Engineer in Test']")
    public WebElement gradeLevelOption;

    @FindBy(xpath = "//div[contains(text(),'Description')]")
    public WebElement examDescription;

    @FindBy(xpath = "//div[contains(text(),'Notes')]")
    public WebElement examNotes;

    @FindBy(css = "body[id='tinymce']>p")
    public WebElement descriptionAndNotesText;

    @FindBy(css = "iframe[class=\"tox-edit-area__iframe\"]")
    public WebElement iFrame;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement addShortName;

    @FindBy(xpath = "//button[@color='accent']")
    public WebElement editButton;

    @FindBy(xpath = "(//input[@data-placeholder=\"Name\"])[2]")
    public WebElement educationSetupSubjectCategoriesNameInbox;

    @FindBy(xpath = "(//input[@data-placeholder=\"Code\"])[2]")
    public WebElement educationSetupSubjectCategoriesCodeInbox;

    @FindBy(css = "a[href=\"/attestation/list\"]")
    public WebElement AttestationsSetupHumanResources;

    @FindBy(xpath="//button[@class='mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-unthemed mat-mdc-button-base mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement addGradeLevels;

    @FindBy(xpath="//button[@class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-basic mat-mdc-button-base mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement searchGradeLevels;

    @FindBy(xpath="//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-accent mat-mdc-button-base ng-star-inserted']")
    public WebElement editGradeLevels;

    @FindBy(xpath="//input[@data-placeholder='Name']")
    public WebElement nameFormGradeLevel;

    @FindBy(xpath="//input[@data-placeholder='Short Name']")
    public WebElement shortNameFormGradeLevel;

    @FindBy(xpath="//input[@data-placeholder='Order']")
    public WebElement orderFormGradeLevel;

    @FindBy(linkText = "Save")
    public WebElement saveFormGradeLevel;


}