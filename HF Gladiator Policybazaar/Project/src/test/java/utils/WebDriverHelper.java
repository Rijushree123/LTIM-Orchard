package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WebDriverHelper {
    public static final int IMPLICIT_WAIT_TIME = 10;
    public static final int PAGE_LOAD_TIME = 10;
    private WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeVisible(By element, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnElement(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.click();
        } catch (Exception e) {

        }
    }

    public void sendKeys(By element, String data) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            return webElement.getText();
        } catch (Exception e) {
            return null;
        }
    }

    // To scroll vertically down use the below method

    public void javascriptScrollVertically(int scrollAmount) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0," + scrollAmount + ")");
        } catch (Exception e) {
            // Handle or rethrow the exception here
            e.printStackTrace();
        }
    }

    public void javascriptScroll(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');",
                    element);
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jsClick(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToNewWindow() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                if (!windowHandle.isEmpty()) {
                    driver.switchTo().window(windowHandle);
                } else {
                    throw new Exception("New window could not be retrieved");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterAction(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOverElement(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearElement(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForClearElement(By element, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.textToBePresentInElement(driver.findElement(element), ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForTextToBePresentInElement(By element, String text) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.textToBePresentInElementLocated(element, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForattributeContains(By element, String attribute, String text) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.attributeContains(element, attribute, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForAttributeToBe(By element, int timeoutInSeconds, String str1, String str2) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.attributeToBe(element, str1, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void selectDropdownByIndex(By element, int index) {
        try {
            WebElement webElement = driver.findElement(element);
            Select selectObj = new Select(webElement);
            selectObj.selectByIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(By element, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void dropDown(By element, int num) {
        WebElement dropdown = driver.findElement(element);
        Select select = new Select(dropdown);
        select.selectByIndex(num);
    }

    public void selectFromDropdown(By element, String value) {
        try {
            WebElement webElement = driver.findElement(element);
            Select select = new Select(webElement);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waits(long n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void waitForElementToBeInvisible(By element, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.invisibilityOfElementLocated(element));
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public WebElement getElement(By element){
        return driver.findElement(element);
    }
  
    public String getAttribute(By locator) {
        String str=null;
        try {
            WebElement element = driver.findElement(locator);
            str=element.getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
  
}
