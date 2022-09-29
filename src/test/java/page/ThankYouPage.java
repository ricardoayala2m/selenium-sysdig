package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {

    public By labelThankYou = By.linkText("Thank You For Starting Your Free Trial");
    public By divMenu = By.id("site-nav-desktop-primary-inner");

    private WebDriver driver;

    public ThankYouPage (WebDriver driver) {
        this.driver = driver;
    }
}
