package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SIPPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class SIPPageObjects {

    WebDriverHelper helperObj;
    WebDriver driver;
    SIPPageLocators sipLocatorsObj = new SIPPageLocators();

    public SIPPageObjects(WebDriver driver) {
        helperObj = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickUsername(ExtentTest test) {
        try {
            helperObj.clickOnElement(sipLocatorsObj.getClickUsername());
            LoggerHandler.logInfo("Clicking Username successful");
            test.log(Status.PASS, "Clikcing Username successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Username unsuccessful");
            test.log(Status.FAIL, "Clicking Username unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Username_Failed");
        }
    }

    public void enterUsername(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 2, 2);
            helperObj.sendKeys(sipLocatorsObj.getClickUsername(), data);
            LoggerHandler.logInfo("Entering Username successful");
            test.log(Status.PASS, "Entering Username successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Username unsuccessful");
            test.log(Status.FAIL, "Entering Username unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Username_Failed");
        }
    }

    public void selectIndia(ExtentTest test) {
        try {
            helperObj.selectDropdownByIndex(sipLocatorsObj.getSelectCountry(), 0);
            LoggerHandler.logInfo("Selecting India in dropdown successful");
            test.log(Status.PASS, "Selecting India in dropdown successful");
        } catch (Exception e) {
            LoggerHandler.logError("Selecting India in dropdown unsuccessful");
            test.log(Status.FAIL, "Selecting India in dropdown unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Selecting_India_Failed");
        }
    }

    public void clickMobileNumber(ExtentTest test) {
        try {
            helperObj.clickOnElement(sipLocatorsObj.getClickMobileNumber());
            LoggerHandler.logInfo("Clicking Mobile Number successful");
            test.log(Status.PASS, "Clicking Mobile Number successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Mobile Number unsuccessful");
            test.log(Status.FAIL, "Clicking Mobile Number unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_MobileNumber_Failed");
        }
    }

    public void enterMobileNumber(ExtentTest test) {
        try {
            helperObj.sendKeys(sipLocatorsObj.getClickMobileNumber(), "9943245678");
            LoggerHandler.logInfo("Entering Mobile Number successful");
            test.log(Status.PASS, "Entering Mobile Number successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Mobile Number unsuccessful");
            test.log(Status.FAIL, "Entering Mobile Number unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_MobileNumber_Failed");
        }
    }

    public void clickViewPlansSIP(ExtentTest test) {
        try {
            helperObj.clickOnElement(sipLocatorsObj.getClickViewPlansSIP());
            LoggerHandler.logInfo("Clicking View Plans successful");
            test.log(Status.PASS, "Clicking View Plans successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking View Plans unsuccessful");
            test.log(Status.FAIL, "Clicking View Plans unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_ViewPlans_Failed");
        }
    }

    public void enterUSernameAndMobileNo(ExtentTest test) 
    {
        clickUsername(test);
        enterUsername(test);
        selectIndia(test);
        clickMobileNumber(test);
        enterMobileNumber(test);
        clickViewPlansSIP(test);
    }
        
}