package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUserStep1Page {

    By buttonAcceptCookies = By.id("CybotCookiebotDialogBodyButtonAccept");
    By inputContainerSecurity = By.id("container-security");
    By buttonSelectAll = By.cssSelector("button[class='js-button-select-all']");
    By buttonSubmit = By.cssSelector("button[type='submit']");

    By inputName = By.cssSelector("input[name='FirstName']");
    By inputLastName = By.cssSelector("input[name='LastName']");
    By inputCompanyEmail = By.cssSelector("input[name='Email']");
    By inputCompanyName = By.cssSelector("input[name='Company']");
    By selectCountry = By.cssSelector("select[name='Country']");
    By selectRegion = By.cssSelector("select[name='Last_SaaS_Region_Requested__c']");
    By inputAcceptConditions = By.cssSelector("input[name='Privacy_Consent_to_Processing__c']");
    By buttonSubmitForm = By.cssSelector("button[class='mktoButton']");

    private WebDriver driver;

    public CreateUserStep1Page (WebDriver driver) {
        this.driver = driver;
    }

    public ThankYouPage nextStep(){
        driver.findElement(buttonAcceptCookies).click();
        driver.findElement(inputContainerSecurity).click();
        driver.findElement(buttonSubmit).click();

        fillForm();
        return new ThankYouPage(driver);
    }

    void fillForm(){
        driver.findElement(inputName).sendKeys("Ricardo");
        driver.findElement(inputLastName).sendKeys("Ayala");
        driver.findElement(inputCompanyEmail).sendKeys("ricardoayala2m@gmail.com");
        driver.findElement(inputCompanyName).sendKeys("sysdig");

        Select country = new Select(driver.findElement(selectCountry));
        country.selectByValue("Spain");

        Select region = new Select(driver.findElement(selectRegion));
        region.selectByValue("eu-central");

        driver.findElement(inputAcceptConditions).click();
        driver.findElement(buttonSubmitForm).click();

    }

}
