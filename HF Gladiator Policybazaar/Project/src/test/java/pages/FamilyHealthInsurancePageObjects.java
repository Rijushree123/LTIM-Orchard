package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.FamilyHealthInsurancePageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class FamilyHealthInsurancePageObjects {
	WebDriverHelper webhelpObj;
	WebDriver driver;
	FamilyHealthInsurancePageLocators searchLocObj = new FamilyHealthInsurancePageLocators();

	public FamilyHealthInsurancePageObjects(WebDriver driver) {
		webhelpObj = new WebDriverHelper(driver);
		this.driver = driver;
	}

	public void clickFemale(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getGenderFemale());
			Assert.assertTrue(webhelpObj.getElement(searchLocObj.getCheckBox()).isSelected());
			LoggerHandler.logInfo("Selected Female");
			test.pass("Clicked Female");
		} catch (Exception e) {
			LoggerHandler.logError("Could not Select Female");
			test.fail("Could not click female");
			Reporter.attachScreenshotToReport(test, driver, "failed to click female");

		}
	}

	public void clickSon(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getSon());
			LoggerHandler.logInfo("clicked on son ");
			test.pass("Clicked Son");
		} catch (Exception e) {
			LoggerHandler.logError("could not click son");
			test.fail("Failed to click son");
			Reporter.attachScreenshotToReport(test, driver, "failed to click son");
		}
	}

	public void clickHusband(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getHusband());
			LoggerHandler.logInfo("clicked on husband");
			test.pass("Clicked Husband");
		} catch (Exception e) {
			LoggerHandler.logError("Could not cLick on husband ");
			test.fail("unable to click Husband");
			Reporter.attachScreenshotToReport(test, driver, "failed to click husband");
		}
	}

	public void clickContinueButton(ExtentTest test) {
		try {
			webhelpObj.jsClick(searchLocObj.getContinueButton());
			LoggerHandler.logInfo("Clicked continue button");
			test.pass("Clicked Continue");
		} catch (Exception e) {
			LoggerHandler.logError("Could not click continue button");
			test.fail("Failed to click Continue Button");
			Reporter.attachScreenshotToReport(test, driver, "failed to click continue button");
		}
	}

	public void clickMoreButton(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getMore());
			LoggerHandler.logInfo("Selected More Option");
			test.pass("Clicked More");
		} catch (Exception e) {
			LoggerHandler.logError("could not Selected more option");
			test.fail("Failed to click More");
			Reporter.attachScreenshotToReport(test, driver, "failed to click More ");
		}
	}

	public void clickPopUp() {
		try {
			webhelpObj.clickOnElement(searchLocObj.getPopUp());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void husbandAgeDropdown(ExtentTest test) {
		try {

			webhelpObj.jsClick(searchLocObj.getHusbandAge());
			webhelpObj.dropDown(searchLocObj.getHusbandAge(), 20);
			LoggerHandler.logInfo("Selected husbands age");
			test.pass("Selected husbands age");
		} catch (Exception e) {
			LoggerHandler.logError("Could not select husband age");
			test.fail("Failed to select husband age");
			Reporter.attachScreenshotToReport(test, driver, "failed to select husband age ");
		}
	}

	public void sonAgeDropdown(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getSonAge());
			webhelpObj.dropDown(searchLocObj.getSonAge(), 5);
			LoggerHandler.logInfo("Selected sons age");
			test.pass("Selected sons age");
		} catch (Exception e) {
			LoggerHandler.logError("Could not select son age ");
			test.fail("Failed to select Sons age");
			Reporter.attachScreenshotToReport(test, driver, "failed to select son age");
		}
	}

	public void clickContinue2Button(ExtentTest test) {
		try {
			webhelpObj.jsClick(searchLocObj.getContinueButton2());
			LoggerHandler.logInfo("Clicked on continue button 2");
			test.pass("Clicked on continue button  2");
		} catch (Exception e) {
			LoggerHandler.logError("Could not click on continue button 2");
			test.fail("Unable to click on Continue button 2");
			Reporter.attachScreenshotToReport(test, driver, "failed to click continue button 2 ");
		}
	}

	public void enterCityName(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getCityInputBar());
			String str1 = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 2, 1);
			webhelpObj.sendKeys(searchLocObj.getCityInputBar(), str1);
		    Assert.assertEquals(webhelpObj.getAttribute(searchLocObj.getCityInputBar()), str1);
			LoggerHandler.logInfo("Entered city ");
			test.pass("Entered City name ");
		} catch (AssertionError | Exception e) {
			LoggerHandler.logError("Could not enter city");
			test.fail("Could not enter city");
			Reporter.attachScreenshotToReport(test, driver, "failed to enter city ");
		}
	}

	public void clickContinue3Button(ExtentTest test) {
		try {
			webhelpObj.jsClick(searchLocObj.getContinueButton3());
			LoggerHandler.logInfo("Clicked on continue button no. 3");
			test.pass("Clicked Continue Button 3");
		} catch (Exception e) {
			LoggerHandler.logError("Could not click continue button no.3");
			test.fail("Could not click Continue Button 3");
			Reporter.attachScreenshotToReport(test, driver, "failed to click continue button 3 ");
		}
	}

	public void enterName(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getNameInputBar());
			String str2 = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 3, 1);
			webhelpObj.sendKeys(searchLocObj.getNameInputBar(), str2);	
			Assert.assertEquals(webhelpObj.getAttribute(searchLocObj.getNameInputBar()), str2);
			LoggerHandler.logInfo("Entered Name");
			test.pass("Entered Name");
		} catch (AssertionError | Exception e) {
			LoggerHandler.logError("Could not enter name");
			test.fail("Could not enter name");
			Reporter.attachScreenshotToReport(test, driver, "failed to enter name ");
		}
	}

	public void enterMobileNumber(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getMobileInput());
			String str3 = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 4, 1);
			webhelpObj.sendKeys(searchLocObj.getMobileInput(), str3);
			Assert.assertEquals(webhelpObj.getAttribute(searchLocObj.getMobileInput()), str3);
			LoggerHandler.logInfo("Mobile number entered");
			test.pass("Mobile number entered");
		} catch (AssertionError | Exception e) {
			LoggerHandler.logError(" Could not enter mobile no ");
			test.fail("Could not enter mobile no.");
			Reporter.attachScreenshotToReport(test, driver, "failed to enter mobile number ");
		}

	}

	public void clickContinue4Button(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getContinueButton4());
			LoggerHandler.logInfo("Clicked on Continue button no. 4");
			test.pass("Clicked on cotinue button no.4");
		} catch (Exception e) {
			LoggerHandler.logError("could not clicked Continue button no. 4");
			test.fail("Could not click continue button no.4");
			Reporter.attachScreenshotToReport(test, driver, "failed to click continue button 4 ");
		}
	}

	public void clickSecondBox(ExtentTest test) {
		try {
 
			webhelpObj.clickOnElement(searchLocObj.getPopUp());
			webhelpObj.clickOnElement(searchLocObj.getSecondBoxBy());
			LoggerHandler.logInfo("Selected second option");
			test.pass("Selected second option");
		} catch (Exception e) {
			LoggerHandler.logError("Could not select second option");
			test.fail("Could not select second option");
			Reporter.attachScreenshotToReport(test, driver, "failed to select second option ");
		}
	}

	public void clickViewAll(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getViewPlan());
			LoggerHandler.logInfo("Clicked on View All");
			test.pass("Clicked on view All");


		} catch (Exception e) {
			LoggerHandler.logError("Unable to click view all");
			test.fail("Could not click view all");
			Reporter.attachScreenshotToReport(test, driver, "failed to click view all ");
		}
	}

	public void selectMobileCountry(ExtentTest test) {
		try {
			webhelpObj.clickOnElement(searchLocObj.getMobilenumCountry());
			webhelpObj.clickOnElement(searchLocObj.getMobileIndia());
			LoggerHandler.logInfo("Selected Country code for mobile number");
			test.pass("Selected Country code");
		} catch (Exception e) {
			LoggerHandler.logError("Unable to select Country code");
			test.fail("Could not select country code");
			Reporter.attachScreenshotToReport(test, driver, "Failed to select country code");

		}
	}
	public void enterDetails(ExtentTest test){
		clickFemale(test);
        clickSon(test);
        clickHusband(test);
        clickContinueButton(test);
        husbandAgeDropdown(test);
        sonAgeDropdown(test);
        clickContinue2Button(test);
        enterCityName(test);  
        clickContinue3Button(test);
        enterName(test);
        selectMobileCountry(test);
        enterMobileNumber(test);
        clickContinue4Button(test);
        clickSecondBox(test);
        clickViewAll(test);

	}

}
