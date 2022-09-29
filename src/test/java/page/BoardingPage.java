package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardingPage {

    private WebDriver driver;

    public By imageLogo = By.cssSelector("div[data-test='app-nav-sysdig-text-logo']");

    public BoardingPage (WebDriver driver) {
        this.driver = driver;
    }


}
