package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.InvestmentPlansPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class InvestmentPlansPageObjects {

	InvestmentPlansPageLocators investmentPlansPageLocators = new InvestmentPlansPageLocators();
	WebDriver driver;
	WebDriverHelper webDriverHelper;

	public InvestmentPlansPageObjects(WebDriver driver) {
		webDriverHelper = new WebDriverHelper(driver);
		this.driver = driver;
	}

	public void getPageTitle(ExtentTest test) {
		try {
			webDriverHelper.waitForElementToBeVisible(investmentPlansPageLocators.getLocation(), 20);
			String title = webDriverHelper.getTitle();
			String message = "Investment Plan is the title of the page";
			Assert.assertEquals(title, "Investment Plan");
			test.pass(message);
			LoggerHandler.logInfo(message);
			Screenshot.getScreenShot(driver, "Investment Plan");
		} catch (Throwable e) {
			String message = "Investment Plan is not the title of the page";
			test.fail(message);
			LoggerHandler.logError(message);
			Reporter.attachScreenshotToReport(test, driver, "Investment_Plan_is_not_the_title_of_the_page");
		}
	}

	public void clickOnLocation(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(investmentPlansPageLocators.getLocation());
			test.pass("Clicked on Location");
			LoggerHandler.logInfo("Clicked on Location");
		} catch (Exception e) {
			test.fail("Could not click on Location");
			LoggerHandler.logError("Could not click on Location");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Location");
		}
	}

	public void enterOnLocation(ExtentTest test) {
		try {
			webDriverHelper.sendKeys(investmentPlansPageLocators.getLocation(), "Bhubaneswar");
			webDriverHelper.waits(1);
			test.pass("Entered Value on Location");
			LoggerHandler.logInfo("Entered Value on Location");
		} catch (Exception e) {
			test.fail("Could not enter Value on Location");
			LoggerHandler.logError("Could not enter Value on Location");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Location");
		}
	}

	public void clickOnLocationDropdown(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(investmentPlansPageLocators.getLocationDropdown());
			test.pass("Clicked on Dropdown");
		} catch (Exception e) {
			test.fail("Could not click on Dropdown");
			LoggerHandler.logError("Could not click on Dropdown");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Dropdown");
		}
	}

	public void clickOnAge(ExtentTest test) {
		try {
			webDriverHelper.clickOnElement(investmentPlansPageLocators.getAge());
			test.pass("Clicked on Age");
			LoggerHandler.logInfo("Clicked on Age");
		} catch (Exception e) {
			test.fail("Could not click on Age");
			LoggerHandler.logError("Could not click on Age");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Age");
		}
	}

	public void enterOnAge(ExtentTest test) {
		try {
			webDriverHelper.sendKeys(investmentPlansPageLocators.getAge(), "20");
			test.pass("Entered value on Age");
			LoggerHandler.logInfo("Entered value on Age");
		} catch (Exception e) {
			test.fail("Could not enter value on Age");
			LoggerHandler.logError("Could not enter value on Age");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_enter_value_on_Age");
		}
	}

	public void pressEnterOnAge(ExtentTest test) {
		try {
			webDriverHelper.enterAction(investmentPlansPageLocators.getAge());
			test.pass("Pressed Enter");
			LoggerHandler.logInfo("Pressed Enter");
		} catch (Exception e) {
			test.fail("Could Not Press Enter");
			LoggerHandler.logError("Could Not Press Enter");
			Reporter.attachScreenshotToReport(test, driver, "Could_Not_Press_Enter");
		}
	}

	public void clickOnIncome(ExtentTest test) {
		try {
			webDriverHelper.jsClick(investmentPlansPageLocators.getIncome());
			test.pass("Clicked on Annual Income");
			LoggerHandler.logInfo("Clicked on Annual Income");
		} catch (Exception e) {
			test.fail("Could not click on Annual Income");
			LoggerHandler.logError("Could not click on Annual Income");
			Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_Annual_Income");
		}
	}

	public void validateIncomeTax(ExtentTest test) {
		try {
			String data = webDriverHelper.getText(investmentPlansPageLocators.getInvest());
			Assert.assertTrue(data.contains("Invest") && data.contains("tax"));
			test.pass("Income Tax Plans Functionality successful");
			LoggerHandler.logInfo("Income Tax Plans Functionality successful");
			Screenshot.getScreenShot(driver, "Income Tax Calculator");
		} catch (Exception e) {
			test.fail("Income Tax Plans Functionality not successful");
			LoggerHandler.logError("Income Tax Plans Functionality not successful");
			Reporter.attachScreenshotToReport(test, driver, "Income_Tax_Plans_Functionality_not_successful");
		}
	}
}
