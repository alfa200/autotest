package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "surname_vzr_ins_0")
    WebElement clientSurename;

    @FindBy(id = "name_vzr_ins_0")
    WebElement clientName;

    @FindBy(id = "birthDate_vzr_ins_0")
    WebElement clientBirthdate;

    @FindBy(id = "person_lastName")
    WebElement insurerSurename;

    @FindBy(id = "person_firstName")
    WebElement insurerName;

    @FindBy(id = "person_middleName")
    WebElement insurerMiddlename;

    @FindBy(id = "person_birthDate")
    WebElement insurerBirthdate;

    @FindBy(xpath = "//person-general-data/div/div[5]/div/form-control-label/div/radio-button-group/div/div/label[2]")
    WebElement genderFemale;

    @FindBy(xpath = "//person-general-data/div/div[5]/div/form-control-label/div/radio-button-group/div/div/label[1]")
    WebElement genderMale;

    @FindBy(id = "passportSeries")
    WebElement pSeries;

    @FindBy(id = "passportNumber")
    WebElement pNumber;

    @FindBy(id = "documentDate")
    WebElement pDate;

    @FindBy(id = "documentIssue")
    WebElement pPlace;

    @FindBy(css = ".btn-primary")
    WebElement continueButton;

    @FindBy(css = "div.alert-form")
    WebElement alert;

    public void checkAlert(String message) {
        Assert.assertEquals(alert.getText(), message);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public WebElement findpSeries() {
        return pSeries;
    }

    public WebElement findpNumber() {
        return pNumber;
    }

    public WebElement findpDate() {
        return pDate;
    }

    public WebElement findpPlace() {
        return pPlace;
    }

    public WebElement findClientSurename() {
        return clientSurename;
    }

    public WebElement findClientName() {
        return clientName;
    }

    public WebElement findClientBirthdate() {
        return clientBirthdate;
    }

    public WebElement findInsurerSurename() {
        return insurerSurename;
    }

    public WebElement findInsurerName() {
        return insurerName;
    }

    public WebElement findInsurerMiddlename() {
        return insurerMiddlename;
    }

    public WebElement findInsurerBirthdate() {
        return insurerBirthdate;
    }

    public void chooseGender(String gender) {
        if (gender.equals("М")) {
            genderMale.click();
        } else if (gender.equals("Ж")) {
            genderFemale.click();
        }
    }

    public void checkClientSurename(String actualValue) {
        Assert.assertEquals(clientSurename.getAttribute("value"), actualValue);
    }

    public void checkClientName(String actualValue) {
        Assert.assertEquals(clientName.getAttribute("value"), actualValue);
    }

    public void checkClientBirthdate(String actualValue) {
        Assert.assertEquals(clientBirthdate.getAttribute("value"), actualValue);
    }

    public void checkInsurerSurename(String actualValue) {
        Assert.assertEquals(insurerSurename.getAttribute("value"), actualValue);
    }

    public void checkInsurerName(String actualValue) {
        Assert.assertEquals(insurerName.getAttribute("value"), actualValue);
    }

    public void checkInsurerMiddlename(String actualValue) {
        Assert.assertEquals(insurerMiddlename.getAttribute("value"), actualValue);
    }

    public void checkInsurerBirthdate(String actualValue) {
        Assert.assertEquals(insurerBirthdate.getAttribute("value"), actualValue);
    }

    public void checkpSeries(String actualValue) {
        Assert.assertEquals(pSeries.getAttribute("value"), actualValue);
    }

    public void checkpNumber(String actualValue) {
        Assert.assertEquals(pNumber.getAttribute("value"), actualValue);
    }

    public void checkpDate(String actualValue) {
        Assert.assertEquals(pDate.getAttribute("value"), actualValue);
    }

    public void checkpPlace(String actualValue) {
        Assert.assertEquals(pPlace.getAttribute("value"), actualValue);
    }
}
