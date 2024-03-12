package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import com.aventstack.extentreports.*;

import StepDefinition.Hooks;
import UiStore.*;
import Utils.*;

public class HolidaySearchPageObjects {
    
    private static  WebDriver driver = Hooks.driver;
    private static final WebDriverHelper webDriverHelper = new WebDriverHelper(driver);
    static String destinationCityChoice;
    private HolidaySearchPageObjects(){}

    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter holiday leaving city
     * Last Modified: 08/02/2024
     * @Param
     * ExtentTest: This parameter is used to create the test case in the extent report
    */
    public static void enterHolidayLeavingCity(ExtentTest test, String city){
        try{
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getSaudiImg(), 10);
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getHolidayLeavingCity());
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getDropdownDiv(),10);
            webDriverHelper.sendKeys(HolidaySearchPageLocators.getHolidayLeavingCity(), city);
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getGetJaipurOption(), 10);
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getGetJaipurOption());
            test.log(Status.PASS, "Entered holiday leaving city");
            LoggerHandler.logInfo("Entered Holiday leaving city");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Entered holiday leaving city");
            Reporter.attachScreenshotToReport(test, driver, "enterHolidayLeavingCityFAIL");
            LoggerHandler.logError("Cannot Entered Holiday leaving city");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to select the holiday destination city
     * Last Modified: 08/02/2024
     *
     * @Param
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void enterHolidayDestinationCity(ExtentTest test, String city){
        try{
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getHolidayDestinationCity(), 10);
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getHolidayDestinationCity());
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getDropdownDiv(),10);
            webDriverHelper.sendKeys(HolidaySearchPageLocators.getHolidayDestinationCity(), city);
            destinationCityChoice = city;
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getGetBengaluru(), 10);
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getGetBengaluru());
            test.log(Status.PASS, "Entered holiday destination city");
            LoggerHandler.logInfo("Entered holiday Destination city");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Entered holiday destination city");
            Reporter.attachScreenshotToReport(test, driver, "enterHolidayDestinationCityFAIL");
            LoggerHandler.logError("Cannot Entered holiday Destination city");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to select the month of travel
     * Last Modified: 08/02/2024
     *
     * @Param
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void selectMonthofTravel(ExtentTest test){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(HolidaySearchPageLocators.getHolidayMonthTravel()));
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getHolidayMonthTravel());
            wait.until(ExpectedConditions.elementToBeClickable(HolidaySearchPageLocators.getHolidayMonthTraveldate()));
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getHolidayMonthTraveldate());
            test.log(Status.PASS, "Select month of travel for holiday");
            LoggerHandler.logInfo("Select month of travel for Holiday");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Select month of travel for holiday");
            Reporter.attachScreenshotToReport(test, driver, "selectholidayMonthofTravelFAIL");
            LoggerHandler.logError("Select month of travel for Holiday");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on holiday search button
     * Last Modified: 08/02/2024
     *
     * @Param
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickSearchHoliday(ExtentTest test){
        try{
            webDriverHelper.waitForElementToBeVisible(HolidaySearchPageLocators.getHolidaySearchButton(), 10);
            webDriverHelper.clickOnElement(HolidaySearchPageLocators.getHolidaySearchButton());
            test.log(Status.PASS, "Click Search Holiday button");
            LoggerHandler.logInfo("Click Search Holiday Button");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Click Search Holiday button");
            Reporter.attachScreenshotToReport(test, driver, "clickSearchHolidayFAIL");
            LoggerHandler.logError("Cannot Click Search Holiday Button");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to verify that I land on holiday search page
     * Last Modified: 08/02/2024
     *
     * @Param
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void landOnHolidaySearchPageResult(ExtentTest test){
        try{
            String url = driver.getCurrentUrl();
            String actual ="";
            if(url.contains("holidays/dom"))
                actual += "holiday/dom";
            Assert.assertEquals(actual, "holidays/dom");
            test.log(Status.PASS, "Sucessfully land on Holiday search page");
            Reporter.attachScreenshotToReport(test, driver, "clickHolidaySearchPageLandPASS");
            LoggerHandler.logInfo("Sucessfully land on holiday search page");
        }
        catch(AssertionError e){
            test.log(Status.FAIL, "Cannot land on Holiday search page");
            Reporter.attachScreenshotToReport(test, driver, "clickHolidaySearchPageLandFAIL");
            LoggerHandler.logError("Cannot land on holiday search page");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to verify holiday destination city
     * Last Modified: 08/02/2024
     *
     * @Param
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void verifyHolidayDestinationCity(ExtentTest test){
        try{
            String destinationCity = webDriverHelper.getText(HolidaySearchPageLocators.getDestinationCityResult());
            Assert.assertEquals("Bengaluru", destinationCity);
            test.log(Status.PASS, "Verified Holiday destination City");
            Reporter.attachScreenshotToReport(test, driver, "verifyHolidayDestinationCityPASS");
            LoggerHandler.logInfo("Verified Holiday Destination City");
        }
        catch(AssertionError e){
            test.log(Status.FAIL, "Cannot Verified Holiday destination City");
            Reporter.attachScreenshotToReport(test, driver, "verifyHolidayDestinationCityFAIL");
            LoggerHandler.logError("Cannot Verified Holiday Destination City");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Verified Holiday destination City");
            Reporter.attachScreenshotToReport(test, driver, "verifyHolidayDestinationCityFAIL");
            LoggerHandler.logError("Cannot Verified Holiday Destination City");
        }
    }
}

