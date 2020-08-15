import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.ProductsPage;
import pages.RegistrationPage;
import pages.TravelersInsurancePage;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

@RunWith(value = DataProviderRunner.class)
public class InsuranceTest extends BaseSteps {

    @DataProvider
    public static Object[][] TestData() {
        return new Object[][]{{"Страхование путешественников", "Иванов", "Иван", "11.12.1980", "Петров", "Петр", "Петрович", "12.11.1985", "Ж", "1234", "567890", "21.12.2005", "ОВД", "При заполнении данных произошла ошибка"}};
    }

    @Test
    @Ignore
    @Title("Страхование")
    @UseDataProvider("TestData")
    public void testInsurance(String title, String clientSureName, String clientName, String clientBirthdate,
                              String insurerSurename, String insurerName, String insurerMiddlename, String insurerBirthdate, String gender,
                              String pSeries, String pNumber, String pDate, String pPlace, String message) throws Exception {


        MainSteps mainSteps = new MainSteps();
        ProductsSteps productSteps = new ProductsSteps();
        RegistrationSteps registrationSteps = new RegistrationSteps();
        TravelersInsuranceSteps travelersInsuranceSteps = new TravelersInsuranceSteps();

        mainSteps.stepSelectMenuItem();
        mainSteps.stepSelectInsuranceItem();

        travelersInsuranceSteps.stepCheckTitle(title);
        travelersInsuranceSteps.stepWaitAndClickregisterOnline();

        productSteps.stepClickProductMin();
        productSteps.stepClickRegister();

        registrationSteps.stepFillClientData(clientSureName, clientName, clientBirthdate);
        registrationSteps.stepFillInsurerData(insurerSurename, insurerName, insurerMiddlename, insurerBirthdate, gender);
        registrationSteps.stepFillInsurerDocument(pSeries, pNumber, pDate, pPlace);

        registrationSteps.stepCheckClientData(clientSureName, clientName, clientBirthdate);
        registrationSteps.stepCheckInsurerData(insurerSurename, insurerName, insurerMiddlename, insurerBirthdate);
        registrationSteps.stepFillInsurerDocument(pSeries, pNumber, pDate, pPlace);

        registrationSteps.stepClickContinueButton();
        registrationSteps.stepCheckAlert(message);
    }
}
