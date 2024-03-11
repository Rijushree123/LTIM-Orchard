package uistore;

import org.openqa.selenium.By;

public class CarInsuranceLocators {

    private By carInsurance = By.xpath("(//a[text()='Car Insurance'])[1]");
    private By inputBox = By.xpath("//*[@id='step-one-pq']/div/div/div[2]/div[2]/div/div[1]/input");
    private By viewPrices = By.xpath("//button[text()='View Prices']");
    private By accessoriesCover = By.xpath("//p[text()='Accessories cover']");
    //private By electricalAccessories = By.xpath("(//div[@class='customCheckbox  mb-10'])[6]/label");
    private By electricalAccessories = By.xpath("//p[text()='Electrical Accessories']");
    private By firstInsurancePolicy = By.xpath("(//div[@class='primaryBtnV2 fillingEffect'])[1]");
    private By waitForLastPage = By.xpath("//button[text()='Pay securely']");
    private By textToBeVerify = By.xpath("//div[@class='accHead']");
    private By electricalAccessoriesBox = By.xpath("//*[@id='root']/section/div/div/div/div[1]/div[2]/div/label[3]/div[2]/div/div[2]/label");
    private By checkBox = By.name("116");

    public By getElectricalAccessoriesBox() {
        return electricalAccessoriesBox;
    }
    
    public By getCarInsurance() {
        return carInsurance;
    }

    public By getCheckBox() {
        return checkBox;
    }
    
    public By getInputBox() {
        return inputBox;
    }

    public By getViewPrices() {
        return viewPrices;
    }

    public By getAccessoriesCover() {
        return accessoriesCover;
    }

    public By getElectricalAccessories() {
        return electricalAccessories;
    }

    public By getFirstInsurancePolicy() {
        return firstInsurancePolicy;
    }

    public By getWaitForLastPage() {
        return waitForLastPage;
    }

    public By getTextToBeVerify() {
        return textToBeVerify;
    }

}
