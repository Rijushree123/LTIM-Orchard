package uistore;

import org.openqa.selenium.By;

public class ChennaiPageLocators {

    private By clickOnScheduleHomeVisit = By.xpath("//button[@class='schedule-visit']");
    private By waitForPopup = By.xpath("//div[@class='popup']");
    private By clickOnName = By.id("txtName");
    private By clickOnMob = By.id("mobNumber");
    private By clickOnInterested = By.id("product");
    private By clickAddress1 = By.id("address_1");
    private By clickAddress2 = By.id("address_2");
    private By clickPincode = By.id("pincode");
    private By clickTomorrow = By.xpath("//span[contains(text(),'Tomorrow')]");
    private By clickOn3rdSlot = By.xpath("//span[contains(text(),'12PM-2PM')]");
    private By clickConfirm = By.xpath("//span[@class='booking']");
    private By verifyMessage = By.xpath("//div[@class='thank-text']");

    public By getVerifyMessage() {
        return verifyMessage;
    }

    public By getClickConfirm() {
        return clickConfirm;
    }

    public By getClickOn3rdSlot() {
        return clickOn3rdSlot;
    }

    public By getClickTomorrow() {
        return clickTomorrow;
    }

    public By getClickPincode() {
        return clickPincode;
    }

    public By getClickAddress2() {
        return clickAddress2;
    }

    public By getClickAddress1() {
        return clickAddress1;
    }

    public By getClickOnInterested() {
        return clickOnInterested;
    }

    public By getClickOnMob() {
        return clickOnMob;
    }

    public By getClickOnName() {
        return clickOnName;
    }

    public By getWaitForPopup() {
        return waitForPopup;
    }

    public By getClickOnScheduleHomeVisit() {
        return clickOnScheduleHomeVisit;
    }

}
