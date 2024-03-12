package Utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reporter {
    private static Properties prop;
    private static ExtentReports extentReport;
    private static String userDir = System.getProperty("user.dir");

    public static String timeStamp(){
        return new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
    }

    public static ExtentReports generateExtentReport() {
        return generateExtentReport(null);
    }

    public static ExtentReports generateExtentReport(String reportName) {
        if (extentReport == null) {
            extentReport = createExtentReport(reportName);
        }
        return extentReport;
    }

    private static ExtentReports createExtentReport(String reportName) {
        ExtentReports extentReport = new ExtentReports();
        // Load properties from browser.properties file
        String filepath = userDir + "/config/browser.properties";
        try {
            FileInputStream file = new FileInputStream(filepath);
            prop = new Properties();
            prop.load(file);
        } catch (IOException e) {
            LoggerHandler.logError(e.getLocalizedMessage());
        }

        String timestamp = timeStamp();

        // Define the report file path with the timestamp and provided report name
        String reportFilePath = System.getProperty("user.dir") + "/reports/";
        if (reportName == null || reportName.isEmpty()) {
            reportName = "_Enter Name_Application Report";
        }
        reportFilePath += reportName + "_" + timestamp + "_Report.html";

        File extentReportFile = new File(reportFilePath);

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);

        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("_Enter Name_Test Report");
        sparkReporter.config().setDocumentTitle("_Enter Name_ Test Automation Report");
        sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");

        extentReport.attachReporter(sparkReporter);

        extentReport.setSystemInfo("Application URL", prop.getProperty("url"));
        extentReport.setSystemInfo("Browser Name", prop.getProperty("browserName"));
        
        return extentReport;
    }

    public static String captureScreenshotAsBase64(WebDriver driver, String screenshotName) {
        String timestamp = timeStamp();
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        byte[] screenshotBytes = screenshotDriver.getScreenshotAs(OutputType.BYTES);

        String base64Screenshot = "";
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(screenshotBytes);
            base64Screenshot = Base64.getEncoder().encodeToString(baos.toByteArray());

            // Save the screenshot to a file for reference
            saveScreenshotToFile(screenshotBytes, screenshotName + "_" + timestamp + ".png");
        } catch (IOException e) {
        }

        return base64Screenshot;
    }

    private static void saveScreenshotToFile(byte[] screenshotBytes, String fileName) {
        String screenshotsDirPath = userDir + "/screenshot/";
            File screenshotsDir = new File(screenshotsDirPath);
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs();
            }

            String destinationScreenshotPath = screenshotsDirPath + fileName;
        try(FileOutputStream outputStream = new FileOutputStream(destinationScreenshotPath);){
            outputStream.write(screenshotBytes);
            outputStream.close();
        } catch (IOException e) {
        }
    }
    //To attach screenshot in the report file please call the below method.
     public static void attachScreenshotToReport(ExtentTest test, WebDriver driver, String screenshotName) {
        String base64Screenshot = captureScreenshotAsBase64(driver, screenshotName);
        test.addScreenCaptureFromBase64String(base64Screenshot);
    }
}
