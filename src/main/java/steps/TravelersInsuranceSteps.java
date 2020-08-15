package steps;

import pages.MainPage;
import pages.TravelersInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

public class TravelersInsuranceSteps {

    @Step("Проверка Title страницы")
    public void stepCheckTitle(String title){
        new TravelersInsurancePage(BaseSteps.getDriver()).checkTitle(title);
    }

    @Step("Нажать на кнопку Оформить Онлайн")
    public void stepWaitAndClickregisterOnline(){
        new TravelersInsurancePage(BaseSteps.getDriver()).waitAndClickregisterOnline();
    }

}
