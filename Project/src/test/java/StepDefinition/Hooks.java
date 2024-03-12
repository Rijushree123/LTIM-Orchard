package StepDefinition;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;
import Utils.Base;
import Utils.LoggerHandler;
import Utils.Reporter;
import cucumber.api.java.*;

public class Hooks extends Base{
    public static WebDriver driver;
    public static ExtentReports report = Reporter.generateExtentReport("Yatra"); 
    public static ExtentTest test;
 
    
    @Before
    public static void initializeDriver(){
        try {
            driver=openBrowser();
        } 
        catch (MalformedURLException e) {
            LoggerHandler.logError("Cannot initialize driver");
        }
    }

    @After
    public void end(){
        report.flush();
        driver.quit();
    }
}
