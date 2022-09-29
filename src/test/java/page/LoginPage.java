package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    private WebDriver driver;

    By inputUsername = By.cssSelector("input[data-test='login-username']");
    By inputPassword = By.cssSelector("input[data-test='login-password']");
    By buttonLogin = By.cssSelector("button[data-id='submit-login']");

    public By linkCreateUser = By.cssSelector("a[class='login__link']");
    public By labelLoginError = By.cssSelector("p[data-test='login-error-message']");
    public By buttonLoginGoogle = By.cssSelector("a[class='block-login__third-party-button']");


    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public BoardingPage login (String username, String password) {
        driver.findElement(inputUsername).sendKeys(username);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(buttonLogin).click();
        return new BoardingPage(driver);
    }


}
