package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HotelSearchPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class HotelSearchPageObjects {
    public static WebDriverHelper webDriverHelper;
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to select the hotel destination city
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void enterDestination(WebDriver driver , ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);

            ExcelReader excelReader = new ExcelReader();
            String excelFilePath = System.getProperty("user.dir")+"/testdata/Testdata.xlsx";
            String destination = excelReader.readDataFromExcel(excelFilePath, "Sheet1", 2, 0);
            

            By b = HotelSearchPageLocators.getDestionationCity();
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getDestionationCity(), 15);
            webDriverHelper.clickOnElement(b);
            driver.findElement(b).clear();
            webDriverHelper.clickOnElement(b);
            webDriverHelper.sendKeys(b, destination);             
            driver.findElement(b).sendKeys(Keys.DOWN);
            driver.findElement(b).sendKeys(Keys.UP);
            webDriverHelper.clickOnElement(b);
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getNewDelhi(), 15);
            webDriverHelper.clickOnElement(HotelSearchPageLocators.getNewDelhi());
            test.log(Status.PASS, "Clicked on Hotel destination ");
            LoggerHandler.logInfo("Clicked on Hotel Destination");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Hotel destination");
            Reporter.attachScreenshotToReport(test, driver, "enterHotelDestinationFAIL");
            LoggerHandler.logError("Cannot click on Hotel Destination");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter hotel check in date
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void enterCheckInDate(WebDriver driver , ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getcheckIndate(), 15);
            webDriverHelper.clickOnElement(HotelSearchPageLocators.getcheckIndate());
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getIndate(), 15);
            webDriverHelper.clickOnElement(HotelSearchPageLocators.getIndate());
            test.log(Status.PASS, "Clicked on Hotel Checkin date ");
            LoggerHandler.logInfo("Clicked on Hotel Checkin Date ");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Checkin date");
            Reporter.attachScreenshotToReport(test, driver, "enterCheckInDateFAIL");
            LoggerHandler.logError("Cannot click on Checkin Date");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter hotel check out date
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void enterCheckOutDate(WebDriver driver , ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getcheckOutdate(), 15);
            webDriverHelper.clickOnElement(HotelSearchPageLocators.getcheckOutdate());
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getOutdate(), 15);
            webDriverHelper.clickOnElement(HotelSearchPageLocators.getOutdate());
            test.log(Status.PASS, "Clicked on Hotel CheckOut date ");
            LoggerHandler.logInfo("Clicked on Hotel CheckOut Date");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on CheckOut date");
            Reporter.attachScreenshotToReport(test, driver, "enterCheckOutDateFAIL");
            LoggerHandler.logError("Cannot click on CheckOut Date");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on hotel search button
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickHotelSearchButton(WebDriver driver , ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            webDriverHelper.javascriptScroll(HotelSearchPageLocators.getHotelSearchButton());
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getHotelSearchButton(), 15);
            wait.until(ExpectedConditions.elementToBeClickable(HotelSearchPageLocators.getHotelSearchButton()));
            webDriverHelper.clickOnElement(HotelSearchPageLocators.getHotelSearchButton());
            test.log(Status.PASS, "Clicked on Hotel Search button");
            LoggerHandler.logInfo("Clicked on Hotel Search Button");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Hotel Search button");
            Reporter.attachScreenshotToReport(test, driver, "clickHotelSearchButtonFAIL");
            LoggerHandler.logError("Cannot click on Hotel Search Button");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to verify Hotel location name
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void verifyLocation(WebDriver driver , ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            String title = webDriverHelper.getText(HotelSearchPageLocators.getLocationName());
            Assert.assertEquals(title, "New Delhi");
            test.log(Status.PASS, "Location Verification passed!");
            Reporter.attachScreenshotToReport(test, driver, "clickHotelverifyLocationPASS");
            LoggerHandler.logInfo("Location Verification passed!");
        }
        catch(AssertionError e){
            Reporter.attachScreenshotToReport(test, driver, "clickHotelverifyLocationFAIL");
            test.log(Status.FAIL, "Location Verification failed after clicking on Search button");
            LoggerHandler.logError("Location Verification failed after clicking on search Button");
        }
    }
}
