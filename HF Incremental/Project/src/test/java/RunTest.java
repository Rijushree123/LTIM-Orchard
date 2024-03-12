

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Base;

public class RunTest extends Base {  

    public static WebDriver driver;
    /*
    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException, IOException{
        WebDriver driver = openBrowser();
        driver.get("https://www.yatra.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Testmm
    public void yatra() throws MalformedURLException, InterruptedException, IOException{
        WebDriver driver = openBrowser();
        driver.get("https://www.yatra.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        clickelement(driver, "//a[@title='Offers']");
        
        
        clickelement(driver, "//a[@title='https://www.yatra.com']");
        

        clickelement(driver, "//a[@id='booking_engine_hotels']");
        

        clickelement(driver, "//input[@id='BE_hotel_destination_city']");
        
        driver.findElement(By.xpath("//input[@id='BE_hotel_destination_city']")).clear();
        

        enterKeys(driver, "//input[@id='BE_hotel_destination_city']", "Bangalore");
        

        driver.findElement(By.xpath("//input[@id='BE_hotel_destination_city']")).clear();
        

        // clickelement(driver, "//input[@id='BE_hotel_destination_city']");
        driver.findElement(By.xpath("//input[@id='BE_hotel_destination_city']")).clear();

        enterKeys(driver, "//input[@id='BE_hotel_destination_city']", "New Delhi");
        

        hitEnter(driver, "//input[@id='BE_hotel_destination_city']");
        

        clickelement(driver, "//input[@id='BE_hotel_checkin_date']");
        

        clickelement(driver, "//td[@id='15/02/2024']");
        

        clickelement(driver, "//input[@id='BE_hotel_checkout_date']");
        

        clickelement(driver, "//td[@id='16/02/2024']");
        

        clickelement(driver, "//input[@id='BE_hotel_htsearch_btn']");

        SimpleDateFormat formate = new SimpleDateFormat("DDMMYYYYhhmmss");
        Calendar calendar = Calendar.getInstance();
        String date = formate.format(calendar.getTime());
        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File("screenshot/ss_" + date + ".scr"));

        createLog().info("Scrrenshot Taken");

        //driver.quit();
    }
/*
    @Test
    public void yatra2() throws MalformedURLException, InterruptedException{
        WebDriver driver = openBrowser();
        driver.get("https://www.yatra.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        clickelement(driver, "//input[@id='BE_flight_origin_city']");
        driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).clear();

        enterKeys(driver, "//input[@id='BE_flight_origin_city']", "Bangalore (BLR)");
        

        hitEnter(driver, "//input[@id='BE_flight_origin_city']");
        

        clickelement(driver, "//input[@id='BE_flight_arrival_city']");
        driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).clear();
        

        enterKeys(driver, "//input[@id='BE_flight_arrival_city']", "Chennai International");
        

        hitEnter(driver, "//input[@id='BE_flight_arrival_city']");
        

        clickelement(driver, "//input[@id='BE_flight_origin_date']");
        

        clickelement(driver, "//td[@id='21/02/2024']");
        

        clickelement(driver, "//input[@id='BE_flight_arrival_date']");
        

        clickelement(driver, "//td[@id='22/02/2024']");
        

        clickelement(driver, "//li[@id='seniorcitizen_offer']");
        

        clickelement(driver, "//input[@value='Search Flights']");
        

        driver.quit();

    }

    @Test
    public void yatra3() throws MalformedURLException, InterruptedException{
       
            driver = openBrowser();

            driver.get("https://www.yatra.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //driver.navigate().refresh();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                       
            driver.findElement(By.xpath("(//a[@title='Holidays'])[1]")).click();
            
            driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).click();
            // driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).clear();
            

            wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")), ""));
            
            driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).sendKeys("Jaipur");
            
            driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).sendKeys(Keys.ENTER);
            
            driver.findElement(By.xpath("//input[@id='holiday_destination_city']")).click();
            // driver.findElement(By.xpath("//input[@id='holiday_destination_city']")).clear();
            wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//input[@id='holiday_destination_city']")), ""));
            
            driver.findElement(By.xpath("//input[@id='holiday_destination_city']")).sendKeys("Bengaluru");
            
            driver.findElement(By.xpath("//input[@id='holiday_destination_city']")).sendKeys(Keys.ENTER);
            
            driver.findElement(By.xpath("//span[text()='Month of Travel (Optional)']")).click();
            
            driver.findElement(By.xpath("//span[text()='February 2024']")).click();
            
            driver.findElement(By.xpath("//input[@id='BE_holiday_search_btn']")).click();
            // 
            driver.quit();
        
    }
*/
    @AfterMethod
    public void end() throws MalformedURLException, InterruptedException, IOException{
        driver.quit();
    }
    

    public void hitEnter(WebDriver driver, String path){
        driver.findElement(By.xpath(path)).sendKeys(Keys.ENTER);
    }
    public void clickelement(WebDriver driver, String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void enterKeys(WebDriver driver, String xpath, String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }  
    public void createScreenshot() throws IOException{
        SimpleDateFormat formate = new SimpleDateFormat("DDMMYYYYhhmmss");
        Calendar calendar = Calendar.getInstance();
        String date = formate.format(calendar.getTime());
        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File("screenshot/ss_" + date + ".jpeg"));
    }
    public Logger createLog(){
        
        System.setProperty("name", "Yatra_" + timeStamp()+"_log");
        PropertyConfigurator.configure("./src/main/resources/log4j.properties");
        Logger log = Logger.getLogger(RunTest.class);
        return log;
    }
    public String timeStamp(){
        return new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
    }

}
 