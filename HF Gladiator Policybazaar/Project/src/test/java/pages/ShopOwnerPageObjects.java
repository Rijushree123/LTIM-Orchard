package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ShopOwnerPageInsuranceLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class ShopOwnerPageObjects {

    WebDriverHelper helperObj;
    WebDriver driver;
    ShopOwnerPageInsuranceLocators shopLocatorsObj = new ShopOwnerPageInsuranceLocators();

    public ShopOwnerPageObjects(WebDriver driver) {
        helperObj = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickCompanyName(ExtentTest test) {
        try {
            helperObj.clickOnElement(shopLocatorsObj.getClickCompanyName());
            LoggerHandler.logInfo("Clicking Company Name successful");
            test.log(Status.PASS, "Clicking Company Name successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Company Name unsuccessful");
            test.log(Status.FAIL, "Clicking Company Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_CompanyName_Failed");
        }
    }

    public void enterCompanyName(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 2, 4);
            helperObj.sendKeys(shopLocatorsObj.getClickCompanyName(), data);
            LoggerHandler.logInfo("Entering Company Name successful");
            test.log(Status.PASS, "Entering Company Name successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Company Name unsuccessful");
            test.log(Status.FAIL, "Entering Company Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_CompanyName_Failed");
        }
    }

    public void clickMobile(ExtentTest test) {
        try {
            helperObj.clickOnElement(shopLocatorsObj.getClickMobile());
            LoggerHandler.logInfo("Clicking Mobile successful");
            test.log(Status.PASS, "Clicking Mobile successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Mobile unsuccessful");
            test.log(Status.FAIL, "Clicking Mobile unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Mobile_Failed");
        }
    }

    public void enterMobile(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 3, 4);
            helperObj.sendKeys(shopLocatorsObj.getClickMobile(), data);
            helperObj.waitForAttributeToBe(shopLocatorsObj.getWaitForMobile(), 10, "class", "field_check");
            LoggerHandler.logInfo("Entering Mobile successful");
            test.log(Status.PASS, "Entering Mobile successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Mobile unsuccessful");
            test.log(Status.FAIL, "Entering Mobile unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Mobile_Failed");
        }
    }

    public void clickViewPlans(ExtentTest test) {
        try {
            helperObj.clickOnElement(shopLocatorsObj.getClickViewPlans());
            helperObj.waitForElementToBeVisible(shopLocatorsObj.getClickDelhi(), 10);
            LoggerHandler.logInfo("Clicking View Plans successful");
            test.log(Status.PASS, "Clicking View Plans successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking View Plans unsuccessful");
            test.log(Status.FAIL, "Clicking View Plans unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_ViewPlans_Failed");
        }
    }

    public void clickDelhi(ExtentTest test) {
        try {
            helperObj.clickOnElement(shopLocatorsObj.getClickDelhi());
            LoggerHandler.logInfo("Clicking Delhi successful");
            test.log(Status.PASS, "Clicking Delhi successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Delhi unsuccessful");
            test.log(Status.FAIL, "Clicking Delhi unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Delhi_Failed");
        }
    }

    public void clickMoreThan1cr(ExtentTest test) {
        try {
            helperObj.clickOnElement(shopLocatorsObj.getClickMoreThan1cr());
            LoggerHandler.logInfo("Clicking Radio button successful");
            test.log(Status.PASS, "Clicking Radio button successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Radio button unsuccessful");
            test.log(Status.FAIL, "Clicking Radio button unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_RadioButton_Failed");
        }
    }

    public void clickViewPlansAgain(ExtentTest test) {
        try {
            helperObj.clickOnElement(shopLocatorsObj.getClickViewPlansAgain());
            LoggerHandler.logInfo("Clicking View Plans successful");
            test.log(Status.PASS, "Clicking View Plans successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking View Plans unsuccessful");
            test.log(Status.FAIL, "Clicking View Plans unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_ViewPlans_Failed");
        }
    }

    public void fillDetails(ExtentTest test){
        clickCompanyName(test);
        enterCompanyName(test);
        clickMobile(test);
        enterMobile(test);
        clickViewPlans(test);
        clickDelhi(test);
        clickMoreThan1cr(test);
        clickViewPlansAgain(test);
    }

}
