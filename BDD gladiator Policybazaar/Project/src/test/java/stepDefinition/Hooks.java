package stepDefinition;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.*;

public class Hooks extends Base {
    static WebDriver driver;
    static ExtentReports reports = Reporter.generateExtentReport("Policy Bazaar");
    static ExtentTest test;
    static Base baseObj = new Base();

    @Before
    public static void initializeDriver() {
        try {
            driver = baseObj.openBrowser();
        } catch (MalformedURLException e) {
            LoggerHandler.logError("Cannot initialize driver");
        }
    }

    @After
    public void end() {
        reports.flush();
        driver.quit();
    }
}
