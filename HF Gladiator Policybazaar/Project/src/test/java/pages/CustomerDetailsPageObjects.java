package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CustomerDetailsPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CustomerDetailsPageObjects {

    WebDriverHelper helperObj;
    WebDriver driver;
    CustomerDetailsPageLocators customerLocatorsObj = new CustomerDetailsPageLocators();

    public CustomerDetailsPageObjects(WebDriver driver) {
        helperObj = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickGender(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getClickGender());
            LoggerHandler.logInfo("Clicking on Gender successful");
            test.log(Status.PASS, "Clicking on Gender successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Gender unsuccessful");
            test.log(Status.FAIL, "Clicking on Gender unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Gender_Failed");
        }
    }

    public void clickEmail(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getClickEmail());
            LoggerHandler.logInfo("Clicking on Email successful");
            test.log(Status.PASS, "Clicking on Email successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Email unsuccessful");
            test.log(Status.FAIL, "Clicking on Email unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Email_Failed");
        }
    }

    public void enterEmail(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 3, 2);
            helperObj.sendKeys(customerLocatorsObj.getClickEmail(), data);
            LoggerHandler.logInfo("Entering Email successful");
            test.log(Status.PASS, "Entering Email successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Email unsuccessful");
            test.log(Status.FAIL, "Entering Email unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Email_Failed");
        }
    }

    public void clickDOB(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getClickDOB());
            LoggerHandler.logInfo("Clicking on DOB successful");
            test.log(Status.PASS, "Clicking on DOB successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on DOB unsuccessful");
            test.log(Status.FAIL, "Clicking on DOB unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_DOB_Failed");
        }
    }

    public void enterDOB(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 4, 2);
            helperObj.sendKeys(customerLocatorsObj.getClickDOB(), data);
            LoggerHandler.logInfo("Entering DOB successful");
            test.log(Status.PASS, "Entering DOB successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering DOB unsuccessful");
            test.log(Status.FAIL, "Entering DOB unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_DOB_Failed");
        }
    }

    public void clickAnnualIncome(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getClickAnnualIncome());
            LoggerHandler.logInfo("Clicking on Annual Income successful");
            test.log(Status.PASS, "Clicking on Annual Income successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Annual Income unsuccessful");
            test.log(Status.FAIL, "Clicking on Annual Income unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Income_Failed");
        }
    }

    public void enterAnnualIncome(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 5, 2);
            helperObj.sendKeys(customerLocatorsObj.getClickAnnualIncome(), data);
            LoggerHandler.logInfo("Entering Annual Income successful");
            test.log(Status.PASS, "Entering Annual Income successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Annual Income unsuccessful");
            test.log(Status.FAIL, "Entering Annual Income unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Income_Failed");
        }
    }

    public void clickProceed(ExtentTest test) {
        try {
            helperObj.jsClick(customerLocatorsObj.getClickProceedInCustomerDetails());
            LoggerHandler.logInfo("Clicking Proceed successful");
            test.log(Status.PASS, "Clicking Proceed successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Proceed unsuccessful");
            test.log(Status.FAIL, "Clicking Proceed unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Proceed_Failed");
        }
    }

    public void clickPincodeInCustomerDetails(ExtentTest test) {
        try {
            helperObj.jsClick(customerLocatorsObj.getClickPincodeInCustomerDetails());
            LoggerHandler.logInfo("Clicking Pincode successful");
            test.log(Status.PASS, "Clicking Pincode successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Pincode unsuccessful");
            test.log(Status.FAIL, "Clicking Pincode unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Pincode_Failed");
        }
    }

    public void enterPincodeInCustomerDetails(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 6, 2);
            helperObj.sendKeys(customerLocatorsObj.getClickPincodeInCustomerDetails(), data);
            LoggerHandler.logInfo("Entering Pincode successful");
            test.log(Status.PASS, "Entering Pincode successful");
        } catch (Exception e) {
            LoggerHandler.logError("Entering Pincode unsuccessful");
            test.log(Status.FAIL, "Entering Pincode unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Pincode_Failed");
        }
    }

    public void clickCity(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getClickCity());
            LoggerHandler.logInfo("Clicked City successful");
            test.log(Status.PASS, "Clicked City successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked City unsuccessful");
            test.log(Status.FAIL, "Clicked City unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_City_Failed");
        }
    }

    public void radioForCity(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getRadioForCity());
            LoggerHandler.logInfo("Clicked Tamil Nadu successful");
            test.log(Status.PASS, "Clicked Tamil Nadu successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked Tamil Nadu unsuccessful");
            test.log(Status.FAIL, "Clicked Tamil Nadu unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_TamilNadu_Failed");
        }
    }

    public void clickReviewDetails(ExtentTest test) {
        try {
            helperObj.jsClick(customerLocatorsObj.getClickReviewDetails());
            helperObj.waitForElementToBeVisible(customerLocatorsObj.getClickCheckbox(), 10);
            LoggerHandler.logInfo("Clicking Review Details successful");
            test.log(Status.PASS, "Clicking Review Details successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Review Details unsuccessful");
            test.log(Status.FAIL, "Clicking Review Details unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Details_Failed");
        }
    }

    public void clickCheckbox(ExtentTest test) {
        try {
            helperObj.javascriptScrollVertically(100);
            helperObj.clickOnElement(customerLocatorsObj.getClickCheckbox());
            Assert.assertTrue(helperObj.getElement(customerLocatorsObj.getCheckBox()).isSelected());
            LoggerHandler.logInfo("Clicking Checkbox successful");
            test.log(Status.PASS, "Clicking Checkbox successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Checkbox unsuccessful");
            test.log(Status.FAIL, "Clicking Checkbox unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Checkbox_Failed");
        }
    }

    public void clickCheckout(ExtentTest test) {
        try {
            helperObj.clickOnElement(customerLocatorsObj.getClickCheckout());
            helperObj.waitForElementToBeVisible(customerLocatorsObj.getVerifyChoosePaymentMode(), 10);
            LoggerHandler.logInfo("Clicking Checkout successful");
            test.log(Status.PASS, "Clicking Checkout successful");
            Screenshot.getScreenShot(driver, "Test_case_2_SS");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Checkout unsuccessful");
            test.log(Status.FAIL, "Clicking Checkout unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Checkout_Failed");
        }
    }

    public void verifyChoosePaymentMode(ExtentTest test) {
        try {
            String str = helperObj.getText(customerLocatorsObj.getVerifyChoosePaymentMode());
            Assert.assertEquals(str, "Choose Payment Mode");
            LoggerHandler.logInfo("Verifying Choose Payment Mode successful");
            test.log(Status.PASS, "Verifying Choose Payment Mode successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Verifying Choose Payment Mode unsuccessful");
            test.log(Status.FAIL, "Verifying Choose Payment Mode unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Verifying_Text_Failed");
        }
    }

    public void enterDetails(ExtentTest test) {
        clickGender(test);
        clickEmail(test);
        enterEmail(test);
        clickDOB(test);
        enterDOB(test);
        clickProceed(test);
        clickPincodeInCustomerDetails(test);
        enterPincodeInCustomerDetails(test);
        clickCity(test);
        radioForCity(test);
        clickReviewDetails(test);
        clickCheckbox(test);
        clickCheckout(test);
    }

}