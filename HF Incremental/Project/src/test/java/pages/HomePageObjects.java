package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class HomePageObjects {
    public static WebDriverHelper webDriverHelper;

    //Hotel
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on Offers
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickOffers(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(HomePageLocators.getOffers());
            test.log(Status.PASS, "Clicked on Offers");
            Reporter.captureScreenshotAsBase64(driver, "ss1");
            Reporter.attachScreenshotToReport(test, driver, "ss1");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Offers");
            Reporter.captureScreenshotAsBase64(driver, "ss1");
            Reporter.attachScreenshotToReport(test, driver, "ss1");
            e.printStackTrace();
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on Yatra logo
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickYatra(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(HomePageLocators.getYatra());
            test.log(Status.PASS, "Clicked on Yatra ");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Yatra");
            e.printStackTrace();
        }
    }
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on Hotels option
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickHotels(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(HomePageLocators.getHotels());
            test.log(Status.PASS, "Clicked on Hotels ");
        }
        catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Hotels");
            e.printStackTrace();
        }
    }
    

    //Flight
    /*
     * @Author Name: Rijushree Guha
     * Description: This method is used to enter flight origin city
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void enterFlightOriginCity(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);

            ExcelReader excelReader = new ExcelReader();
            String excelFilePath = System.getProperty("user.dir")+"/testdata/Testdata.xlsx";
            String flightOriginCity = excelReader.readDataFromExcel(excelFilePath, "Sheet1", 3, 0);

            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightOriginCity(), 10);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightOriginCity());
            driver.findElement(HomePageLocators.getFlightOriginCity()).clear();
            webDriverHelper.sendKeys(HomePageLocators.getFlightOriginCity(), flightOriginCity);
            driver.findElement(HomePageLocators.getFlightOriginCity()).sendKeys(Keys.DOWN);
            driver.findElement(HomePageLocators.getFlightOriginCity()).sendKeys(Keys.DOWN);
            webDriverHelper.enterAction(HomePageLocators.getFlightOriginCity());
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
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void enterFlightArrivalCity(WebDriver driver, ExtentTest test){
        try{
            ExcelReader excelReader = new ExcelReader();
            String excelFilePath = System.getProperty("user.dir")+"/testdata/Testdata.xlsx";
            String flightArrivalCity = excelReader.readDataFromExcel(excelFilePath, "Sheet1", 4, 0);

            webDriverHelper.waitForElementToBeVisible(HomePageLocators.getFlightArrivalCity(), 10);
            webDriverHelper.clickOnElement(HomePageLocators.getFlightArrivalCity());
            driver.findElement(HomePageLocators.getFlightArrivalCity()).clear();
            webDriverHelper.sendKeys(HomePageLocators.getFlightArrivalCity(), flightArrivalCity);
            driver.findElement(HomePageLocators.getFlightArrivalCity()).sendKeys(Keys.DOWN);
            driver.findElement(HomePageLocators.getFlightArrivalCity()).sendKeys(Keys.UP);
            webDriverHelper.enterAction(HomePageLocators.getFlightArrivalCity());
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
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void getFlight_origin_date(WebDriver driver, ExtentTest test){
        try{
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
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void getFlight_arrival_date(WebDriver driver, ExtentTest test){
        try{
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
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickSeniorCitizen(WebDriver driver, ExtentTest test){
        try{
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
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickFlightSearchButton(WebDriver driver, ExtentTest test){
        try{
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



    /*Holiday
     * @Author Name: Rijushree Guha
     * Description: This method is used to click on holiday option
     * Last Modified: 08/02/2024
     *
     * @Param
     * WebDriver: This parameter is used perform the actions on the web elements
     * ExtentTest: This parameter is used to create the test case in the extent
     * report
    */
    public static void clickHoliday(WebDriver driver, ExtentTest test){
        try{
            webDriverHelper = new WebDriverHelper(driver);
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