package uistore;

import org.openqa.selenium.By;

public class BikeCheckOutPageLocators {
	private By fullName = By.xpath("//input[@placeholder='Full name']");
	private By mobileNumber = By.xpath("//input[@placeholder='Mobile number']");
	private By emailNumber = By.xpath("//input[@placeholder='Email address']");
	private By dayDropDown = By.xpath("//select[@id='regDate date']");
	private By dayDropDown22 = By.xpath("//select[@id='regDate date']/option[text()='22']");
	private By monthDropDown = By.xpath("//select[@id='regDate month']");
	private By monthDropDownJuly = By.xpath("//select[@id='regDate month']/option[text()='July']");
	private By payNowButton = By.xpath("//label[text()='Pay now']");

	public By getFullName() {
		return fullName;
	}

	public By getMobileNumber() {
		return mobileNumber;
	}

	public By getEmailNumber() {
		return emailNumber;
	}

	public By getDayDropDown() {
		return dayDropDown;
	}

	public By getDayDropDown22() {
		return dayDropDown22;
	}

	public By getMonthDropDown() {
		return monthDropDown;
	}

	public By getMonthDropDownJuly() {
		return monthDropDownJuly;
	}

	public By getPayNowButton() {
		return payNowButton;
	}
}
