package uistore;

import org.openqa.selenium.By;

public class FDCalculatorPageLocators {

	private By name = By.xpath("//form[@id='frmInv']/descendant::input[1]");
	private By mobile = By.xpath("//form[@id='frmInv']/descendant::input[3]");
	private By viewPlans = By.xpath("//span[text()='View Plans']");
	private By countryCode = By.xpath("//select[@id='invCountry']");
	private By optionIndia = By.xpath("//option[text()='India']");

	public By getOptionIndia() {
		return optionIndia;
	}

	public By getCountryCode() {
		return countryCode;
	}

	public By getViewPlans() {
		return viewPlans;
	}

	public By getName() {
		return name;
	}

	public By getMobile() {
		return mobile;
	}

}
