package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "li.lg-menu__item:nth-child(7) > button:nth-child(1) > span")
    WebElement menuItems;

    @FindBy(linkText = "Страхование путешественников")
    WebElement menuInsurance;

    public void selectMenuItem() {
        menuItems.click();
    }

    public void selectInsuranceItem() {
        menuInsurance.click();
    }
}
