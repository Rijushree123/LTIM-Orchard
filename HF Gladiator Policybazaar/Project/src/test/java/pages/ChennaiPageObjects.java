package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ChennaiPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ChennaiPageObjects {

    WebDriverHelper helperObj;
    WebDriver driver;
    ChennaiPageLocators chennaiPageLocatorsObj = new ChennaiPageLocators();

    public ChennaiPageObjects(WebDriver driver) {
        helperObj = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickOnScheduleHomeVisit(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickOnScheduleHomeVisit());
            helperObj.waitForElementToBeVisible(chennaiPageLocatorsObj.getWaitForPopup(), 10);
            LoggerHandler.logInfo("Clicking on Schedule Home Visit successful");
            test.log(Status.PASS, "Clicking on Schedule Home Visit successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Schedule Home Visit unsuccessful");
            test.log(Status.FAIL, "Clicking on Schedule Home Visit unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_schedule_home_visit_Failed");
        }
    }

    public void clickOnName(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickOnName());
            LoggerHandler.logInfo("Clicking on Name successful");
            test.log(Status.PASS, "Clicking on Name successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Name unsuccessful");
            test.log(Status.FAIL, "Clicking on Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Name_Failed");
        }
    }

    public void enterName(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 3, 9);
            helperObj.sendKeys(chennaiPageLocatorsObj.getClickOnName(), data);
            Assert.assertEquals(helperObj.getAttribute(chennaiPageLocatorsObj.getClickOnName()),data);
            LoggerHandler.logInfo("Entering Name successful");
            test.log(Status.PASS, "Entering Name successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Entering Name unsuccessful");
            test.log(Status.FAIL, "Entering Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Name_Failed");
            LoggerHandler.logError(e.getMessage());
        }catch (Exception e) {
            LoggerHandler.logError("Entering Name unsuccessful");
            test.log(Status.FAIL, "Entering Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Name_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickOnMob(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickOnMob());
            LoggerHandler.logInfo("Clicking on Mobile successful");
            test.log(Status.PASS, "Clicking on Mobile successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Mobile unsuccessful");
            test.log(Status.FAIL, "Clikcing on Mobile unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Mobile_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void enterMob(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 4, 9);
            helperObj.sendKeys(chennaiPageLocatorsObj.getClickOnMob(), data);
            Assert.assertEquals(helperObj.getAttribute(chennaiPageLocatorsObj.getClickOnMob()),data);
            LoggerHandler.logInfo("Entering Mobile successful");
            test.log(Status.PASS, "Entering Mobile successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Entering Name unsuccessful");
            test.log(Status.FAIL, "Entering Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Name_Failed");
            LoggerHandler.logError(e.getMessage());
        } catch (Exception e) {
            LoggerHandler.logError("Entering Mobile unsuccessful");
            test.log(Status.FAIL, "Entering Mobile unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Mobile_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickOnInterested(ExtentTest test) {
        try {
            helperObj.selectDropdownByIndex(chennaiPageLocatorsObj.getClickOnInterested(), 1);
            LoggerHandler.logInfo("Selecting Interested successful");
            test.log(Status.PASS, "Selecting Interested successful");
        } catch (Exception e) {
            LoggerHandler.logError("Selecting Interested unsuccessful");
            test.log(Status.FAIL, "Selecting Interested unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Selecting_Interested_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickAddress1(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickAddress1());
            LoggerHandler.logInfo("Clicking on Address Line 1 successful");
            test.log(Status.PASS, "Clicking on Address Line 1 successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Address Line 1 unsuccessful");
            test.log(Status.FAIL, "Clicking on Address Line 1 unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Line1_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void enterAddress1(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 5, 9);
            helperObj.sendKeys(chennaiPageLocatorsObj.getClickAddress1(), data);
            Assert.assertEquals(helperObj.getAttribute(chennaiPageLocatorsObj.getClickAddress1()), data);
            LoggerHandler.logInfo("Entering Address Line 1 successful");
            test.log(Status.PASS, "Entering Address Line 1 successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Entering Name unsuccessful");
            test.log(Status.FAIL, "Entering Name unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Name_Failed");
            LoggerHandler.logError(e.getMessage());
        }catch (Exception e) {
            LoggerHandler.logError("Entering Address Line 1 unsuccessful");
            test.log(Status.FAIL, "Entering Address Line 1 unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Line1_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickAddress2(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickAddress2());
            LoggerHandler.logInfo("Clicking on Address Line 2 successful");
            test.log(Status.PASS, "Clicking on Address Line 2 successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Address Line 2 unsuccessful");
            test.log(Status.FAIL, "Clicking on Address Line 2 unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Line2_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void enterAddress2(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 6, 9);
            helperObj.sendKeys(chennaiPageLocatorsObj.getClickAddress2(), data);
            Assert.assertEquals(helperObj.getAttribute(chennaiPageLocatorsObj.getClickAddress2()), data);
            LoggerHandler.logInfo("Entering Address Line 2 successful");
            test.log(Status.PASS, "Entering Address Line 2 successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Entering Address Line 2 unsuccessful");
            test.log(Status.FAIL, "Entering Address Line 2 unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Line2_Failed");
            LoggerHandler.logError(e.getMessage());
        }catch (Exception e) {
            LoggerHandler.logError("Entering Address Line 2 unsuccessful");
            test.log(Status.FAIL, "Entering Address Line 2 unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Line2_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickPincode(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickPincode());
            LoggerHandler.logInfo("Clicking on Pincode successful");
            test.log(Status.PASS, "Clicking on Pincode successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Pincode unsuccessful");
            test.log(Status.FAIL, "Clicking on Pincode unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Pincode_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void enterPincode(ExtentTest test) {
        try {
            String data = ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", 7, 9);
            helperObj.sendKeys(chennaiPageLocatorsObj.getClickPincode(), data);
            Assert.assertEquals(helperObj.getAttribute(chennaiPageLocatorsObj.getClickPincode()), data);
            LoggerHandler.logInfo("Entering Pincode successful");
            test.log(Status.PASS, "Entering Pincode successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Entering Pincode unsuccessful");
            test.log(Status.FAIL, "Entering Pincode unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Pincode_Failed");
            LoggerHandler.logError(e.getMessage());
        }catch (Exception e) {
            LoggerHandler.logError("Entering Pincode unsuccessful");
            test.log(Status.FAIL, "Entering Pincode unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Entering_Pincode_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickTomorrow(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickTomorrow());
            LoggerHandler.logInfo("Clicking on Tomorrow successful");
            test.log(Status.PASS, "Clicking on Tomorrow successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Tomorrow unsuccessful");
            test.log(Status.FAIL, "Clicking on Tomorrow unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Tomorrow_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void clickOn3rdSlot(ExtentTest test) {
        try {
            helperObj.clickOnElement(chennaiPageLocatorsObj.getClickOn3rdSlot());
            LoggerHandler.logInfo("Clicking on 3rd slot successful");
            test.log(Status.PASS, "Clicking on 3rd slot successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on 3rd slot unsuccessful");
            test.log(Status.FAIL, "Clicking on 3rd slot unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_3rdSlot_Failed");
            LoggerHandler.logError(e.getMessage());
        }

    }

    public void clickConfirm(ExtentTest test) {
        try {
            helperObj.jsClick(chennaiPageLocatorsObj.getClickConfirm());
            LoggerHandler.logInfo("Clicking on Confirm successful");
            test.log(Status.PASS, "Clicking on Confirm successful");
            helperObj.waitForElementToBeVisible(chennaiPageLocatorsObj.getVerifyMessage(), 10);
            Screenshot.getScreenShot(driver, "Test_case_9_SS");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking on Confirm unsuccessful");
            test.log(Status.FAIL, "Clicking on Confirm unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Confirm_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void verifyMessage(ExtentTest test) {
        try {
            String str = helperObj.getText(chennaiPageLocatorsObj.getVerifyMessage());
            boolean result = str.equals("Home visit scheduled") ||
                    str.equals("You have already scheduled a visit");
            Assert.assertTrue(result);
            LoggerHandler.logInfo("Verifying Scheduled message successful");
            test.log(Status.PASS, "Verifying Scheduled message successful");
        } catch (AssertionError e) {
            LoggerHandler.logError("Verifying Scheduled message unsuccessful");
            test.log(Status.FAIL, "Verifying Scheduled message unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Verifying_Message_Failed");
            LoggerHandler.logError(e.getMessage());
        }catch(Exception e){
            LoggerHandler.logError("Verifying Scheduled message unsuccessful");
            test.log(Status.FAIL, "Verifying Scheduled message unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Verifying_Message_Failed");
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void fillForm(ExtentTest test){
        clickOnName(test);
        enterName(test);
        clickOnMob(test);
        enterMob(test);
        clickOnInterested(test);
        clickAddress1(test);
        enterAddress1(test);
        clickAddress1(test);
        enterAddress2(test);
        clickPincode(test);
        enterPincode(test);
        clickTomorrow(test);
        clickOn3rdSlot(test);
        clickConfirm(test);
    }

}