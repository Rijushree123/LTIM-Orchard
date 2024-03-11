package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BikeInsurancePageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class BikeInsurancePageObject {
    WebDriver driver;
    WebDriverHelper webDriverHelper;
    BikeInsurancePageLocators bikeInsurancePageLocators = new BikeInsurancePageLocators();

    public BikeInsurancePageObject(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void enterBikeNumber(String bikeNumber, ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(bikeInsurancePageLocators.getBikeNumber());
            webDriverHelper.sendKeys(bikeInsurancePageLocators.getBikeNumber(), ExcelReader.readDatafromExcel("./testdata/Testdata.xlsx", "Sheet1", Integer.parseInt(bikeNumber), 3));
            test.log(Status.PASS, "Entered Bike Number");
            LoggerHandler.logInfo("Entered Bike Number");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Enter Bike Number");
            LoggerHandler.logError("Failed to Enter Bike Number");
        }
    }

    public void clickViewPrice(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(bikeInsurancePageLocators.getViewPricesButton());
            test.log(Status.PASS, "Clicked on view price");
            LoggerHandler.logInfo("Clicked on view price");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on view price");
            LoggerHandler.logError("Failed to click on view price");
        }
    }
}
