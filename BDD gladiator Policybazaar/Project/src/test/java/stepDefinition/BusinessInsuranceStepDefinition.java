package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AboutShopPageObjects;
import pages.HomePageObjects;
import pages.ShopOwnerPageObjects;

public class BusinessInsuranceStepDefinition {

    WebDriver driver = Hooks.driver;
    ExtentReports reports = Hooks.reports;
    ExtentTest test = Hooks.test;

    HomePageObjects homePageObjects = new HomePageObjects(driver);
    ShopOwnerPageObjects shopObj = new ShopOwnerPageObjects(driver);
    AboutShopPageObjects aboutPageObj = new AboutShopPageObjects(driver);

    @Given("^I am in homepage$")
    public void i_am_in_homepage() throws Throwable {

    }

    @When("^I click on Business Insurance inside View All Products$")
    public void i_click_on_Business_Insurance_inside_View_All_Products() throws Throwable {
        test = reports.createTest("Test Case 4");
        homePageObjects.clickViewAll(test);
        homePageObjects.clickBusinessInsurance(test);
    }

    @When("^select Shop Owner Insurance$")
    public void select_Shop_Owner_Insurance() throws Throwable {
        homePageObjects.clickShopOwnerInsurance(test);
    }

    @When("^enter your \"([^\"]*)\",\"([^\"]*)\"$")
    public void enter_your(String arg1, String arg2) throws Throwable {
            shopObj.clickCompanyName(test);
            shopObj.enterCompanyName(test,arg1);
             shopObj.clickMobile(test);
             shopObj.enterMobile(test,arg2);
    }

    @When("^click on View plans button$")
    public void click_on_View_plans_button() throws Throwable {
        shopObj.clickViewPlans(test);
    }

    @When("^select city as Delhi$")
    public void select_city_as_Delhi() throws Throwable {
        shopObj.clickDelhi(test);
    }

    @When("^select radio button for More Than one and half crore$")
    public void select_radio_button_for_More_Than_one_and_half_crore() throws Throwable {
        shopObj.clickMoreThan1cr(test);
        shopObj.clickViewPlansAgain(test);
    }

    @When("^select Business Type as Cafe shop$")
    public void select_Business_Type_as_Cafe_shop() throws Throwable {
        aboutPageObj.clickBusinessType(test);
        aboutPageObj.enterBusinessType(test);
        aboutPageObj.clickContinue(test);
    }

    @When("^enter \"([^\"]*)\"$")
    public void enter(String arg1) throws Throwable {
        aboutPageObj.clickValue(test);
        aboutPageObj.enterValue(test,arg1);
    }

    @When("^click on Continue$")
    public void click_on_Continue() throws Throwable {
        aboutPageObj.clickContinue(test);
    }

    @When("^select the first plan$")
    public void select_the_first_plan() throws Throwable {
        aboutPageObj.clickGetQuote(test);
    }

    @Then("^I land on the selected plan page to verify if Thank You is present or not$")
    public void i_land_on_the_selected_plan_page_to_verify_if_Thank_You_is_present_or_not() throws Throwable {
        aboutPageObj.verifyThankYou(test);
    }

}
