package uistore;

import org.openqa.selenium.By;

public class AboutShopPageLocators {

    private By clickBusinessType = By.xpath("//input[@id='CategoryID']");
    private By clickOnCafe = By.xpath("//li[@id='CategoryID-option-8']");
    private By clickContinue = By.xpath("//button[contains(text(),'Continue')]");
    private By clickValue = By.xpath("//input[@id='BuildingValue']");
    private By clickGetQuote = By.xpath("//button[@id='BajajAllianz-Quote-Btn']");
    private By verifyThankYou = By.xpath("//div[@class='thanks-left desktop']/h2");

    public By getVerifyThankYou() {
        return verifyThankYou;
    }

    public By getClickGetQuote() {
        return clickGetQuote;
    }

    public By getClickValue() {
        return clickValue;
    }

    public By getClickContinue() {
        return clickContinue;
    }

    public By getClickOnCafe() {
        return clickOnCafe;
    }

    public By getClickBusinessType() {
        return clickBusinessType;
    }

}
