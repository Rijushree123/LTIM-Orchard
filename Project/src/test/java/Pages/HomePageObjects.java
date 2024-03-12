package Pages;

import org.openqa.selenium.*;
import com.aventstack.extentreports.*;

import StepDefinition.Hooks;
import UiStore.*;
import Utils.*;

public class HomePageObjects {
    private static  WebDriver driver = Hooks.driver;
    private HomePageObjects(){
    }


    //Flight
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter flight origin city
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void enterFlightOriginCity(WebDriver driver1, ExtentTest test, String city){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightOriginCity(), 10);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightOriginCity());
            driver.findElement(HomePageLocators.getFlightOriginCity()).clear();
            webDriverHelper.sendKeys(HomePageLocators.getFlightOriginCity(), city);
            webDriverHelper.waitForElementToBeVisible(By.xpath("//p[text()='Kempegowda International']"), 10);
            webDriverHelper.clickOnElement(By.xpath("//p[text()='Kempegowda International']"));
            test.log(Status.PASS, "Enter Flight Origin city");
            LoggerHandler.logInfo("Enter Flight Origin City");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Enter Flight Origin city");
            Reporter.attachScreenshotToReport(test, driver, "enterFlightOriginCityFAIL");
            LoggerHandler.logError("Cannot Enter Flight Origin City");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter flight arrival city
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void enterFlightArrivalCity(WebDriver driver1, ExtentTest test, String city){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightArrivalCity(), 10);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightArrivalCity());
            driver.findElement(HomePageLocators.getFlightArrivalCity()).clear();
            webDriverHelper.sendKeys(HomePageLocators.getFlightArrivalCity(), city);
            webDriverHelper.waitForElementToBeVisible(By.xpath("//span[text()='(MAA)']"), 10);
            webDriverHelper.clickOnElement(By.xpath("//span[text()='(MAA)']"));
            test.log(Status.PASS, "Enter Flight Arrival city");
            LoggerHandler.logInfo("Enter Flight Arrival City");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Enter Flight Arrival city");
            Reporter.attachScreenshotToReport(test, driver, "enterFlightArrivalCityFAIL");
            LoggerHandler.logError("Cannot Enter Flight Arrival City");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to select the flight origin date
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void getFlight_origin_date(WebDriver driver1, ExtentTest test){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightOriginDate(), 15);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightOriginDate());
            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightOriginIndate(), 15);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightOriginIndate());
            test.log(Status.PASS, "Click on Flight Origin date");
            LoggerHandler.logInfo("Click on Flight Origin Date");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Flight Origin date");
            Reporter.attachScreenshotToReport(test, driver, "getFlight_origin_dateFAIL");
            LoggerHandler.logError("Cannot Click on Flight Origin Date");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to select the flight arrival date
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void getFlight_arrival_date(WebDriver driver1, ExtentTest test){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightArrivalDate(), 10);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightArrivalDate());
            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightArrivalIndate(), 10);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightArrivalIndate());
            test.log(Status.PASS, "Click on Flight Arrival date");
            LoggerHandler.logInfo("Click on Flight Arrival Date");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Flight Arrival date");
            Reporter.attachScreenshotToReport(test, driver, "getFlight_arrival_dateFAIL");
            LoggerHandler.logError("Cannot Click on Flight Arrival Date");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to select senior citizen
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void clickSeniorCitizen(WebDriver driver1, ExtentTest test){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.clickOnElement(HomePageLocators.getSeniorCitizen());
            test.log(Status.PASS, "Click on Senior citizen");
            LoggerHandler.logInfo("Click on Senior Citizen");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Senior citizen");
            Reporter.attachScreenshotToReport(test, driver, "clickSeniorCitizenFAIL");
            LoggerHandler.logError("Cannot Click on Senior Citizen");
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click flight search button
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void clickFlightSearchButton(WebDriver driver1,ExtentTest test){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightSearchButton());
            test.log(Status.PASS, "Click on Flight Search button");
            LoggerHandler.logInfo("Cannot Click on Flight Search Button");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Flight Search button");
            Reporter.attachScreenshotToReport(test, driver, "clickFlightSearchButtonFAIL");
            LoggerHandler.logError("Cannot Click on Flight Search Button");
        }
    }
    

    //Holiday
    /*Holiday
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on holiday option
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * report
    */
    public static void clickHoliday(WebDriver driver1, ExtentTest test){
        try{
            WebDriverHelper webDriverHelper = new WebDriverHelper(driver1);
            webDriverHelper.clickOnElement(HomePageLocators.getHolidays());
            test.log(Status.PASS, "Click on Holiday option");
            LoggerHandler.logInfo("Click on Holiday Option");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Holiday option");
            Reporter.attachScreenshotToReport(test, driver, "clickHolidayFAIL");
            LoggerHandler.logError("Cannot Click on Holiday Option");
        }
    }
}