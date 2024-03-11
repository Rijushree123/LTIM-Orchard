package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SIPInvestmentLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class SIPInvestmentPageObject {

    WebDriverHelper webDriverHelper;
    WebDriver driver;
    SIPInvestmentLocators sipInvestmentLocatorsObj = new SIPInvestmentLocators();

    public SIPInvestmentPageObject(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickGetDetails(ExtentTest test) {
        try {
            webDriverHelper.waitForElementToBeVisible(sipInvestmentLocatorsObj.getClickGetDetails(), 10);
            webDriverHelper.clickOnElement(sipInvestmentLocatorsObj.getClickGetDetails());
            LoggerHandler.logInfo("Clicking Get Details successful");
            test.log(Status.PASS, "Clicking Get Details successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Get Details unsuccessful");
            test.log(Status.FAIL, "Clicking Get Details unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_GetDetails_Failed");
        }
    }

    public void clickProceed(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(sipInvestmentLocatorsObj.getClickProceed());
            LoggerHandler.logInfo("Clicking Proceed successful");
            test.log(Status.PASS, "Clikcing Proceed successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Proceed unsuccessful");
            test.log(Status.FAIL, "Clicking Proceed unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Proceed_Failed");
        }
    }

}
