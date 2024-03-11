package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FDCalculatorPageObjects;
import pages.HomePageObjects;
import pages.InvestmentPlansPageObjects;
import utils.LoggerHandler;

public class FDCalculatorStepDefinition {

	WebDriver driver = Hooks.driver;
	ExtentReports reports = Hooks.reports;
	ExtentTest test = Hooks.test;
	HomePageObjects homePageObjects = new HomePageObjects(driver);
	FDCalculatorPageObjects fdCalculatorPageObjects = new FDCalculatorPageObjects(driver);
	InvestmentPlansPageObjects investmentPlansPageObjects = new InvestmentPlansPageObjects(driver);

	
	@When("^I click on FD Calculator in the Footer Section$")
	public void i_click_on_FD_Calculator_in_the_Footer_Section() {
		test = reports.createTest("Test case 8");
		homePageObjects.clickOnFDCalculator(test);
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" number on the next page$")
	public void i_enter_and_number_on_the_next_page(String arg1, String arg2) {
		fdCalculatorPageObjects.clickOnName(test);
		fdCalculatorPageObjects.enterOnName(test, arg1);
		fdCalculatorPageObjects.clickOnMobile(test);
		fdCalculatorPageObjects.enterOnMobile(test, arg2);
	}

	@When("^I click on View Plans$")
	public void i_click_on_View_Plans() {
		fdCalculatorPageObjects.clickOnViewPlans(test);
	}

	@Then("^I should be redirected to a page where investment plan is the title$")
	public void i_should_be_redirected_to_a_page_where_investment_plan_is_the_title() throws Throwable {
		investmentPlansPageObjects.getPageTitle(test);
		LoggerHandler.logInfo("Test Case 8 Done");
	}


}
