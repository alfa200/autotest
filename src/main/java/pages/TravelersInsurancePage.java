package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelersInsurancePage extends BasePage{
    public TravelersInsurancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Оформить онлайн")
    WebElement registerOnline;

    public void waitAndClickregisterOnline(){
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(registerOnline)).click();
    }

    public void checkTitle(String title) {
        Assert.assertTrue(driver.getTitle().contains("Страхование путешественников"));
    }
}
