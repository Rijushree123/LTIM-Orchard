package uistore;

import org.openqa.selenium.By;

public class FamilyInsuranceResultPageLocators {
	private By cover = By.xpath("//div[@id='2']");

	public By getCover() {
		return cover;
	}

	private By lakh5to9 = By.xpath("//span[text()='₹5-9 Lakh']");

	public By getLakh5to9() {
		return lakh5to9;
	}

	private By apply = By.xpath("//button[contains(text(),'Apply')]");

	public By getApply() {
		return apply;
	}

	private By reassure = By.xpath("//div[@id='quoteStack_18']/div/div/div[2]/div[2]/button");

	public By getReassure() {
		return reassure;
	}

	private By policyPeroidBy = By.xpath("(//div[@class='label-radiobox-term'])[2]");

	public By getPolicyPeroidBy() {
		return policyPeroidBy;
	}

	private By safeguardAdd = By.xpath("(//button[contains(text(),'Add')])[1]");

	public By getSafeguardAdd() {
		return safeguardAdd;
	}

	private By proceed = By.xpath("//button[contains(text(),'Proceed to proposal')]");

	public By getProceed() {
		return proceed;
	}

	private By skip = By.xpath("//button[contains(text(),'Skip & continue ›')]");

	public By getSkip() {
		return skip;
	}

	private By totalPremium = By.xpath("//div[contains(text(),'Total premium')]");

	public By getTotalPremium() {
		return totalPremium;
	}

	private By checkBox = By.xpath("//input[@id='[object Object]2']");

	public By getCheckBox() {
		return checkBox;
	}

}
