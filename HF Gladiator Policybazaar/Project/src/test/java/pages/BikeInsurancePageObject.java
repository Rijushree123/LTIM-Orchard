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

    public void enterBikeNumber(ExtentTest test) {
        try {
            String file = System.getProperty("user.dir") + "/testdata/Testdata.xlsx";
            String bikeNumber = ExcelReader.readDatafromExcel(file, "Sheet1", 2, 3);
            webDriverHelper.clickOnElement(bikeInsurancePageLocators.getBikeNumber());
            webDriverHelper.sendKeys(bikeInsurancePageLocators.getBikeNumber(), bikeNumber);
            String message = "Entered Bike Number";
            test.log(Status.PASS, message);
            LoggerHandler.logInfo(message);
        } catch (Exception e) {
            String message ="Failed to Enter Bike Number";
            test.log(Status.FAIL, message);
            LoggerHandler.logError(message);
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
