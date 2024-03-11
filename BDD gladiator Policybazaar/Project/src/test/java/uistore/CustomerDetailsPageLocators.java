package uistore;

import org.openqa.selenium.By;

public class CustomerDetailsPageLocators {

    private By clickGender=By.xpath("(//span[contains(text(),'Male')])[1]");
    private By clickEmail=By.id("Email");
    private By clickDOB=By.id("DOB");
    private By clickAnnualIncome=By.id("AnnualIncome");
    private By clickProceedInCustomerDetails=By.xpath("(//button[contains(text(),'Proceed')])[1]");
    private By clickPincodeInCustomerDetails=By.id("Pincode");
    private By clickCity=By.id("City");
    private By radioForCity=By.xpath("//ul[@id='cityUL']/li/a");
    private By clickReviewDetails=By.xpath("(//button[contains(text(),'Review Details')])[1]");
    private By clickCheckbox=By.xpath("//label[@class='checkboxLabel']/span[2]");
    private By clickCheckout=By.xpath("//button[contains(text(),'Checkout')]");
    private By verifyChoosePaymentMode=By.xpath("(//h4)[1]");

    public By getRadioForCity() {
        return radioForCity;
    }
    
    public By getClickCity() {
        return clickCity;
    }

    public By getVerifyChoosePaymentMode() {
        return verifyChoosePaymentMode;
    }

    public By getClickCheckout() {
        return clickCheckout;
    }

    public By getClickCheckbox() {
        return clickCheckbox;
    }

    public By getClickReviewDetails() {
        return clickReviewDetails;
    }

    public By getClickPincodeInCustomerDetails() {
        return clickPincodeInCustomerDetails;
    }

    public By getClickProceedInCustomerDetails() {
        return clickProceedInCustomerDetails;
    }

    public By getClickAnnualIncome() {
        return clickAnnualIncome;
    }

    public By getClickDOB() {
        return clickDOB;
    }

    public By getClickEmail() {
        return clickEmail;
    }

    public By getClickGender() {
        return clickGender;
    }
    
}
