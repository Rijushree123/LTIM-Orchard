package uistore;

import org.openqa.selenium.By;

public class BikeInsurancePageLocators {
	private By bikeNumber = By.xpath("(//input[@id='twoWheelerRegistrationNumber'])[1]");
	private By popUpCross = By.xpath("//div[@id='exit-intent-popup-close']");
	private By viewPricesButton = By.xpath("//div[@class='form_submit']/button");

	public By getBikeNumber() {
		return bikeNumber;
	}

	public By getPopUpCross() {
		return popUpCross;
	}

	public By getViewPricesButton() {
		return viewPricesButton;
	}
}
