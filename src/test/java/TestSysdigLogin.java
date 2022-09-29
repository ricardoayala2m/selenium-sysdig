
import enumeration.Region;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

import java.util.concurrent.TimeUnit;

public class TestSysdigLogin {

    private WebDriver driver;

    @BeforeClass
    public static void setupWebdriverChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginOKTest() {
        driver.get(Region.EU1.getURL());
        LoginPage loginPage = new LoginPage(driver);
        BoardingPage boardingPage = loginPage.login("ricardoayala2m@gmail.com", "Stubhub123");
        Assert.assertTrue(driver.findElement(boardingPage.imageLogo).isDisplayed());
    }

    @Test
    public void loginKOTest() {
        driver.get(Region.EU1.getURL());
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("ricardoayala2m@gmail.com", "Stubhub");
        Assert.assertTrue(driver.findElement(loginPage.labelLoginError).isDisplayed());
    }

    @Test
    public void createUserTest(){
        driver.get(Region.EU1.getURL());
        LoginPage loginPage = new LoginPage(driver);
        driver.findElement(loginPage.linkCreateUser).click();

        CreateUserStep1Page createUserStep1Page = new CreateUserStep1Page(driver);
        ThankYouPage thankYouPage = createUserStep1Page.nextStep();

        Assert.assertTrue(driver.findElement(thankYouPage.divMenu).isDisplayed());
    }

    @Test
    public void loginGoogleTest() {
        driver.get(Region.EU1.getURL());
        LoginPage loginPage = new LoginPage(driver);
        driver.findElement(loginPage.buttonLoginGoogle).click();

        GoogleLoginPage googleLoginPage = new GoogleLoginPage(driver);
        googleLoginPage.login("basurafuera@gmail.com");
        //I cant login using this chromedriver (insecure)
    }





}