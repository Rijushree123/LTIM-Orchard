package UiStore;

import org.openqa.selenium.By;

public class HomePageLocators {
    
    private HomePageLocators(){}

    private static By offers = By.xpath("//a[@title='Offers']");
    private static By yatra = By.xpath("//a[@title='https://www.yatra.com']");
    private static By hotels = By.xpath("//a[@id='booking_engine_hotels']");
    

    private static By flightOriginCity = By.xpath("//input[@id='BE_flight_origin_city']");
    private static By flightArrivalCity = By.xpath("//input[@id='BE_flight_arrival_city']");
    private static By flightOriginDate = By.xpath("//input[@id='BE_flight_origin_date']");
    private static By flightOriginIndate = By.xpath("//td[@id='21/02/2024']");
    private static By flightArrivalDate = By.xpath("//input[@id='BE_flight_arrival_date']");
    private static By flightArrivalIndate = By.xpath("//td[@id='22/02/2024']");
    private static By seniorCitizen = By.xpath("//li[@id='seniorcitizen_offer']");
    private static By flightSearchButton = By.xpath("//input[@value='Search Flights']");

    private static By holidays = By.xpath("(//a[@title='Holidays'])[1]");
    
    


    //Home Page Nav Bar
    public static By getOffers(){
        return offers;
    }
    public static By getYatra(){
        return yatra;
    }
    //Hotels
    public static By getHotels(){
        return hotels;
    }

    //Flights
    public static By getFlightOriginCity() {
        return flightOriginCity;
    }
    public static By getFlightArrivalCity() {
        return flightArrivalCity;
    }
    public static By getFlightOriginDate() {
        return flightOriginDate;
    }
    public static By getFlightOriginIndate() {
        return flightOriginIndate;
    }
    public static By getFlightArrivalDate() {
        return flightArrivalDate;
    }
    public static By getFlightArrivalIndate() {
        return flightArrivalIndate;
    }
    public static By getSeniorCitizen() {
        return seniorCitizen;
    }
    public static By getFlightSearchButton() {
        return flightSearchButton;
    } 

    //Holidays
    public static By getHolidays() {
        return holidays;
    }
}
