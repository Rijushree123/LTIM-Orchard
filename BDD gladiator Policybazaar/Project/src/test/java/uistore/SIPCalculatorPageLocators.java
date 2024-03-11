package uistore;

import org.openqa.selenium.By;

public class SIPCalculatorPageLocators {

	private By yearlySIP = By.xpath("//div[@class='invest-time']/label[2]");
	private By investAmt = By.xpath("(//div[@class='invest-input'])[1]/descendant::input[1]");
	private By investYears = By.xpath("(//div[@class='invest-input'])[1]/descendant::input[2]");
	private By expectedReturn = By.xpath("(//div[@class='invest-input'])[1]/descendant::input[4]");
	private By totalWealth = By.xpath("(//div[@class='wealth-amout'])[1]/span[2]");

	public By getYearlySIP() {
		return yearlySIP;
	}

	public By getInvestAmt() {
		return investAmt;
	}

	public By getInvestYears() {
		return investYears;
	}

	public By getExpectedReturn() {
		return expectedReturn;
	}

	public By getTotalWealth() {
		return totalWealth;
	}

}
