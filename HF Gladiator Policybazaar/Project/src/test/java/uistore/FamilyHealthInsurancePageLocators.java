package uistore;

import org.openqa.selenium.By;

public class FamilyHealthInsurancePageLocators {

	private By genderFemale = By.xpath("//div[@id='health_bu']/div[3]/div[1]/div[2]/label");
	private By son = By.xpath("//label[@data-id='son']");

	private By husband = By.xpath("//label[@data-id='spouse']");

	private By continueButton = By.xpath("//div[@class='button btnHealthStep1']");

	private By more = By.xpath("//div[@for='more-member']");

	private By popUp = By.xpath("//span[@id='exit-intent-popup-close']");
	private By husbandAge = By.xpath("(//div[@id='name_feild']/select)[1]");
	private By sonAge = By.xpath("(//div[@id='name_feild']/select)[2]");
	private By continueButton2 = By.xpath("//div[@id='step_2']/div[3]/div");
	private By cityInputBar = By.xpath("//input[@id='healthCityPincode']");
	private By continueButton3 = By.xpath("//div[@id='btnHealthStep3']");
	private By nameInputBar = By.xpath("//div[@id='name_feild']//input");
	private By mobileInput = By.xpath("//input[@id='name5']");
	private By mobilenumCountry = By.xpath("//div[@class='country-flag']");
	private By mobileIndia = By.xpath("//div[contains(text(),'India (+91)')]");
	private By continueButton4 = By.xpath("//div[@id='btnHealthStep4']");
	private By waitForCovid=By.xpath("//label[@for='ped_cat_2']");
	private By secondBoxBy = By.xpath("//label[@for='ped_cat_3']");
	private By viewPlan = By.xpath("//button[@data-step='5']");
	private By checkBox = By.xpath("//input[@id='female']");

	public By getWaitForCovid() {
		return waitForCovid;
	}

	public By getViewPlan() {
		return viewPlan;
	}

	public By getSecondBoxBy() {
		return secondBoxBy;
	}

	public By getContinueButton4() {
		return continueButton4;
	}

	public By getCheckBox() {
		return checkBox;
	}
	
	public By getMobileInput() {
		return mobileInput;
	}

	public By getMobilenumCountry() {
		return mobilenumCountry;
	}

	public By getMobileIndia() {
		return mobileIndia;
	}

	public By getNameInputBar() {
		return nameInputBar;
	}

	public By getCityInputBar() {
		return cityInputBar;
	}

	public By getContinueButton3() {
		return continueButton3;
	}

	public By getHusbandAge() {
		return husbandAge;
	}

	public By getSonAge() {
		return sonAge;
	}

	public By getContinueButton2() {
		return continueButton2;
	}

	public By getPopUp() {
		return popUp;
	}

	public By getGenderFemale() {
		return genderFemale;
	}

	public By getHusband() {
		return husband;
	}

	public By getSon() {
		return son;
	}

	public By getContinueButton() {
		return continueButton;
	}

	public By getMore() {
		return more;
	}

}
