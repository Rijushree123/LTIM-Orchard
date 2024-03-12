package pages;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import uistore.FlightSearchPageLocators;
import uistore.HomePageLocators;
import utils.*;
import com.aventstack.extentreports.*;

public class FlightSearchPageObjects {

    public static WebDriverHelper webDriverHelper;
    private FlightSearchPageObjects(){
        
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to verify I land on flight search result page
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickFlightSearchResultVerify(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            String url = driver.getCurrentUrl();
            String key = "flight";
            String actual ="";
            String expected =key;
            if(url.contains(key))
                actual += key;
            org.testng.Assert.assertEquals(actual, expected);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightSearchButton());
            test.log(Status.PASS, "Sucessfully land on Flight search page");
            Reporter.attachScreenshotToReport(test, driver, "clickFlightSearchPageLandPASS");
            LoggerHandler.logInfo("Sucessfully land on flight search page");
        }
        catch(AssertionError e){
            test.log(Status.FAIL, "Cannot land on Flight search page");
            Reporter.attachScreenshotToReport(test, driver, "clickFlightSearchPageLandFAIL");
            LoggerHandler.logError("Cannot land on flight search page");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to verify text stops
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void verifyTextStops(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            String text = webDriverHelper.getText(FlightSearchPageLocators.getStops());
            text = text.substring(0,5);
            Assert.assertEquals(text, "Stops");
            test.log(Status.PASS, "Clicked on text Stops in Flight Search page");
            Reporter.attachScreenshotToReport(test, driver, "verifyTextStopsPASS");
            LoggerHandler.logInfo("Clicked on text Stops in Flight Search page");
        }
        catch(AssertionError e){
            test.log(Status.FAIL, "Cannot Click on text Stops in Flight Search page");
            Reporter.attachScreenshotToReport(test, driver, "verifyTextStopsFAIL");
            LoggerHandler.logError("Cannot Click on text Stops in Flight Search page");
        }
    }
}
