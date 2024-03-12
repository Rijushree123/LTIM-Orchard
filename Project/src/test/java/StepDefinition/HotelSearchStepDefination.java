package StepDefinition;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;

import Pages.*;
import cucumber.api.java.en.*;
import Utils.*;

public class HotelSearchStepDefination {
    public static ExtentReports report = Hooks.report;
    public static ExtentTest test = Hooks.test;
    WebDriver driver = Hooks.driver;
    
    @Given("^i am on Home Page$")
    public void i_am_on_Home_Page() {
        driver.navigate().refresh();
    }

    @When("^i click on Hotels Option$")
    public void i_click_on_Hotels_Option() {
        try{
        test = report.createTest("Test Case 1");
        HotelSearchPageObjects.clickHotelOption(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to click on Hotel Option");
        }
    }
    @When("^i enter \"([^\"]*)\" in location field$")
    public void i_enter_in_location_field(String arg1) {
        try{
            HotelSearchPageObjects.enterDestination(test, arg1);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to enter location");
        }
    }
    @When("^i enter in check-in date$")
    public void i_enter_in_check_in_date() {
        try{
            HotelSearchPageObjects.enterCheckInDate(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to enter check in date");
        }
    }

    @When("^i enter in check-out date$")
    public void i_enter_in_check_out_date() {
        try{
            HotelSearchPageObjects.enterCheckOutDate(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to enter check out date");
        }
    }

    @When("^i click on search button$")
    public void i_click_on_search_button() {
        try{
            HotelSearchPageObjects.clickHotelSearchButton(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to click on search button");
        }
    }

    @Then("^i will land on hotel search results page$")
    public void i_will_land_on_hotel_search_results_page() {
        try{
            HotelSearchPageObjects.verifyLocation(test);
            LoggerHandler.logInfo("Test Case 1 done");
            Screenshot.getScreenShot(driver, "test case 1");
        }
        catch(Exception e){
            LoggerHandler.logError("Test Case 1 failed somewhere");
            test.log(Status.FAIL, "Test Case 1 failed somewhere");
            Reporter.attachScreenshotToReport(test, driver, "test case 1 fail");
        }
    }
}
