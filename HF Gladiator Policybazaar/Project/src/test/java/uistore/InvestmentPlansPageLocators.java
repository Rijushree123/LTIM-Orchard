package uistore;

import org.openqa.selenium.By;

public class InvestmentPlansPageLocators {

	private By location = By.xpath("//input[@id='txtCity']");

	public By getLocation() {
		return location;
	}
}
