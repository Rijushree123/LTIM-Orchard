package uistore;

import org.openqa.selenium.By;

public class HolidaySearchPageLocators {
    private HolidaySearchPageLocators(){}
    
    private static By saudiImg = By.xpath("//img[@src='https://www.yatra.com/ythomepagecms/media/double_banner/2023/Aug/3247491c57b58e61775d854ed932561e.jpg']");
    private static By holidayLeavingCity = By.xpath("//input[@id='BE_holiday_leaving_city']");
    private static By dropdownDiv= By.xpath("//div[@class='viewport']");
    private static By getJaipurOption= By.xpath("//strong[text()='Jaipur']");
    private static By holidayDestinationCity = By.xpath("//input[@id='holiday_destination_city']");
    private static By getBengaluru = By.xpath("//strong[text()='Bengaluru']");
    private static By holidayMonthTravel = By.xpath("//span[text()='Month of Travel (Optional)']");
    private static By holidayMonthTraveldate = By.xpath("//span[text()='February 2024']");
    private static By holidaySearchButton = By.xpath("//input[@value='Search Holidays']");
    private static By destinationCityResult = By.xpath("//input[@id='holidayDestination']");
    
    public static By getSaudiImg() {
        return saudiImg;
    }
    public static By getHolidayLeavingCity() {
        return holidayLeavingCity;
    }
    public static By getDropdownDiv() {
        return dropdownDiv;
    }
    public static By getGetJaipurOption() {
        return getJaipurOption;
    }
    public static By getHolidayDestinationCity() {
        return holidayDestinationCity;
    }
    public static By getGetBengaluru() {
        return getBengaluru;
    }   
    public static By getHolidayMonthTravel() {
        return holidayMonthTravel;
    }
    public static By getHolidayMonthTraveldate() {
        return holidayMonthTraveldate;
    }
    public static By getHolidaySearchButton() {
        return holidaySearchButton;
    }
    public static By getDestinationCityResult() {
        return destinationCityResult;
    } 
}
