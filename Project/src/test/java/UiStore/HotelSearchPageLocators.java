package UiStore;

import org.openqa.selenium.By;

public class HotelSearchPageLocators {

    private HotelSearchPageLocators(){}
    private static By hotels = By.xpath("//a[@id='booking_engine_hotels']");
    private static By destCity = By.xpath("//input[@id='BE_hotel_destination_city']");
    private static By NewDelhi = By.xpath("//li[@class='active ac_over']");
    private static By checkindate = By.xpath("//input[@id='BE_hotel_checkin_date']");
    private static By indate = By.xpath("//td[@id='15/02/2024']");
    private static By checkoutdate = By.xpath("//input[@id='BE_hotel_checkout_date']");
    private static By outdate = By.xpath("//td[@id='16/02/2024']");
    private static By hotelSearchButton = By.xpath("//input[@id='BE_hotel_htsearch_btn']");
    private static By locationName = By.xpath("//p[contains(text(),'New Delhi')]");

    public static By getHotels() {
        return hotels;
    }

    public static By getDestionationCity() {
        return destCity;
    }
    public static By getNewDelhi() {
        return NewDelhi;
    }
    public static By getcheckIndate() {
        return checkindate;
    }

    public static By getIndate() {
        return indate;
    }

    public static By getcheckOutdate() {
        return checkoutdate;
    }

    public static By getOutdate() {
        return outdate;
    }

    public static By getHotelSearchButton() {
        return hotelSearchButton;
    }

    public static By getLocationName() {
        return locationName;
    }
    
}
