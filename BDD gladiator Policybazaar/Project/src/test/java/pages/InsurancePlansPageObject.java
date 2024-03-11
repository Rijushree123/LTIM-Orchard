package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.InsurancePlansPageLocators;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class InsurancePlansPageObject {
    WebDriver driver;
    WebDriverHelper webDriverHelper;
    InsurancePlansPageLocators insurancePlansPageLocators = new InsurancePlansPageLocators();

    public InsurancePlansPageObject(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickFirstPlanPrice(ExtentTest test) {
        try {
            webDriverHelper.waitForElementToBeVisible(insurancePlansPageLocators.getInsurance102(), 15);
            webDriverHelper.clickOnElement(insurancePlansPageLocators.getInsurance102());
            test.log(Status.PASS, "Clicked on First Plan Price");
            LoggerHandler.logInfo("Clicked on First Plan Price");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on First Plan Price");
            LoggerHandler.logError("Failed to click on First Plan Price");
        }
    }
}
