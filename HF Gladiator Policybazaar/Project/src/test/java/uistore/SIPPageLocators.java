package uistore;

import org.openqa.selenium.By;

public class SIPPageLocators {

    private By clickUsername = By.id("userName");
    private By selectCountry = By.xpath("(//select[@class='countybox'])[1]");
    private By clickMobileNumber = By.xpath("(//input[@name='mobNumber'])[1]");
    private By clickViewPlansSIP = By.id("btnSubmitInvestment");

    public By getClickViewPlansSIP() {
        return clickViewPlansSIP;
    }

    public By getClickMobileNumber() {
        return clickMobileNumber;
    }

    public By getSelectCountry() {
        return selectCountry;
    }

    public By getClickUsername() {
        return clickUsername;
    }

}
