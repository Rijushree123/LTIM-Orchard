package uistore;

import org.openqa.selenium.By;

public class ClaimAssistancePageLocators {
  private By claimAssistance = By.xpath("//h1[text()=' Claim Assistance']");

  public By getClaimAssistance() {
    return claimAssistance;
  }
}
