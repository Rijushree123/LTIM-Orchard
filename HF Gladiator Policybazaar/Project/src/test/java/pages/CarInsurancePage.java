package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.CarInsuranceLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CarInsurancePage {
	WebDriverHelper driverHelper;
	WebDriver driver;
	CarInsuranceLocators carInsuranceLocatorsObj = new CarInsuranceLocators();

	public CarInsurancePage(WebDriver driver) {
		driverHelper = new WebDriverHelper(driver);
		this.driver = driver;
	}

	public void clickOnCarInsurance(ExtentTest test) {
		try {
			driverHelper.clickOnElement(carInsuranceLocatorsObj.getCarInsurance());
			LoggerHandler.logInfo("Click on car insurance");
			test.pass("clicked On Car Insurance");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to click on term insurance claculator");
			test.fail("clickOnCarInsurance");
			Reporter.attachScreenshotToReport(test, driver, "clickOnCarInsurance");
		}
	}

	public void enterTheCarNumber(ExtentTest test) {
		try {

			driverHelper.jsClick(carInsuranceLocatorsObj.getInputBox());
			String carNumber = ExcelReader
					.readDatafromExcel("/home/coder/project/workspace/Project/testdata/Testdata.xlsx", "sheet1", 2, 7);
			driverHelper.sendKeys(carInsuranceLocatorsObj.getInputBox(), carNumber);
			LoggerHandler.logInfo("Entered the car number");
			test.pass("Entered the car number");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to enter car number");
			test.fail("enterTheCarNumber");
			Reporter.attachScreenshotToReport(test, driver, "enterTheCarNumber");
		}
	}

	public void clickOnViewPrices(ExtentTest test) {
		try {
			driverHelper.clickOnElement(carInsuranceLocatorsObj.getViewPrices());
			LoggerHandler.logInfo("Click on view prices");
			test.pass("clicked on view prices");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to click on view prices");
			test.fail("clickOnViewPrices");
			Reporter.attachScreenshotToReport(test, driver, "clickOnViewPrices");
		}
	}

	public void clickOnAccessoriesCover(ExtentTest test) {
		try {
			driverHelper.waitForElementToBeVisible(carInsuranceLocatorsObj.getAccessoriesCover(), 10);
			driverHelper.clickOnElement(carInsuranceLocatorsObj.getAccessoriesCover());
			LoggerHandler.logInfo("Click on accessories cover");
			test.pass("clicked on accessories cover");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to click on accessories cover");
			test.fail("clickOnAccessoriesCover");
			Reporter.attachScreenshotToReport(test, driver, "clickOnAccessoriesCover");
		}
	}

	public void clickOnelectricalAccessories(ExtentTest test) {
		try {
			driverHelper.clickOnElement(carInsuranceLocatorsObj.getElectricalAccessories());
			driverHelper.clickOnElement(carInsuranceLocatorsObj.getElectricalAccessoriesBox());
			Assert.assertTrue(driverHelper.getElement(carInsuranceLocatorsObj.getCheckBox()).isSelected());
			LoggerHandler.logInfo("Click on electrical accessories");
			test.pass("clicked on electrical accessories");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to click on electrical accessories");
			test.fail("clickOnelectricalAccessories");
			Reporter.attachScreenshotToReport(test, driver, "clickOnelectricalAccessories");
		}
	}

	public void clickOnFirstInsurancePolicy(ExtentTest test) {
		try {
			driverHelper.clickOnElement(carInsuranceLocatorsObj.getFirstInsurancePolicy());
			LoggerHandler.logInfo("Click on first insurance policy");
			test.pass("clicked On first insurance policy");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to click on first insurance policy");
			test.fail("clickOnFirstInsurancePolicy");
			Reporter.attachScreenshotToReport(test, driver, "clickOnFirstInsurancePolicy");
		}
	}

	public void verifyText(ExtentTest test) {
		try {
			driverHelper.waitForElementToBeVisible(carInsuranceLocatorsObj.getWaitForLastPage(), 10);
			Screenshot.getScreenShot(driver, "verifyText");
			String text = driverHelper.getText(carInsuranceLocatorsObj.getTextToBeVerify());
			Assert.assertEquals(text, "Critical Details");
			LoggerHandler.logInfo("Text verified");
			test.pass("verified text");
		} catch (AssertionError e) {
			e.getMessage();
			LoggerHandler.logError("Not able to verify text");
			test.fail("verifyText");
		} catch (Exception e) {
			LoggerHandler.logError("Not able to verify text");
			test.fail("verifyText");
			Reporter.attachScreenshotToReport(test, driver, "verifyText");
		}
	}
}
