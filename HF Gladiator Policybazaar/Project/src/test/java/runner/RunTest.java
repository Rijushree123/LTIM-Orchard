package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import utils.*;

public class RunTest {
    WebDriver driver;
    Base baseObj = new Base();
    public HomePageObjects homePageObjects;

    ExtentReports reports;
    ExtentTest test;

    @BeforeTest
    public void setUp() {
        reports = Reporter.generateExtentReport("PolicyBazaar");
    }

    @BeforeMethod
    public void initializeDriver() {
        try {
            driver = baseObj.openBrowser();
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }
 
    @Test(priority = 1)
    public void familyHealthInsuranceTest() {
        homePageObjects = new HomePageObjects(driver);
        FamilyHealthInsurancePageObjects  familyInsuranceObj = new FamilyHealthInsurancePageObjects(driver);
        FamilyInsuranceResultPage familyInsuranceResultPageObj = new FamilyInsuranceResultPage(driver);
        test = reports.createTest("Family Health Insurance Test");
        homePageObjects.hoverInsuranceProduct(test);
        homePageObjects.clickFamilyHealthInsurance(test);
        familyInsuranceObj.enterDetails(test);
        familyInsuranceResultPageObj.planDetails(test);
        LoggerHandler.logInfo("Test Case 1 Done");
    }

    @Test(priority = 2)
    public void sipTest() {
        homePageObjects = new HomePageObjects(driver);
        SIPPageObjects sipPageObj = new SIPPageObjects(driver);
        SIPInvestmentPageObject sipInvestmentPageObj = new SIPInvestmentPageObject(driver);
        CustomerDetailsPageObjects customerPageObj = new CustomerDetailsPageObjects(driver);
        test = reports.createTest("SIP Test");
        homePageObjects.hoverInsuranceProduct(test);
        homePageObjects.clickOnSIP(test);
        sipPageObj.enterUSernameAndMobileNo(test);
        sipInvestmentPageObj.clickGetDetails(test);
        sipInvestmentPageObj.clickProceed(test);
        customerPageObj.enterDetails(test);
        customerPageObj.verifyChoosePaymentMode(test);
        LoggerHandler.logInfo("Test Case 2 Done");
    }

    @Test(priority = 3)
    public void bikeInsuranceTest() {
        homePageObjects = new HomePageObjects(driver);
        BikeInsurancePageObject bikeInsurancePageObject = new BikeInsurancePageObject(driver);
        InsurancePlansPageObject insurancePlansPageObject = new InsurancePlansPageObject(driver);
        BikeCheckOutPageObjects bikeCheckOutPageObjects = new BikeCheckOutPageObjects(driver);
        PaymentPageObjects paymentPageObjects = new PaymentPageObjects(driver);
        test = reports.createTest("Bike Insurance Test");    
        homePageObjects.hoverInsuranceProduct(test);
        homePageObjects.clickBikeInsurance(test);
        bikeInsurancePageObject.enterBikeNumber(test);
        bikeInsurancePageObject.clickViewPrice(test);
        insurancePlansPageObject.clickFirstPlanPrice(test);
        bikeCheckOutPageObjects.fillBikeCheckoutDetails(test);
        paymentPageObjects.verifyBikeEmail(test);
        LoggerHandler.logInfo("Test Case 3 Done");
    }

    @Test(priority = 4)
    public void shopInsuranceTest() {
        homePageObjects = new HomePageObjects(driver);
        ShopOwnerPageObjects shopObj = new ShopOwnerPageObjects(driver);
        AboutShopPageObjects aboutPageObj = new AboutShopPageObjects(driver);
        test = reports.createTest("Shop Insurance Test");
        homePageObjects.clickViewAll(test);
        homePageObjects.clickBusinessInsurance(test);
        homePageObjects.clickShopOwnerInsurance(test);
        shopObj.fillDetails(test);
        aboutPageObj.fillBusinessDetails(test);
        aboutPageObj.clickGetQuote(test);
        aboutPageObj.verifyThankYou(test);
        LoggerHandler.logInfo("Test Case 4 Done");
    }

    @Test(priority = 5)
    public void termInsuranceCalculatorTest() {
        homePageObjects = new HomePageObjects(driver);
        TermInsuranceCalculatorPage termInsuranceCalculatorPageObj = new TermInsuranceCalculatorPage(driver);
        test = reports.createTest("Term Insurance Calculator");
        homePageObjects.hoverInsuranceProduct(test);
        termInsuranceCalculatorPageObj.clickOnTermInsuranceCalculators(test);
        termInsuranceCalculatorPageObj.clickOnFemaleCheckBox(test);
        termInsuranceCalculatorPageObj.selectAgeFromDropdown(test);
        termInsuranceCalculatorPageObj.selectLifeCoverRequiredFromDropdown(test);
        termInsuranceCalculatorPageObj.selectCoverTillAgeFromDropdown(test);
        termInsuranceCalculatorPageObj.printAmountOfPremiumDisplayed(test);
        LoggerHandler.logInfo("Test Case 5 Done");
    }

    @Test(priority = 6)
    public void sipCalculatorTest() {
        homePageObjects = new HomePageObjects(driver);
        SIPCalculatorPageObjects sipCalculatorPageObjects = new SIPCalculatorPageObjects(driver);
        test = reports.createTest("SIP Calculator Test");
        homePageObjects.hoverInsuranceProduct(test);
        homePageObjects.clickOnSIPCalculator(test);
        sipCalculatorPageObjects.calculateSIP(test);
        LoggerHandler.logInfo("Test Case 6 done");
    }

    @Test(priority = 7)
    public void carInsuranceTest() {
        homePageObjects = new HomePageObjects(driver);
        CarInsurancePage carInsurancePageObj = new CarInsurancePage(driver);
        test = reports.createTest("Car Insurance Test");
        homePageObjects.hoverInsuranceProduct(test);
        carInsurancePageObj.clickOnCarInsurance(test);
        carInsurancePageObj.enterTheCarNumber(test);
        carInsurancePageObj.clickOnViewPrices(test);
        carInsurancePageObj.clickOnAccessoriesCover(test);
        carInsurancePageObj.clickOnelectricalAccessories(test);
        carInsurancePageObj.clickOnFirstInsurancePolicy(test);
        carInsurancePageObj.verifyText(test);
        LoggerHandler.logInfo("Test Case 7 done");
    }

    @Test(priority = 8)
    public void fdCalculatorTest() {
        homePageObjects = new HomePageObjects(driver);
        FDCalculatorPageObjects fdCalculatorPageObjects = new FDCalculatorPageObjects(driver);
        InvestmentPlansPageObjects investmentPlansPageObjects = new InvestmentPlansPageObjects(driver);
        test = reports.createTest("FD Calculator Test");
        homePageObjects.clickOnFDCalculator(test);
        fdCalculatorPageObjects.clickOnName(test);
        fdCalculatorPageObjects.enterOnName(test);
        fdCalculatorPageObjects.clickOnMobile(test);
        fdCalculatorPageObjects.enterOnMobile(test);
        fdCalculatorPageObjects.clickOnViewPlans(test);
        investmentPlansPageObjects.getPageTitle(test);
        LoggerHandler.logInfo("Test Case 8 done");
    }

    @Test(priority = 9)
    public void homeVisitTest() {
        homePageObjects = new HomePageObjects(driver);
        StorePageObjects storepageObj = new StorePageObjects(driver);
        ChennaiPageObjects chennaiPageObj = new ChennaiPageObjects(driver);
        test = reports.createTest("Home Visit Test");
        homePageObjects.hoverOnSupport(test);
        homePageObjects.clickOnStoresNearYou(test);
        storepageObj.searchForCity(test);
        chennaiPageObj.clickOnScheduleHomeVisit(test);
        chennaiPageObj.fillForm(test);
        chennaiPageObj.verifyMessage(test);
        LoggerHandler.logInfo("Test Case 9 done");
    }

    @Test(priority = 10)
    public void claimAssistanceTest() {
        homePageObjects = new HomePageObjects(driver);
        ClaimAssistancePageObjects claimAssistancePageObjects = new ClaimAssistancePageObjects(driver);
        test = reports.createTest("Claim Assistance Test");
        homePageObjects.hoverClaim(test);
        homePageObjects.hoverFileNewClaim(test);
        homePageObjects.clickTermInsurance(test);
        claimAssistancePageObjects.verifyClaimAssistance(test);
        LoggerHandler.logInfo("Test Case 10 Done");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterTest
    public void flush() {
        reports.flush();
        SendEmail.sendMail();
    }

}
