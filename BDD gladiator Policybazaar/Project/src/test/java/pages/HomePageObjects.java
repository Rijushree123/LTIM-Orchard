package pages;

import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocators;

import com.aventstack.extentreports.Status;

public class HomePageObjects {
    WebDriver driver;
    WebDriverHelper webDriverHelper;
    HomePageLocators homePageLocators = new HomePageLocators();
    ExtentTest test;

    public HomePageObjects(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        this.driver = driver;
    }

    public void clickBikeInsurance(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getBikeInsurance());
            test.log(Status.PASS, "Clicked on Bike Insurance");
            LoggerHandler.logInfo("Clicked on Bike Insurance");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Click on Bike Insurance");
            LoggerHandler.logError("Failed to Click on Bike Insurance");
        }
    }

    public void clickOnSIP(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getClickOnSIP());
            test.log(Status.PASS, "Clicking on SIP successful");
            LoggerHandler.logInfo("Clicking on SIP successful");
        } catch (Exception e) {

            LoggerHandler.logError("Clicking on SIP unsuccessful");
            test.log(Status.FAIL, "Clicking on SIP unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_SIP_Failed");

        }
    }

    public void hoverClaim(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getClaim());
            test.log(Status.PASS, "Hovered on Claim");
            LoggerHandler.logInfo("Hovered on Claim");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Hover on Claim");
            LoggerHandler.logError("Failed to Hover on Claim");
        }
    }

    public void hoverFileNewClaim(ExtentTest test) {
        try {
            webDriverHelper.waitForElementToBeVisible(homePageLocators.getFileNewClaim(), 20);
            webDriverHelper.clickOnElement(homePageLocators.getFileNewClaim());
            test.log(Status.PASS, "Hovered on File New Claim");
            LoggerHandler.logInfo("Hovered on File New Claim");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Hover on File New Claim");
            LoggerHandler.logError("Failed to Hover on File New Claim");
        }
    }

    public void clickTermInsurance(ExtentTest test) {
        try {
            webDriverHelper.waitForElementToBeVisible(homePageLocators.getTermInsurance(), 20);
            webDriverHelper.clickOnElement(homePageLocators.getTermInsurance());
            test.log(Status.PASS, "Clicked on term insurance");
            LoggerHandler.logInfo("Clicked on term insurance");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on term insurance");
            LoggerHandler.logError("Failed to click on term insurance");
        }
    }

    public void clickOnSIPCalculator(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getSipCalculator());
            LoggerHandler.logInfo("Clicked on SIP Calculator");
            test.pass("Clicked on SIP Calculator");
        } catch (Exception e) {
            test.fail("Could not click on SIP Calculator");
            LoggerHandler.logError("Could not click on SIP Calculator");
            Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_SIP_Calculator");
        }

    }

    public void clickOnFDCalculator(ExtentTest test) {
        try {
            webDriverHelper.javascriptScrollVertically(8000);
            webDriverHelper.jsClick(homePageLocators.getfDCalculator());
            LoggerHandler.logInfo("Clicked on FD Calculator");
            test.pass("Hovered over Insurance Products");
        } catch (Exception e) {
            test.fail("Could not click on FD Calculator");
            LoggerHandler.logError("Could not click on FD Calculator");
            Reporter.attachScreenshotToReport(test, driver, "Could_not_click_on_FD_Calculator");
        }

    }

    public void clickViewAll(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getClickOnViewAll());
            LoggerHandler.logInfo("Clicking View All Products successful");
            test.log(Status.PASS, "Clicking View All Products successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking View All Products unsuccessful");
            test.log(Status.FAIL, "Clicking View All Products unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_ViewAllProducts_Failed");
        }
    }

    public void clickBusinessInsurance(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getClickBusinessInsurance());
            LoggerHandler.logInfo("Clicking Business Insurance successful");
            test.log(Status.PASS, "Clicking Business Insurance successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Business Insurance unsuccessful");
            test.log(Status.FAIL, "Clicking Business Insurance unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_Business_Insurance_Failed");
        }
    }

    public void clickShopOwnerInsurance(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getClickShopOwnerInsurance());
            LoggerHandler.logInfo("Clicking Shop Owner Insurance successful");
            test.log(Status.PASS, "Clicking Shop Owner Insurance successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Shop Owner Insurance unsuccessful");
            test.log(Status.FAIL, "Clicking Shop Owner Insurance unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_ShopOwnerInsurance_Failed");
        }
    }

    public void hoverInsuranceProduct(ExtentTest test) {
        try {
            webDriverHelper.hoverOverElement(homePageLocators.getInsuranceProduct());
            LoggerHandler.logInfo("Hovered over Insurance product");
            test.pass("Hovered over Insurance product");
        } catch (Exception e) {
            LoggerHandler.logError("Could not hover Insurance product");
            test.fail("Could not hover Insurance product");
        }
    }

    public void clickFamilyHealthInsurance(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getFamilyHealthInsurance());
            LoggerHandler.logInfo("Clicked on Family health insurance");
            test.pass("Clicked on Family insurance");
        } catch (Exception e) {
            LoggerHandler.logError("unable to click on family health insurance");
            test.fail("unable to click family health insurance");

        }
    }

    public void hoverOnSupport(ExtentTest test) {
        try {
            webDriverHelper.hoverOverElement(homePageLocators.getHoverOnSupport());
            LoggerHandler.logInfo("Hover on Support successful");
            test.log(Status.PASS, "Hover on Support successful");
        } catch (Exception e) {
            LoggerHandler.logError("Hover on Support unsuccessful");
            test.log(Status.FAIL, "Hover on Support unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Hovering_Support_Failed");
        }
    }

    public void clickOnStoresNearYou(ExtentTest test) {
        try {
            webDriverHelper.clickOnElement(homePageLocators.getClickOnStoresNearYou());
            LoggerHandler.logInfo("Clicking Stores Near You successful");
            test.log(Status.PASS, "Clicking Stores Near You successful");
        } catch (Exception e) {
            LoggerHandler.logError("Clicking Stores Near You unsuccessful");
            test.log(Status.FAIL, "Clicking Stores Near You unsuccessful");
            Reporter.attachScreenshotToReport(test, driver, "Clicking_StoresNearYou_Failed");
        }
    }

}
