package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "online-card-program[withoutnulls=\"true\"]")
    WebElement prooductMin;

    @FindBy(css = ".btn-primary")
    WebElement register;

    public void сlickProductMin(){
        //Без ожидания продукт "протухает"
        Boolean until = new WebDriverWait( driver, 30 ).until( new ExpectedCondition<Boolean>()
        {
            public Boolean apply( WebDriver webDriver )
            {
                try
                {
                    prooductMin.click();
                }
                catch( StaleElementReferenceException e )
                {
                    return false;
                }
                return true;
            }
        } );

    }

    public void clickRegister(){
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
    }

}
