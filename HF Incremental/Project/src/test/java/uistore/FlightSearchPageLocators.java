package uistore;

import org.openqa.selenium.By;

public class FlightSearchPageLocators {

    private FlightSearchPageLocators(){}
    
    private static By stops = By.xpath("//span[text()='Stops: ']");

    public static By getStops() {
        return stops;
    }
    
}
