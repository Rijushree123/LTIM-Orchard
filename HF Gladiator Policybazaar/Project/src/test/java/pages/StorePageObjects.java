package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.StorePageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class StorePageObjects {

    WebDriverHelper helperObj;
    WebDriver driver;
    StorePageLocators storepageLocatorsObj = new StorePageLocators();

    public StorePageObjects(WebDriver driver) {
        helperObj = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickOnSearch(ExtentTest test) {
        try {
            helperObj.clickOnElement(storepageLocatorsObj.getClickOnSearch());
            LoggerHandler.logInfo("Clicking Search successful");
            test.log(Status.PASS, "Clicking Search successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Search unsuccessful");
            test.log(Status.FAIL, "Clicking Search unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Search_Failed");
        }
    }

    public void enterSearch(ExtentTest test) {
        try {
            String data=ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 2, 9);
            helperObj.sendKeys(storepageLocatorsObj.getClickOnSearch(), data);
            LoggerHandler.logInfo("Entering in Search successful");
            test.log(Status.PASS, "Entering in Search successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering in Search unsuccessful");
            test.log(Status.FAIL, "Entering in Search unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Search_Failed");
        }
    }

    public void clickOnChennai(ExtentTest test) {
        try {
            helperObj.clickOnElement(storepageLocatorsObj.getClickOnChennai());
            helperObj.waitForElementToBeVisible(storepageLocatorsObj.getWaitForMaps(), 10);
            LoggerHandler.logInfo("Clicking on Chennai successful");
            test.log(Status.PASS, "Clicking on Chennai successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Chennai unsuccessful");
            test.log(Status.FAIL, "Clicking on Chennai unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Chennai_Failed");
        }
    }

    public void searchForCity(ExtentTest test){
        clickOnSearch(test);
        enterSearch(test);
        clickOnChennai(test);
    }
}
