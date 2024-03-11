package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimAssistancePageObjects;
import pages.HomePageObjects;
import utils.LoggerHandler;

public class ClaimInsuranceStepDefinition {
    WebDriver driver = Hooks.driver;
    ExtentReports reports = Hooks.reports;
    ExtentTest test = Hooks.test;
    HomePageObjects homePageObjects = new HomePageObjects(driver);
    ClaimAssistancePageObjects claimAssistancePageObjects = new ClaimAssistancePageObjects(driver);

    @Given("^I am in Home Page$")
    public void i_am_in_Home_Page() {

    }

    @When("^I hover on Claim and click on File a new claim$")
    public void i_hover_on_Claim_and_click_on_File_a_new_claim() {
        test = reports.createTest("Test Case 10");
        homePageObjects.hoverClaim(test);
        homePageObjects.hoverFileNewClaim(test);
    }

    @When("^click on Term Insurance$")
    public void click_on_Term_Insurance() {
        homePageObjects.clickTermInsurance(test);
    }

    @Then("^I land on Claim Assistance Page to capture the screenshot$")
    public void i_land_on_Claim_Assistance_Page_to_capture_the_screenshot() {
        claimAssistancePageObjects.verifyClaimAssistance(test);
        LoggerHandler.logInfo("Test Case 10 Done");
    }

}
