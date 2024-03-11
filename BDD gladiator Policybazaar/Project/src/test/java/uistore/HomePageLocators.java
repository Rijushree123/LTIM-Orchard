package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    private By clickOnViewAll = By.xpath("//div[contains(text(),'View all ')]");
    private By clickBusinessInsurance = By.xpath("//label[@for='tab2']");
    private By clickShopOwnerInsurance = By.xpath("//span[contains(text(),'Shop Owner')]");

    private By insuranceProducts = By.xpath("//a[text()='Insurance Products ']");
    private By sipCalculator = By.xpath("(//span[text()='SIP Calculator'])[1]");
    private By fDCalculator = By.xpath("//a[text()='FD Calculator']");
    private By bikeInsurance = By.xpath("(//span[text()='Bike Insurance'])[1]");
    private By claim = By.xpath("//a[text()='Claim ']");
    private By fileNewClaim = By.xpath("//span[text()='File a new claim']");
    private By termInsurance = By.xpath("//div[@class ='product-item ']/div[3]");

    private By clickOnSIP = By.xpath("(//a[@href='https://www.policybazaar.com/sip/']/span)[1]");
    private By hoverOnSupport = By.xpath("//li[@class='shade rl']/a");
    private By clickOnStoresNearYou = By.xpath("(//span[@class='nearme-add'])[1]");

    private By InsuranceProduct = By.xpath("//li[@class='ruby-menu-mega shade mr']/a");
    private By FamilyHealthInsurance = By.xpath("//span[contains(text(),'Family Health Insurance')]");

    public By getClickShopOwnerInsurance() {
        return clickShopOwnerInsurance;
    }

    public By getClickBusinessInsurance() {
        return clickBusinessInsurance;
    }

    public By getClickOnViewAll() {
        return clickOnViewAll;
    }

    public By getInsuranceProducts() {
        return insuranceProducts;
    }

    public By getfDCalculator() {
        return fDCalculator;
    }

    public By getSipCalculator() {
        return sipCalculator;
    }

    public By getBikeInsurance() {
        return bikeInsurance;
    }

    public By getClaim() {
        return claim;
    }

    public By getFileNewClaim() {
        return fileNewClaim;
    }

    public By getTermInsurance() {
        return termInsurance;
    }

    public By getClickOnSIP() {
        return clickOnSIP;
    }

    public By getHoverOnSupport() {
        return hoverOnSupport;
    }

    public By getClickOnStoresNearYou() {
        return clickOnStoresNearYou;
    }

    public By getFamilyHealthInsurance() {
        return FamilyHealthInsurance;
    }

    public By getInsuranceProduct() {
        return InsuranceProduct;
    }

}