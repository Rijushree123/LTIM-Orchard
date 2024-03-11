package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BikeCheckOutPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class BikeCheckOutPageObjects {
    WebDriver driver;
    WebDriverHelper webDriverHelper;
    BikeCheckOutPageLocators bikeCheckOutPageLocators = new BikeCheckOutPageLocators();

    public BikeCheckOutPageObjects(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void enterFullName(ExtentTest test) {
        try {
            String file = System.getProperty("user.dir") + "/testdata/Testdata.xlsx";
            String name = ExcelReader.readDatafromExcel(file, "Sheet1", 3, 3);
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getFullName(), 15);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getFullName());
            webDriverHelper.clearElement(bikeCheckOutPageLocators.getFullName());
            webDriverHelper.clearElement(bikeCheckOutPageLocators.getFullName());
            webDriverHelper.waitForClearElement(bikeCheckOutPageLocators.getFullName(), 10);
            webDriverHelper.sendKeys(bikeCheckOutPageLocators.getFullName(), name);
            webDriverHelper.waitForattributeContains(bikeCheckOutPageLocators.getFullName(), "value", name);
            test.log(Status.PASS, "Entered Full Name");
            LoggerHandler.logInfo("Entered Full Name");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Enter Full Name");
            LoggerHandler.logError("Failed to Enter Full Name");
        }
    }

    public void enterEmail(ExtentTest test) {
        try {
            String file = System.getProperty("user.dir") + "/testdata/Testdata.xlsx";
            String email = ExcelReader.readDatafromExcel(file, "Sheet1", 4, 3);
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getEmailNumber(), 30);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getEmailNumber());
            webDriverHelper.sendKeys(bikeCheckOutPageLocators.getEmailNumber(), email);
            test.log(Status.PASS, "Entered Email");
            LoggerHandler.logInfo("Entered Email");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to enter email");
            LoggerHandler.logError("Failed to enter email");
        }
    }

    public void enterMobileNumber(ExtentTest test) {
        try {
            String file = System.getProperty("user.dir") + "/testdata/Testdata.xlsx";
            String phone = ExcelReader.readDatafromExcel(file, "Sheet1", 5, 3);
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getMobileNumber(), 30);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getMobileNumber());
            webDriverHelper.sendKeys(bikeCheckOutPageLocators.getMobileNumber(), phone);
            test.log(Status.PASS, "Entered Mobile Number");
            LoggerHandler.logInfo("Entered Mobile Number");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Enter Mobile Number");
            LoggerHandler.logError("Failed to Enter Mobile Number");
        }
    }

    public void selectDate(ExtentTest test) {
        try {
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getDayDropDown(), 30);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getDayDropDown());
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getDayDropDown22(), 15);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getDayDropDown22());
            test.log(Status.PASS, "Select date");
            LoggerHandler.logInfo("Select date");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to select date");
            LoggerHandler.logError("Failed to select date");
        }
    }

    public void selectMonth(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getMonthDropDown());
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getMonthDropDownJuly(), 15);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getMonthDropDownJuly());
            test.log(Status.PASS, "Select month");
            LoggerHandler.logInfo("Select month");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to select month");
            LoggerHandler.logError("Failed to select month");
        }
    }

    public void clickPayNowButton(ExtentTest test) {
        try {
            webDriverHelper.waitForElementToBeVisible(bikeCheckOutPageLocators.getPayNowButton(), 20);
            webDriverHelper.clickOnElement(bikeCheckOutPageLocators.getPayNowButton());
            test.log(Status.PASS, "Clicked on pay now button");
            LoggerHandler.logInfo("Clicked on pay now button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on pay now button");
            LoggerHandler.logError("Failed to click on pay now button");
        }
    }
    public void fillBikeCheckoutDetails(ExtentTest test) {
        try {
            enterFullName(test);
            enterEmail(test);
            enterMobileNumber(test);
            selectDate(test);
            selectMonth(test);
            clickPayNowButton(test);
            test.log(Status.PASS, "Filled bike checkout page details");
            LoggerHandler.logInfo("Filled bike checkout page details");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Fill bike checkout page details");
            LoggerHandler.logError("Failed to Fill bike checkout page details");
        }
    }
}
