package StepDefinition;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;

import Pages.*;
import Utils.*;
import cucumber.api.java.en.*;

public class HolidaySearchStepDefination {
    WebDriver driver = Hooks.driver;
    ExtentReports report = Hooks.report; 
    ExtentTest test = Hooks.test;

    @When("^i click on Holiday Option$")
    public void i_click_on_Holiday_Option(){
        try{
            test = report.createTest("Test Case 3");
            HomePageObjects.clickHoliday(driver, test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to click on Holiday Option");
        }
    }
    @When("^i enter \"([^\"]*)\" in depart-from field$")
    public void i_enter_in_depart_from_field(String arg1){
        try{
            HolidaySearchPageObjects.enterHolidayLeavingCity(test, arg1);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to enter depart from field");
        }
    }

    @When("^i enter on \"([^\"]*)\" in going-to field$")
    public void i_enter_on_in_going_to_field(String arg1){
        try{
            HolidaySearchPageObjects.enterHolidayDestinationCity(test, arg1);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to enter going to field");
        }
    }

    @When("^i select the month of travel$")
    public void i_select_the_month_of_travel(){
        try{
            HolidaySearchPageObjects.selectMonthofTravel(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to select the month of travel");
        }
    }

    @When("^i click on Search Holiday button$")
    public void i_click_on_Search_Holiday_button(){
        try{
            HolidaySearchPageObjects.clickSearchHoliday(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to click on Search Holiday Button");
        }
    }

    @Then("^i will land on holiday search results page$")
    public void i_will_land_on_holiday_search_results_page(){
        try{
            HolidaySearchPageObjects.landOnHolidaySearchPageResult(test);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to land on holiday search page result");
        }
    }

    @Then("^i verify if the destination city is on the page$")
    public void i_verify_if_the_destination_city_is_on_the_page(){
        try{
        HolidaySearchPageObjects.verifyHolidayDestinationCity(test);
        LoggerHandler.logInfo("Test Case 3 done");
        Screenshot.getScreenShot(driver, "test case 3");
        }
        catch(Exception e){
            LoggerHandler.logError("Test Case 3 failed somewhere");
            test.log(Status.FAIL, "Test Case 3 failed somewhere");
            Reporter.attachScreenshotToReport(test, driver, "test case 3 fail");
        }
    }
}
