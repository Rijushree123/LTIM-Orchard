package runner;
import java.io.*;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.FlightSearchPageObjects;
import pages.HolidaySearchPageObjects;
import pages.HomePageObjects;
import pages.HotelSearchPageObjects;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;

public class RunTest extends Base {  

    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeTest
    public void setUp(){
        reports = Reporter.generateExtentReport("Yatra");
    }

    @BeforeMethod
    public void initializeDriver(){
        try{
            driver = openBrowser();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test1() throws MalformedURLException, InterruptedException, IOException{
        try{
            test = reports.createTest("Test Case 1");
            HomePageObjects.clickOffers(driver, test);
            HomePageObjects.clickYatra(driver,test);
            HomePageObjects.clickHotels(driver,test);
            HotelSearchPageObjects.enterDestination(driver,test);
            HotelSearchPageObjects.enterCheckInDate(driver,test);
            HotelSearchPageObjects.enterCheckOutDate(driver,test);
            HotelSearchPageObjects.clickHotelSearchButton(driver,test);
            HotelSearchPageObjects.verifyLocation(driver, test);
            Screenshot.getScreenShot(driver, "Ss1");
            LoggerHandler.logInfo("Test Case 1 Done");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws MalformedURLException, InterruptedException{
        try{
            test = reports.createTest("Test Case 2");
            HomePageObjects.enterFlightOriginCity(driver, test);
            HomePageObjects.enterFlightArrivalCity(driver, test);
            HomePageObjects.getFlight_origin_date(driver, test);
            HomePageObjects.getFlight_arrival_date(driver, test);
            HomePageObjects.clickSeniorCitizen(driver, test);
            HomePageObjects.clickFlightSearchButton(driver, test);
            FlightSearchPageObjects.clickFlightSearchResultVerify(driver, test);
            FlightSearchPageObjects.verifyTextStops(driver, test);
            Screenshot.getScreenShot(driver, "Ss2");
            LoggerHandler.logInfo("Test Case 2 Done");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    

    @Test
    public void test3() throws MalformedURLException, InterruptedException{
        try{
            test = reports.createTest("Test Case 3"); 
            HomePageObjects.clickHoliday(driver, test);
            HolidaySearchPageObjects.enterHolidayLeavingCity(driver, test);
            HolidaySearchPageObjects.enterHolidayDestinationCity(driver, test);
            HolidaySearchPageObjects.selectMonthofTravel(driver, test);
            HolidaySearchPageObjects.clickSearchHoliday(driver, test);
            HolidaySearchPageObjects.landOnHolidaySearchPageResult(driver, test);
            HolidaySearchPageObjects.verifyHolidayDestinationCity(driver, test);
            Screenshot.getScreenShot(driver, "Ss3");
            LoggerHandler.logInfo("Test Case 3 Done");      
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void quit(){
        driver.quit();
        
    }
    @AfterTest
    public void flush(){
        reports.flush();
    }
}