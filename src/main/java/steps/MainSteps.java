package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseSteps.getDriver;

public class MainSteps {

    @Step("Выбрано меню Страхование")
    public void stepSelectMenuItem(){
        new MainPage(BaseSteps.getDriver()).selectMenuItem();
    }

    @Step("Выбрано Страхование путешественников")
    public void stepSelectInsuranceItem(){

        new MainPage(BaseSteps.getDriver()).selectInsuranceItem();
    }

}
