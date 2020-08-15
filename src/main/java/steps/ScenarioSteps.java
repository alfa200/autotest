package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;
import pages.TravelersInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.Map;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    ProductsSteps productSteps = new ProductsSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();
    TravelersInsuranceSteps travelersInsuranceSteps = new TravelersInsuranceSteps();

    @When("^Выбран пункт меню Страхование$")
    public void selectMenuItem(){
        mainSteps.stepSelectMenuItem();
    }

    @When("^Выбран пункт подменю Страхование путешественников$")
    public void selectInsuranceItem(){
        mainSteps.stepSelectInsuranceItem();
    }

    @Then("^Название страницы содержит \"(.+)\"$")
    public void checkTitle(String title){
        travelersInsuranceSteps.stepCheckTitle(title);
    }

    @When("^Нажата кнопка Оформить Онлайн$")
    public void waitAndClickregisterOnline(){
        travelersInsuranceSteps.stepWaitAndClickregisterOnline();
    }

    @When("^Выбрана страховая программа Минимальная$")
    public void сlickProductMin(){
        productSteps.stepClickProductMin();
    }

    @When("^Нажата кнопка оформить$")
    public void сlickRegister(){
        productSteps.stepClickRegister();
    }

    @When("^Заполняется информация о клиент:$")
    public void fillClientData(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        registrationSteps.stepFillClientData(hMap.get("Фамилия"), hMap.get("Имя"), hMap.get("Дата рождения"));
    }

    @When("^Заполняется информация о страхователе:$")
    public void fillInsurertData(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        registrationSteps.stepFillInsurerData(hMap.get("Фамилия"), hMap.get("Имя"), hMap.get("Отчество"), hMap.get("Дата рождения"), hMap.get("Пол"));
    }

    @When("^Заполняется информация о документе страхователе:$")
    public void fillInsurertDocument(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        registrationSteps.stepFillInsurerDocument(hMap.get("Серия"), hMap.get("Номер"), hMap.get("Дата"), hMap.get("Место"));
    }

    @Then("^Проверяется информация о клиент:$")
    public void ckeckClientData(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        registrationSteps.stepCheckClientData(hMap.get("Фамилия"), hMap.get("Имя"), hMap.get("Дата рождения"));
    }

    @When("^Проверяется информация о страхователе:$")
    public void checkInsurertData(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        registrationSteps.stepCheckInsurerData(hMap.get("Фамилия"), hMap.get("Имя"), hMap.get("Отчество"), hMap.get("Дата рождения"));
    }

    @When("^Проверяется информация о документе страхователе:$")
    public void checkInsurertDocument(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        registrationSteps.stepCheckInsurerDocument(hMap.get("Серия"), hMap.get("Номер"), hMap.get("Дата"), hMap.get("Место"));
    }

    @When("^Нажата кнопка Продолжить$")
    public void stepClickContinueButton() {
        registrationSteps.stepClickContinueButton();
    }

    @Then("^Появляется сообщение \"(.+)\"$")
    public void stepCheckAlert(String message) {
        registrationSteps.stepCheckAlert(message);
    }
}
