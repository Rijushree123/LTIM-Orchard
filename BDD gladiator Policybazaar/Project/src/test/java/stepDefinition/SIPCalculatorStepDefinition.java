package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePageObjects;
import pages.SIPCalculatorPageObjects;
import utils.LoggerHandler;

public class SIPCalculatorStepDefinition {

	WebDriver driver = Hooks.driver;
	ExtentReports reports = Hooks.reports;
	ExtentTest test = Hooks.test;
	HomePageObjects homePageObjects = new HomePageObjects(driver);
	SIPCalculatorPageObjects sipCalculatorPageObjects = new SIPCalculatorPageObjects(driver);

	@When("^I hover over Insurance Products to click on SIP Calculator$")
	public void i_hover_over_Insurance_Products_to_click_on_SIP_Calculator() {
		test = reports.createTest("Test Case 6");
		homePageObjects.hoverInsuranceProduct(test);
		homePageObjects.clickOnSIPCalculator(test);
	}

	@When("^I click on Yearly SIP$")
	public void i_click_on_Yearly_SIP() {
		sipCalculatorPageObjects.clickOnYearlySIP(test);
	}

	@When("^I am redirected to the SIP calculator page where I enter the \"([^\"]*)\"$")
	public void i_am_redirected_to_the_SIP_calculator_page_where_I_enter_the(String arg1) {
		sipCalculatorPageObjects.clickOnInvestAmount(test);
		sipCalculatorPageObjects.enterOnInvestAmount(test, arg1);
	}

	@When("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_and(String arg1, String arg2) {
		sipCalculatorPageObjects.clickOnInvestYears(test);
		sipCalculatorPageObjects.enterOnInvestYears(test, arg1);
		sipCalculatorPageObjects.clickOnExpectedReturn(test);
		sipCalculatorPageObjects.enterOnExpectedReturn(test, arg2);
	}

	@Then("^I should see the Expected Total Wealth$")
	public void i_should_see_the_Expected_Total_Wealth() {
		sipCalculatorPageObjects.getTotalWealth(test);
		LoggerHandler.logInfo("Test Case 6 Done");
	}
}
