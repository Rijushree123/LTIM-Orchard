package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PaymentPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PaymentPageObjects {
    WebDriver driver;
    WebDriverHelper webDriverHelper;
    PaymentPageLocators paymentPageLocators = new PaymentPageLocators();

    public PaymentPageObjects(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void verifyBikeEmail(ExtentTest test) throws IOException {
        try {
            webDriverHelper.waitForElementToBeVisible(paymentPageLocators.getEmailVerify(), 30);
            String emailVerifyText = webDriverHelper.getText(paymentPageLocators.getEmailVerify());
            Assert.assertEquals(emailVerifyText, "demo@gmail.com");
            test.log(Status.PASS, "Verified Bike Email");
            LoggerHandler.logInfo("Verified Bike Email");
            Screenshot.getScreenShot(driver, "Verified_Bike_Email");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to verify Bike Email");
            LoggerHandler.logError("Failed to verify Bike Email");
            Reporter.attachScreenshotToReport(test, driver, "Bike_Email_Verification_Failed");
        }
    }
}
