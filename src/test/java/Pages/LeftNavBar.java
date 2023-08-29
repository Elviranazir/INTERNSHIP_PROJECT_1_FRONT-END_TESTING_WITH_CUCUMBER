package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavBar extends MyMethods {

    public LeftNavBar() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenshipButton;

    @FindBy(xpath = "//span[normalize-space()='Fees']")
    public WebElement feesButton;

    @FindBy(xpath = "(//span[contains(text(),'Entrance Exams')])[1]")
    public WebElement EntranceExamsButton1;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[3]")
    public WebElement EntranceExamsSetupButton;

    @FindBy(xpath ="(//span[contains(text(),'Entrance Exams')])[2]" )
    public WebElement EntranceExamsButton2;

    @FindBy(xpath = "//span[.='Human Resources']")
    public WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement SetUpHumanResources;

    @FindBy(xpath = "//span[.='Positions']")
    public WebElement Positions;

    @FindBy(xpath = "//span[.='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[.='Setup'])[5]")
    public WebElement educationSetup;

    @FindBy(xpath = "//span[.='Subject Categories']")
    public WebElement educationSetupSubjectCategories;

}