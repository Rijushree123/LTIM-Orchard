package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.*;

import pages.BikeCheckOutPageObjects;
import pages.BikeInsurancePageObject;
import pages.HomePageObjects;
import pages.InsurancePlansPageObject;

import pages.PaymentPageObjects;
import utils.LoggerHandler;

public class BikeInsuranceStepDefinition {
    WebDriver driver = Hooks.driver;
    ExtentReports reports = Hooks.reports;
    ExtentTest test = Hooks.test;
    HomePageObjects homePageObjects = new HomePageObjects(driver);
    BikeInsurancePageObject bikeInsurancePageObject = new BikeInsurancePageObject(driver);
    InsurancePlansPageObject insurancePlansPageObject = new InsurancePlansPageObject(driver);
    BikeCheckOutPageObjects bikeCheckOutPageObjects = new BikeCheckOutPageObjects(driver);
    PaymentPageObjects paymentPageObjects = new PaymentPageObjects(driver);

    @Given("^I am in home page$")
    public void i_am_in_home_page() {

    }

    @When("^I hover on Insurance Product to click on Bike Insurance$")
    public void i_hover_on_Insurance_Product_to_click_on_Bike_Insurance() {
        test = reports.createTest("Test Case 3");
        homePageObjects.hoverInsuranceProduct(test);
        homePageObjects.clickBikeInsurance(test);
    }

    @When("^I land on Bike Insurance page to enter the \"([^\"]*)\"$")
    public void i_land_on_Bike_Insurance_page_to_enter_the(String arg1) {
        bikeInsurancePageObject.enterBikeNumber(arg1, test);
    }

    @When("^I click on View Prices button$")
    public void i_click_on_View_Prices_button() {
        bikeInsurancePageObject.clickViewPrice(test);
    }

    @When("^on the next page I click on first plan$")
    public void on_the_next_page_I_click_on_first_plan() {
        insurancePlansPageObject.clickFirstPlanPrice(test);
    }

    @When("^I land on Bike form page to fill the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_land_on_Bike_form_page_to_fill_the_and(String arg1, String arg2, String arg3) {
        bikeCheckOutPageObjects.enterFullName(arg1,test);
        bikeCheckOutPageObjects.enterEmail(arg2,test);
        bikeCheckOutPageObjects.enterMobileNumber(arg3,test);
        bikeCheckOutPageObjects.selectDate(test);
        bikeCheckOutPageObjects.selectMonth(test);
    }

    @When("^click on Pay Now button$")
    public void click_on_Pay_Now_button() {
        bikeCheckOutPageObjects.clickPayNowButton(test);
    }

    @Then("^I land on Payment Page to verify the email$")
    public void i_land_on_Payment_Page_to_verify_the_email() {
        try {
            paymentPageObjects.verifyBikeEmail(test);
            LoggerHandler.logInfo("Test Case 3 Done");
        } catch (Exception e) {

        }
    }

}
