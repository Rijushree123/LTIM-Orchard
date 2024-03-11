package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CarInsurancePage;
import pages.HomePageObjects;
import utils.LoggerHandler;

public class CarInsuranceStepDefination {
    
    WebDriver driver = Hooks.driver;
    ExtentReports reports = Hooks.reports;
    ExtentTest test = Hooks.test;
    HomePageObjects homePageObjects = new HomePageObjects(driver);
    CarInsurancePage carInsurancePageObj = new CarInsurancePage(driver);

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        test = reports.createTest("Test Case 7");
    }

    @When("^I hover over Insurance product on the top navigation bar$")
    public void i_hover_over_Insurance_product_on_the_top_navigation_bar() {
        homePageObjects.hoverInsuranceProduct(test);
    }

    @And("^I click on Car Insurance$")
    public void i_click_on_Car_Insurance() {
        carInsurancePageObj.clickOnCarInsurance(test);
    }

    @And("^I input the \"([^\"]*)\" and click on View prices$")
    public void i_input_the_and_click_on_View_prices(String arg1) {
        carInsurancePageObj.enterTheCarNumber(test, arg1);
        carInsurancePageObj.clickOnViewPrices(test);
    }

    @Then("^I should be redirected to the plans page$")
    public void i_should_be_redirected_to_the_plans_page() {
        carInsurancePageObj.isPlansPage(test);
    }

    @And("^I click on Accessories Cover under Sort & Filter section on the left side$")
    public void i_click_on_Accessories_Cover_under_Sort_Filter_section_on_the_left_side() {
        carInsurancePageObj.clickOnAccessoriesCover(test);
    }

    @And("^I select the Electrical Accessories checkbox$")
    public void i_select_the_Electrical_Accessories_checkbox() {
        carInsurancePageObj.clickOnelectricalAccessories(test);
    }

    @And("^I click on the first insurance price amount$")
    public void i_click_on_the_first_insurance_price_amount() {
        carInsurancePageObj.clickOnFirstInsurancePolicy(test);
    }

    @And("^I verify the label Critical details is present and capture a screenshot$")
    public void i_verify_the_label_Critical_details_is_present_and_capture_a_screenshot() {
        carInsurancePageObj.verifyText(test);
        LoggerHandler.logInfo("Test case 7 done");
    }
}
