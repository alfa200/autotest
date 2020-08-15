package steps;

import org.openqa.selenium.By;
import pages.MainPage;
import pages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class RegistrationSteps{

    @Step("Ввод данных страхуемого с фамилией {0} с именем {1} и датой рождения {2}")
    public void stepFillClientData(String clientSureName, String clientName, String clientBirthdate){
        RegistrationPage registrationPage = new RegistrationPage(BaseSteps.getDriver());
        registrationPage.fillField(registrationPage.findClientSurename(), clientSureName);
        registrationPage.fillField(registrationPage.findClientName(), clientName);
        registrationPage.fillField(registrationPage.findClientBirthdate(), clientBirthdate);
    }

    @Step("Ввод данных страхователя с фамилией {0} с именем {1} с отчеством {2} с датой рождения {3} и полом {4}")
    public void stepFillInsurerData(String insurerSurename, String insurerName, String insurerMiddlename, String insurerBirthdate, String gender){
        RegistrationPage registrationPage = new RegistrationPage(BaseSteps.getDriver());
        registrationPage.chooseGender(gender);
        registrationPage.fillField(registrationPage.findInsurerSurename(), insurerSurename);
        registrationPage.fillField(registrationPage.findInsurerName(), insurerName);
        registrationPage.fillField(registrationPage.findInsurerMiddlename(), insurerMiddlename);
        registrationPage.fillField(registrationPage.findInsurerBirthdate(), insurerBirthdate);
    }

    @Step("Ввод данных паспорта страхователя с серией {0} с номером {1} с датой {2} с местом выдачи {3}")
    public void stepFillInsurerDocument(String pSeries, String pNumber, String pDate, String pPlace){
        RegistrationPage registrationPage = new RegistrationPage(BaseSteps.getDriver());
        registrationPage.fillField(registrationPage.findpSeries(), pSeries);
        registrationPage.fillField(registrationPage.findpNumber(), pNumber);
        registrationPage.fillField(registrationPage.findpDate(), pDate);
        registrationPage.fillField(registrationPage.findpPlace(), pPlace);
    }

    @Step("Проверка данных страхуемого с фамилией {0} с именем {1} и датой рождения {2}")
    public void stepCheckClientData(String clientSureName, String clientName, String clientBirthdate){
        RegistrationPage registrationPage = new RegistrationPage(BaseSteps.getDriver());
        registrationPage.checkClientSurename(clientSureName);
        registrationPage.checkClientBirthdate(clientBirthdate);
        registrationPage.checkClientName(clientName);
    }

    @Step("Проверка данных страхователя с фамилией {0} с именем {1} с отчеством {2} с датой рождения {3}")
    public void stepCheckInsurerData(String insurerSurename, String insurerName, String insurerMiddlename, String insurerBirthdate){
        RegistrationPage registrationPage = new RegistrationPage(BaseSteps.getDriver());
        registrationPage.checkInsurerBirthdate(insurerBirthdate);
        registrationPage.checkInsurerMiddlename(insurerMiddlename);
        registrationPage.checkInsurerName(insurerName);
        registrationPage.checkInsurerSurename(insurerSurename);
    }

    @Step("Проверка данных паспорта страхователя с серией {0} с номером {1} с датой {2} с местом выдачи {3}")
    public void stepCheckInsurerDocument(String pSeries, String pNumber, String pDate, String pPlace){
        RegistrationPage registrationPage = new RegistrationPage(BaseSteps.getDriver());
        registrationPage.checkpDate(pDate);
        registrationPage.checkpNumber(pNumber);
        registrationPage.checkpPlace(pPlace);
        registrationPage.checkpSeries(pSeries);
    }

    @Step("Нажать на кнопку Продолжить")
    public void stepClickContinueButton(){
        new RegistrationPage(BaseSteps.getDriver()).clickContinueButton();
    }

    @Step("Проверка наличия сообщения 'При заполнении данных произошла ошибка'")
    public void stepCheckAlert(String message){
        new RegistrationPage(BaseSteps.getDriver()).checkAlert(message);
    }
}
