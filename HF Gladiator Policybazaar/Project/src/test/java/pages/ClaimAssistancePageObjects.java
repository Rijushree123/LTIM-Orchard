package pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.base.Function;

import uistore.ClaimAssistancePageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ClaimAssistancePageObjects {
    WebDriver driver;
    WebDriverHelper webDriverHelper;
    ClaimAssistancePageLocators claimAssistancePageLocators = new ClaimAssistancePageLocators();

    public ClaimAssistancePageObjects(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void verifyClaimAssistance(ExtentTest test) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);
            wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(claimAssistancePageLocators.getClaimAssistance());
                }
            });

            webDriverHelper.waitForElementToBeVisible(claimAssistancePageLocators.getClaimAssistance(), 20);
            String labelClaimAssistance = webDriverHelper.getText(claimAssistancePageLocators.getClaimAssistance());
            Assert.assertEquals(labelClaimAssistance, "Dedicated Claim Assistance");
            test.log(Status.PASS, "Claim Assistance Verification Passed");
            LoggerHandler.logInfo("Claim Assistance Verification Passed");
            Screenshot.getScreenShot(driver, "Claim_Assistance_Verification_Passed");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Claim Assistance Verification Failed");
            LoggerHandler.logError("Claim Assistance Verification Failed");
            Reporter.attachScreenshotToReport(test, driver, "Claim_Assistan_Verification_Failed");
        }
        catch (Exception e) {
            test.log(Status.FAIL, "Claim Assistance Verification Failed");
            LoggerHandler.logError("Claim Assistance Verification Failed");
            Reporter.attachScreenshotToReport(test, driver, "Claim_Assistan_Verification_Failed");
        }
    }
}
