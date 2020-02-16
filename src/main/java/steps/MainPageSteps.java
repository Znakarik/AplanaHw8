package steps;

import io.qameta.allure.Step;
import pages.MainPage;


public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Step("Нажимаем на \"Ипотека\"")
    public void selectTopMenu(String name) throws InterruptedException {
        new MainPage().selectSubMenu(mainPage.topMenu,name);
    }

    @Step("Нажимаем на \"Ипотека на готовое жильё\"")
    public void selectSubMenu(String name) throws InterruptedException {
        new MainPage().selectSubMenu(mainPage.subMenu,name);
    }
}
