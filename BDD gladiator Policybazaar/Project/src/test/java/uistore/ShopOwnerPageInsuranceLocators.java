package uistore;

import org.openqa.selenium.By;

public class ShopOwnerPageInsuranceLocators {

    private By clickCompanyName = By.xpath("(//input[@id='CompanyName'])[2]");
    private By clickMobile = By.xpath("(//input[@id='MobileNo'])[1]");
    private By waitForMobile = By.xpath("//div[@id='mobile-field-container']/div");
    private By clickViewPlans = By.xpath("(//button[@id='contunue'])[2]");

    private By clickDelhi = By.xpath("//li[contains(text(),'Delhi')]");
    private By clickMoreThan1cr = By.xpath("//input[@id='largelead1']");
    private By clickViewPlansAgain = By.xpath("(//button[contains(text(),'View ')])[1]");

    public By getClickViewPlansAgain() {
        return clickViewPlansAgain;
    }

    public By getClickMoreThan1cr() {
        return clickMoreThan1cr;
    }

    public By getClickDelhi() {
        return clickDelhi;
    }

    public By getWaitForMobile() {
        return waitForMobile;
    }

    public By getClickViewPlans() {
        return clickViewPlans;
    }

    public By getClickMobile() {
        return clickMobile;
    }

    public By getClickCompanyName() {
        return clickCompanyName;
    }

}
