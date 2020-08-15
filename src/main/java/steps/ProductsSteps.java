package steps;

import pages.MainPage;
import pages.ProductsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ProductsSteps {

    @Step("Выбрать продукт Минимальный")
    public void stepClickProductMin() {
        new ProductsPage(BaseSteps.getDriver()).сlickProductMin();
    }

    @Step("Нажать Оформить")
    public void stepClickRegister() {
        new ProductsPage(BaseSteps.getDriver()).clickRegister();
    }

}
