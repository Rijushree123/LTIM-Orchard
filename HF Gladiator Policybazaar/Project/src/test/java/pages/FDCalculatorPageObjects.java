package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.FDCalculatorPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class FDCalculatorPageObjects {

	WebDriverHelper webDriverHelper;
	WebDriver driver;
	FDCalculatorPageLocators fdCalculatorPageLocators = new FDCalculatorPageLocators();
	String excelFilePath = "./testdata/Testdata.xlsx";
	String sheetName = "Sheet1";

	public FDCalculatorPageObjects(WebDriver driver) {
		webDriverHelper = new WebDriverHelper(driver);
		this.driver = driver;
	}

	public void clickOnName(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(fdCalculatorPageLocators.getName());
			test.pass("Clicked on Name");
			LoggerHandler.logInfo("Clicked on Name");
		} catch (Exception e) {
			test.fail("Could not click on Name");
			LoggerHandler.logError("Could not click on Name");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Name");
		}
	}

	public void enterOnName(ExtentTest test) {
		try {
			String data = ExcelReader.readDatafromExcel(excelFilePath, sheetName, 2, 8);
			webDriverHelper.sendKeys(fdCalculatorPageLocators.getName(), data);
			test.pass("Entered Value on Name");
			LoggerHandler.logInfo("Entered Value on Name");
		} catch (Exception e) {
			test.fail("Could not Enter Value on Name");
			LoggerHandler.logError("Could not Enter Value on Name");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_Enter_Value_on_Name");
		}
	}

	public void clickOnMobile(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(fdCalculatorPageLocators.getCountryCode());
			webDriverHelper.clickOnElement(fdCalculatorPageLocators.getOptionIndia());
			webDriverHelper.clickOnElement(fdCalculatorPageLocators.getMobile());
			test.pass("Clicked on Mobile Number");
			LoggerHandler.logInfo("Clicked on Mobile Number");
		} catch (Exception e) {
			test.fail("Could not click on Mobile Number");
			LoggerHandler.logError("Could not click on Mobile Number");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Mobile_Number");
		}
	}

	public void enterOnMobile(ExtentTest test) {
		try {
			String data = ExcelReader.readDatafromExcel(excelFilePath, sheetName, 3, 8);
			webDriverHelper.sendKeys(fdCalculatorPageLocators.getMobile(), data);
			test.pass("Entered Value on Mobile Number");
			LoggerHandler.logInfo("Entered Value on Mobile Number");
		} catch (Exception e) {
			test.fail("Could not Enter Value on Mobile Number");
			LoggerHandler.logError("Could not Enter Value on Mobile Number");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_Enter_Value_on_Mobile_Number");
		}
	}

	public void clickOnViewPlans(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(fdCalculatorPageLocators.getViewPlans());
			test.pass("Clicked on View Plans");
			LoggerHandler.logInfo("Clicked on View Plans");
		} catch (Exception e) {
			test.fail("Could not click on View Plans");
			LoggerHandler.logError("Could not click on View Plans");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_View_Plans");
		}
	}
}
