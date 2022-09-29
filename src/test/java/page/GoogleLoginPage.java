package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleLoginPage {

    private WebDriver driver;

    By inputUsername = By.id("identifierId");
    By buttonLogin = By.cssSelector("button[jsname='LgbsSe']");

    public GoogleLoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void login (String username) {
        driver.findElement(inputUsername).sendKeys(username);
        driver.findElement(buttonLogin).click();
    }
}
