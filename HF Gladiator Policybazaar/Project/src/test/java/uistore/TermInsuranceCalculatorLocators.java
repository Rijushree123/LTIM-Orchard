package uistore;

import org.openqa.selenium.By;

public class TermInsuranceCalculatorLocators {
	private By termInsuranceCalculators = By.xpath("//span[contains(text(),'Term Insurance Calculator')]");
	private By femaleCheckBox = By.id("female");
	private By selectAge = By.id("term-age");
	private By selectLifeCoverRequired = By.id("term-coveramt");
	private By selectCoverTillAge = By.id("term-cover-till-age");
	private By premiumDisplayed = By.xpath("//div[@class='term-item']//div[2]");
	private By checkYourPremium = By.xpath("//span[text()='Check Your Premium']");

	public By getCheckYourPremium() {
		return checkYourPremium;
	}
	
	public By getTermInsuranceCalculators() {
		return termInsuranceCalculators;
	}

	public By getFemaleCheckBox() {
		return femaleCheckBox;
	}

	public By getSelectAge() {
		return selectAge;
	}

	public By getSelectLifeCoverRequired() {
		return selectLifeCoverRequired;
	}

	
	public By getSelectCoverTillAge() {
		return selectCoverTillAge;
	}

	public By getPremiumDisplayed() {
		return premiumDisplayed;
	}
}
