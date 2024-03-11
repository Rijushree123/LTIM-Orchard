package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.TermInsuranceCalculatorLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TermInsuranceCalculatorPage {
    WebDriverHelper driverHelper;
    WebDriver driver;
    TermInsuranceCalculatorLocators termInsuranceLocatorObj = new TermInsuranceCalculatorLocators();

    public TermInsuranceCalculatorPage(WebDriver driver) {
        driverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickOnTermInsuranceCalculators(ExtentTest test) {
        try {
            driverHelper.clickOnElement(termInsuranceLocatorObj.getTermInsuranceCalculators());
            LoggerHandler.logInfo("Click on term insurance claculator");
            test.pass("clicked on term insurance calculators");
        } catch (Exception e) {
            LoggerHandler.logError("Not able to click on term insurance claculator");
            test.fail("clickOnTermInsuranceCalculators");
            Reporter.attachScreenshotToReport(test, driver, "clickOnTermInsuranceCalculators");
        }
    }

    public void clickOnFemaleCheckBox(ExtentTest test) {
        try {
            driverHelper.waitForElementToBeVisible(termInsuranceLocatorObj.getCheckYourPremium(), 10);
            driverHelper.clickOnElement(termInsuranceLocatorObj.getFemaleCheckBox());
            LoggerHandler.logInfo("Click on female check box");
            test.pass("clicked on female check box");
        } catch (Exception e) {
            LoggerHandler.logError("Not able to click on female check box");
            test.fail("clickOnFemaleCheckBox");
            Reporter.attachScreenshotToReport(test, driver, "clickOnFemaleCheckBox");
        }
    }

    public void selectAgeFromDropdown(ExtentTest test) {
        try {
            driverHelper.selectFromDropdown(termInsuranceLocatorObj.getSelectAge(), "26 Years");
            LoggerHandler.logInfo("Able to select age from the dropdown");
            test.pass("selected age from dropdown");
        } catch (Exception e) {
            LoggerHandler.logError("Not able to select age from the dropdown");
            test.fail("selectAgeFromDropdown");
            Reporter.attachScreenshotToReport(test, driver, "selectAgeFromDropdown");
        }
    }

    public void selectLifeCoverRequiredFromDropdown(ExtentTest test) {
        try {
            driverHelper.selectFromDropdown(termInsuranceLocatorObj.getSelectLifeCoverRequired(), "90 Lac");
            LoggerHandler.logInfo("Able to select life covere required from the dropdown");
            test.pass("selected life cover required from dropdown");
        } catch (Exception e) {
            LoggerHandler.logError("Not able to select life covere required from the dropdown");
            test.fail("selectLifeCoverRequiredFromDropdown");
            Reporter.attachScreenshotToReport(test, driver, "selectLifeCoverRequiredFromDropdown");
        }
    }

    public void selectCoverTillAgeFromDropdown(ExtentTest test) {
        try {
            driverHelper.selectFromDropdown(termInsuranceLocatorObj.getSelectCoverTillAge(), "36 Yrs");
            LoggerHandler.logInfo("Able to select covere till age from the dropdown");
            test.pass("selected cover till age from dropdown");
        } catch (Exception e) {
            LoggerHandler.logError("Not able to select covere till age from the dropdown");
            test.fail("selectCoverTillAgeFromDropdown");
            Reporter.attachScreenshotToReport(test, driver, "selectCoverTillAgeFromDropdown");
        }
    }

    public void isPremiumCalculatorPage(ExtentTest test) {
        try {
            LoggerHandler.logInfo("On the premium calculator page");
            test.pass("Is Premium Calculator Page");
        } catch (Exception e) {
            LoggerHandler.logError("Not on the premium calculator page");
            test.fail("Is Premium Calculator Page");
            Reporter.attachScreenshotToReport(test, driver, "isPremiumCalculatorPage");
        }
    }

    public void printAmountOfPremiumDisplayed(ExtentTest test) {
        try {
            Screenshot.getScreenShot(driver, "PrimiumAmount");
            String amount = driverHelper.getText(termInsuranceLocatorObj.getPremiumDisplayed());
            LoggerHandler.logInfo("Amount of premium: " + amount);
            driverHelper.waits(2);
            test.pass("print amount of premium displayed");
        } catch (IOException e) {
            LoggerHandler.logError("Amount of premium not printed");
            test.fail("printAmountOfPremiumDisplayed");
            Reporter.attachScreenshotToReport(test, driver, "printAmountOfPremiumDisplayed");
        }
    }

    public void captureScreenShot(ExtentTest test) {
        try {
            Screenshot.getScreenShot(driver, "PrimiumAmount1");
            LoggerHandler.logInfo("Able to cpature the scrrenshot");
            test.pass("Captured Screenshot");
        } catch (Exception e) {
            LoggerHandler.logError("Not able to capture the screen shot");
            test.fail("capture scrrenshot");
            Reporter.attachScreenshotToReport(test, driver, "printAmountOfPremiumDisplayed");

        }
    }
}
