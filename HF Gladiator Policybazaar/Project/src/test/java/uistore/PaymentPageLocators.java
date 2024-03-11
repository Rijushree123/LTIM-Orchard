package uistore;

import org.openqa.selenium.By;

public class PaymentPageLocators {
  private By emailVerify = By.xpath("(//p[@class='detailTxt'])[1]");

  public By getEmailVerify() {
    return emailVerify;
  }
}
