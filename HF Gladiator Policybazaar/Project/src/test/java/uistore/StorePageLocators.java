package uistore;

import org.openqa.selenium.By;

public class StorePageLocators {

    private By clickOnSearch = By.xpath("(//input[@id='tags'])[1]");
    private By clickOnChennai = By.xpath("//li[@class='ui-menu-item']");
    private By waitForMaps = By.xpath("//div[@title='Policybazaar']");

    public By getWaitForMaps() {
        return waitForMaps;
    }

    public By getClickOnChennai() {
        return clickOnChennai;
    }

    public By getClickOnSearch() {
        return clickOnSearch;
    }

}
