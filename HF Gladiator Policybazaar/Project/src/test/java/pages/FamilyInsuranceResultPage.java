package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.FamilyInsuranceResultPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class FamilyInsuranceResultPage {
	WebDriverHelper webhelpObj;
	WebDriver driver;
	FamilyInsuranceResultPageLocators resLocObj = new FamilyInsuranceResultPageLocators();

	public FamilyInsuranceResultPage(WebDriver driver) {
		webhelpObj = new WebDriverHelper(driver);
		this.driver = driver;

	}

	public void clickCoverIcon(ExtentTest test) {
		try {
			webhelpObj.waitForElementToBeVisible(resLocObj.getCover(), 10);
			webhelpObj.clickOnElement(resLocObj.getCover());
			LoggerHandler.logInfo("Clicked on Cover Icon");
			test.pass("Clicked on cover Icon");
		} catch (Exception e) {
			LoggerHandler.logError("Unable to click on Cover Icon");
			test.fail("Unable to click on cover Icon");
			Reporter.attachScreenshotToReport(test, driver, "Cover click failed");
		}
	}

	public void clickLakhOption(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(resLocObj.getLakh5to9());
			Assert.assertTrue(webhelpObj.getElement(resLocObj.getCheckBox()).isSelected());
			LoggerHandler.logInfo("Selected option 5-9lakh");
			test.pass("selected option 5-9lakh");
		} catch (Exception e) {
			LoggerHandler.logError("Unable to select 5-9 lakh");
			test.fail("Could not select 5-9 lakh");
			Reporter.attachScreenshotToReport(test, driver, "failed to select 5-9 lakh");
		}
	}

	public void clickApplyButton(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(resLocObj.getApply());
			LoggerHandler.logInfo("Clicked on apply button");
			test.pass("Clicked on apply button");

		} catch (Exception e) {
			LoggerHandler.logError("Unable to click apply button");
			test.fail("Unable to click apply button");
			Reporter.attachScreenshotToReport(test, driver, "Unable to click apply button");
		}
	}

	public void clickReassurePlan(ExtentTest test) {
		try {
			webhelpObj.waitForElementToBeVisible(resLocObj.getReassure(), 10);
			webhelpObj.clickOnElement(resLocObj.getReassure());
			LoggerHandler.logInfo("Clicked on Reassure 2.0");
			test.pass(" clicked on Reassure 2.0");
		} catch (Exception e) {
			LoggerHandler.logError("Unable to click on Reassure 2.0");
			test.fail("Unable to click on Reassure 2.0");
			Reporter.attachScreenshotToReport(test, driver, "failed to click Reassure2.0");
		}
	}

	public void clickPolicyPeriod(ExtentTest test) {
		try {
			webhelpObj.waits(2);
			webhelpObj.clickOnElement(resLocObj.getPolicyPeroidBy());
			LoggerHandler.logInfo("Selected policy peroid ");
			test.pass("Selected policy peroid");
		} catch (Exception e) {
			LoggerHandler.logError("Could not select policy peroid");
			test.fail("Could not select policy peroid");
			Reporter.attachScreenshotToReport(test, driver, "Failed to select policy peroid");
		}
	}

	public void clickSafeguardAddButton(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(resLocObj.getSafeguardAdd());
			LoggerHandler.logInfo("clicked on add safeguard benefit");
			test.pass("click on add safeguard benefit");
		} catch (Exception e) {
			LoggerHandler.logError("Could not click add safeguard");
			test.fail("Could not click add safeguard");
			Reporter.attachScreenshotToReport(test, driver, "Failed to click add safeguard");
		}
	}

	public void clickProceedandContinue(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(resLocObj.getProceed());
			LoggerHandler.logInfo("clicked on proceed");
			test.pass("clicked on proceed");
		} catch (Exception e) {
			LoggerHandler.logError("could not click proceed button");
			test.fail("could not click proceed button");
			Reporter.attachScreenshotToReport(test, driver, "Failed to click Proceed");
		}
	}

	public void clickSkipandContinue(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(resLocObj.getSkip());
			LoggerHandler.logInfo("clicked on skip and continue");
			test.pass("clicked on skip and continue");
		} catch (Exception e) {
			LoggerHandler.logError("could not click on skip and continue");
			test.fail("Failed to click skip and continue");
			Reporter.attachScreenshotToReport(test, driver, "Failed to click Skip and continue");
		}
	}

	public void verifytotalPremium(ExtentTest test) {
		try {
			String str = webhelpObj.getText(resLocObj.getTotalPremium());
			Assert.assertEquals(str, "Total premium");
			LoggerHandler.logInfo("verified text total Premium");
			test.pass("verified total premium text");
			Screenshot.getScreenShot(driver, "Premium total");

		} catch (Throwable e) {
			LoggerHandler.logError("Text not verified");
			test.fail("Failed to verfiy text");
			Reporter.attachScreenshotToReport(test, driver, "verifiacation failed");
		}
	}
	public void planDetails(ExtentTest test){
		clickCoverIcon(test);
        clickLakhOption(test);
        clickApplyButton(test);
        clickReassurePlan(test);
        clickPolicyPeriod(test);
        clickSafeguardAddButton(test);
        clickProceedandContinue(test);
        clickSkipandContinue(test);
        verifytotalPremium(test);
	}

}
