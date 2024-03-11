package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ChennaiPageObjects;
import pages.HomePageObjects;
import pages.StorePageObjects;
import utils.LoggerHandler;

public class HomeVisitStepDefinition {

    WebDriver driver = Hooks.driver;
    ExtentReports reports = Hooks.reports;
    ExtentTest test = Hooks.test;

    HomePageObjects homePageObjects = new HomePageObjects(driver);
    StorePageObjects storepageObj = new StorePageObjects(driver);
    ChennaiPageObjects chennaiPageObj = new ChennaiPageObjects(driver);

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

    }

    @When("^I click on Stores near you inside Support$")
    public void i_click_on_Stores_near_you_inside_Support() throws Throwable {
        test = reports.createTest("Test Case 9");
        homePageObjects.hoverOnSupport(test);
        homePageObjects.clickOnStoresNearYou(test);
    }

    @When("^enter the \"([^\"]*)\"$")
    public void enter_the(String arg1) throws Throwable {
        storepageObj.clickOnSearch(test);
        storepageObj.enterSearch(test,arg1);
        storepageObj.clickOnChennai(test);
    }


    @When("^click on Schedule home visit button$")
    public void click_on_Schedule_home_visit_button() throws Throwable {
        chennaiPageObj.clickOnScheduleHomeVisit(test);
    }

    

    @When("^enter my \"([^\"]*)\",\"([^\"]*)\",what i am interested in,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void enter_my_what_i_am_interested_in(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        chennaiPageObj.clickOnName(test);
        chennaiPageObj.enterName(test,arg1);
        chennaiPageObj.clickOnMob(test);
        chennaiPageObj.enterMob(test,arg2);
        chennaiPageObj.clickOnInterested(test);
        chennaiPageObj.clickAddress1(test);
        chennaiPageObj.enterAddress1(test,arg3);
        chennaiPageObj.clickAddress1(test);
        chennaiPageObj.enterAddress2(test,arg4);
        chennaiPageObj.clickPincode(test);
        chennaiPageObj.enterPincode(test,arg5);
    }

    @When("^pick my slot$")
    public void pick_my_slot() throws Throwable {
        chennaiPageObj.clickTomorrow(test);
        chennaiPageObj.clickOn3rdSlot(test);
    }

    @When("^click on Continue button$")
    public void click_on_Continue_button() throws Throwable {
        chennaiPageObj.clickConfirm(test);

    }

    @Then("^home visit should be scheduled$")
    public void home_visit_should_be_scheduled() throws Throwable {
        chennaiPageObj.verifyMessage(test);
        LoggerHandler.logInfo("Test Case 9 done");
    }

}
