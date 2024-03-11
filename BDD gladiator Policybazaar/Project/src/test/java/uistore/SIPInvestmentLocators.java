package uistore;

import org.openqa.selenium.By;

public class SIPInvestmentLocators {

    private By clickOnCurrentCity = By.id("txtCity");

    private By clickAmount = By.xpath("//span[@class='investamt']/input");
    private By clickGetDetails = By.xpath("(//button[contains(text(),'Get Details')])[4]");
    private By clickProceed = By.xpath("//button[contains(text(),'Proceed')]");

    public By getClickProceed() {
        return clickProceed;
    }

    public By getClickGetDetails() {
        return clickGetDetails;
    }

    public By getClickAmount() {
        return clickAmount;
    }

    public By getClickOnCurrentCity() {
        return clickOnCurrentCity;
    }

}
