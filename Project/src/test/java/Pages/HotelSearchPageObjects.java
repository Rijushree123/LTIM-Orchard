package Pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import com.aventstack.extentreports.*;

import StepDefinition.Hooks;
import UiStore.HotelSearchPageLocators;
import Utils.*;
import org.junit.Assert;

public class HotelSearchPageObjects {
    private static  WebDriver driver = Hooks.driver;
    private static final WebDriverHelper webDriverHelper = new WebDriverHelper(driver);
    private HotelSearchPageObjects(){
        
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on Hotels option
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void clickHotelOption(ExtentTest test){
        try{
        webDriverHelper.clickOnElement(HotelSearchPageLocators.getHotels());
        test.log(Status.PASS, "Clicked on Hotel option ");
        LoggerHandler.logInfo("Clicked on Hotel Option ");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Hotel option");
            Reporter.attachScreenshotToReport(test, driver, "clickHotelOptionFAIL");
            LoggerHandler.logError("Cannot click on Hotel Option");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter destination
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void enterDestination(ExtentTest test, String data){
        try{
            By b = HotelSearchPageLocators.getDestionationCity();
            webDriverHelper.waitForElementToBeVisible(HotelSearchPageLocators.getDestionationCity(), 15);
            webDriverHelper.clickOnElement(b);
            driver.findElement(b).clear();
            webDriverHelper.clickOnElement(b);
            webDriverHelper.sendKeys(b, data);             
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
     * Description: This method is used to select check in date
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void enterCheckInDate(ExtentTest test){
        try{
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
     * Description: This method is used to select check out date
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void enterCheckOutDate(ExtentTest test){
        try{
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
     * report
    */
    public static void clickHotelSearchButton(ExtentTest test){
        try{
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
     * Description: This method is used to verify location of hotel destination
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void verifyLocation(ExtentTest test){
        try{
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
