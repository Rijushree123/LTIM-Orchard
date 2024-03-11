package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AboutShopPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AboutShopPageObjects {

    WebDriverHelper helperObj;
    WebDriver driver;
    AboutShopPageLocators aboutLocatorsObj = new AboutShopPageLocators();

    public AboutShopPageObjects(WebDriver driver) {
        helperObj = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickBusinessType(ExtentTest test) {
        try {
            helperObj.clickOnElement(aboutLocatorsObj.getClickBusinessType());
            String message = "Clicking on Business Type successful";
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
        } catch (Exception e) {
            String message = "Clicking on Business Type unsuccessful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Business_Type_Failed");
        }
    }

    public void enterBusinessType(ExtentTest test) {
        try {
            String message = "Clicking on Cafe shop unsuccessful";
            helperObj.clickOnElement(aboutLocatorsObj.getClickOnCafe());
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
        } catch (Exception e) {
            String message = "Clicking on Business Type successful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Entering_Business_Type_Failed");
        }
    }

    public void clickContinue(ExtentTest test) {
        try {
            String message = "Clicking on Continue successful";
            helperObj.clickOnElement(aboutLocatorsObj.getClickContinue());
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
        } catch (Exception e) {
            String message = "Clicking on Continue unsuccessful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Continue_Failed");
        }
    }

    public void clickValue(ExtentTest test) {
        try {
            String message = "Clicking on Value successful";
            helperObj.clickOnElement(aboutLocatorsObj.getClickValue());
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
        } catch (Exception e) {
            String message = "Clicking on Value unsuccessful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Value_Failed");
        }
    }

    public void enterValue(ExtentTest test) {
        try {
            String message = "Entering Value successful";
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 4, 4);
            helperObj.sendKeys(aboutLocatorsObj.getClickValue(), data);
            helperObj.waitForElementToBeVisible(aboutLocatorsObj.getClickValue(), 10);
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
        } catch (Exception e) {
            String message = "Entering Value unsuccessful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Entering_Value_Failed");
        }
    }

    public void clickGetQuote(ExtentTest test) {
        try {
            String message = "Entering Value successful";
            helperObj.clickOnElement(aboutLocatorsObj.getClickGetQuote());
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
            helperObj.waitForElementToBeVisible(aboutLocatorsObj.getVerifyThankYou(), 10);
            Screenshot.getScreenShot(driver, "Test_case_4_SS");
        } catch (Exception e) {
            String message = "Entering Value unsuccessful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Get_Quote_Failed");
        }
    }

    public void verifyThankYou(ExtentTest test) {
        try {
            String message = "Verifying Thank You successful";
            String str = helperObj.getText(aboutLocatorsObj.getVerifyThankYou());
            Assert.assertEquals(str, "Thank You");
            LoggerHandler.logInfo(message);
            test.log(Status.PASS, message);
        } catch (AssertionError e) {
            String message = "Verifying Thank You unsuccessful";
            LoggerHandler.logError(message);
            test.log(Status.FAIL, message);
            Reporter.attachScreenshotToReport(test, driver, "Verifying_Thank_You_Failed");
        }
    }

    public void fillBusinessDetails(ExtentTest test){
        clickBusinessType(test);
        enterBusinessType(test);
        clickContinue(test);
        clickValue(test);
        enterValue(test);
        clickContinue(test);
    }
    

}
