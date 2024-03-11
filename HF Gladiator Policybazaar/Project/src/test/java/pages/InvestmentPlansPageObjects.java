package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.InvestmentPlansPageLocators;
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
}
