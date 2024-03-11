package uistore;

import org.openqa.selenium.By;

public class InvestmentPlansPageLocators {

	private By location = By.id("txtCity");
	private By locationDropdown = By.xpath("//div[@class='modal-content']/descendant::ul[1]");
	private By age = By.id("txtCustomerAge");
	private By income = By.xpath("(//label[@for='test1'])[5]");
	private By invest = By.xpath("//span[contains(text(), ' Invest annually & Save upto ₹46.8 K per annum in tax (Sec 80C) ')]");
	
	public By getInvest() {
		return invest;
	}
	
	public By getLocationDropdown() {
		return locationDropdown;
	}
	
	public By getAge() {
		return age;
	}
	
	public By getIncome() {
		return income;
	}

	public By getLocation() {
		return location;
	}
}
