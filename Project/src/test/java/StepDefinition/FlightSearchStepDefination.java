package StepDefinition;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;

import Pages.*;
import Utils.*;
import cucumber.api.java.en.*;

public class FlightSearchStepDefination extends Base{
    WebDriver driver = Hooks.driver;
    ExtentReports report = Hooks.report; 
    ExtentTest test = Hooks.test;


    @When("^i enter \"([^\"]*)\" depart-from field$")
    public void i_enter_depart_from_field(String arg1){
        try{
            test = report.createTest("Test Case 2");
            HomePageObjects.enterFlightOriginCity(driver, test, arg1);
        }
        catch(Exception e){
            LoggerHandler.logError("Failed to ener Depart from field");
        }
    }

    @When("^i enter on \"([^\"]*)\" going-to field$")
    public void i_enter_on_going_to_field(String arg1){
        HomePageObjects.enterFlightArrivalCity(driver, test, arg1);
    }

    @When("^i select date in departure date field$")
    public void i_select_date_in_departure_date_field(){
        HomePageObjects.getFlight_origin_date(driver, test);
    }

    @When("^i select date in return date field$")
    public void i_select_date_in_return_date_field(){
        HomePageObjects.getFlight_arrival_date(driver, test);
    }

    @When("^i click on Senior Citizen checkbox$")
    public void i_click_on_Senior_Citizen_checkbox(){
        HomePageObjects.clickSeniorCitizen(driver, test);
    }

    @When("^i click on Search Flight button$")
    public void i_click_on_Search_Flight_button(){
        HomePageObjects.clickFlightSearchButton(driver, test);
    }

    @Then("^i will land on flight search results page$")
    public void i_will_land_on_flight_search_results_page(){
        FlightSearchPageObjects.clickFlightSearchResultVerify(test);
    }

    @Then("^i verify the text Stops is visible or not$")
    public void i_verify_the_text_Stops_is_visible_or_not(){
        try{
        FlightSearchPageObjects.verifyTextStops(test);
        LoggerHandler.logInfo("Test Case 2 done");
        Screenshot.getScreenShot(driver, "test case 2");
        driver.quit();
        }
        catch(Exception e){
            LoggerHandler.logInfo("Test Case 2 failed somewhere");
            test.log(Status.FAIL, "Test Case 2 failed somewhere");
            Reporter.attachScreenshotToReport(test, driver, "test case 2 fail");
            LoggerHandler.logError("Failed to click on Hotel Option");
        }
    }

}
