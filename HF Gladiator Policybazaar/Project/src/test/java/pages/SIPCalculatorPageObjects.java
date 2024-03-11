package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SIPCalculatorPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SIPCalculatorPageObjects {

	WebDriver driver;
	WebDriverHelper webDriverHelper;
	SIPCalculatorPageLocators sipCalculatorPageLocators = new SIPCalculatorPageLocators();
	String excelFilePath = "./testdata/Testdata.xlsx";
	String sheetName = "Sheet1";

	public SIPCalculatorPageObjects(WebDriver driver) {
		webDriverHelper = new WebDriverHelper(driver);
		this.driver = driver;
	}

	public void clickOnYearlySIP(ExtentTest test) {
		try {
			String title=webDriverHelper.getTitle();
			Assert.assertTrue(title.contains("SIP"));
			String message = "Clicked on Yearly SIP";
			webDriverHelper.clickOnElement(sipCalculatorPageLocators.getYearlySIP());
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Throwable e) {
			String message = "Could not click on Yearly SIP";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Yearly_SIP");
		}

	}

	public void clickOnInvestAmount(ExtentTest test) {
		try {
			String message = "Clicked on Investment Amount";
			webDriverHelper.clickOnElement(sipCalculatorPageLocators.getInvestAmt());
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Exception e) {
			String message = "Could not click on Investment Amount";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Investment_Amount");
		}

	}

	public void enterOnInvestAmount(ExtentTest test) {
		try {
			String data = ExcelReader.readDatafromExcel(excelFilePath, sheetName, 2, 6);
			String message = "Entered value  on Investment Amount";
			webDriverHelper.clearElement(sipCalculatorPageLocators.getInvestAmt());
			webDriverHelper.sendKeys(sipCalculatorPageLocators.getInvestAmt(), data);
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Exception e) {
			String message = "Could not enter value on Investment Amount";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_enter_value_on_Investment_Amount");
		}
	}

	public void clickOnInvestYears(ExtentTest test) {
		try {
			String message = "Clicked on Investment Years";
			webDriverHelper.clickOnElement(sipCalculatorPageLocators.getInvestYears());
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Exception e) {
			String message = "Could not click on Investment Years";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Investment_Years");
		}
	}

	public void enterOnInvestYears(ExtentTest test) {
		try {
			String data = ExcelReader.readDatafromExcel(excelFilePath, sheetName, 3, 6);
			String message = "Entered value  on Investment Years";
			webDriverHelper.clearElement(sipCalculatorPageLocators.getInvestYears());
			webDriverHelper.sendKeys(sipCalculatorPageLocators.getInvestYears(), data);
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Exception e) {
			String message = "Could not enter value on Investment Years";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_enter_value_on_Investment_Years");
		}
	}

	public void clickOnExpectedReturn(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(sipCalculatorPageLocators.getExpectedReturn());
			String message = "Clicked on Expected Return Rate";
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Exception e) {
			String message = "Could not click on Expected Return Rate";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Expected_Return_Rate");
		}
	}

	public void enterOnExpectedReturn(ExtentTest test) {
		try {
			String data = ExcelReader.readDatafromExcel(excelFilePath, sheetName, 4, 6);
			webDriverHelper.clearElement(sipCalculatorPageLocators.getExpectedReturn());
			webDriverHelper.sendKeys(sipCalculatorPageLocators.getExpectedReturn(), data);
			String message = "Entered value on Expected Return Rate";
			test.pass(message);
			LoggerHandler.logInfo(message);
		} catch (Exception e) {
			String message = "Could not enter value on Expected Return Rate";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Could_not_enter_value_on_Expected_Return_Rate");
		}
	}

	public void getTotalWealth(ExtentTest test) {
		try {
			String totalWealth = webDriverHelper.getText(sipCalculatorPageLocators.getTotalWealth());
			String message = "Total Wealth: " + totalWealth.substring(1);
			Assert.assertTrue(totalWealth.contains("1.03"));
			test.pass(message);
			LoggerHandler.logInfo(message);
			Screenshot.getScreenShot(driver, "Total_Wealth");
		} catch (Throwable e) {
			test.fail("Total Wealth is not correct");
			LoggerHandler.logError("Total Wealth is not correct");
			Reporter.attachScreenshotToReport(test, driver, "Total_Wealth_is_not_correct");
		}
	}

	public void calculateSIP(ExtentTest test){
		clickOnYearlySIP(test);
        clickOnInvestAmount(test);
        enterOnInvestAmount(test);
        clickOnInvestYears(test);
        enterOnInvestYears(test);
        clickOnExpectedReturn(test);
        enterOnExpectedReturn(test);
        getTotalWealth(test);
	}
}
