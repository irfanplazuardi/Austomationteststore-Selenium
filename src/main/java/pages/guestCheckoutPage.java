package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class guestCheckoutPage {
    WebDriver driver;

    By firstNameForm = By.id("guestFrm_firstname");
    By lastNameForm = By.id("guestFrm_lastname");
    By emailForm = By.id("guestFrm_email");
    By telephoneForm = By.id("guestFrm_telephone");
    By faxForm = By.id("guestFrm_fax");
    By companyForm = By.id("guestFrm_company");
    By address1Form = By.id("guestFrm_address_1");
    By address2Form = By.id("guestFrm_address_2");
    By cityForm = By.id("guestFrm_city");
    By regionForm = By.id("guestFrm_zone_id");
    By postcodeForm = By.id("guestFrm_postcode");
    By countryForm = By.id("guestFrm_country_id");
    By continueBtnForm = By.xpath("//*[@id=\"guestFrm\"]/div[4]/div/button");

    public guestCheckoutPage(WebDriver driver){this.driver = driver;}

    public void inputForm(){
        driver.findElement(firstNameForm).sendKeys("Irfan");
        driver.findElement(lastNameForm).sendKeys("Lazuardi");
        driver.findElement(emailForm).sendKeys("irfan@gmail.com");
        driver.findElement(telephoneForm).sendKeys("06546512333");
        driver.findElement(faxForm).sendKeys("11555");
        driver.findElement(companyForm).sendKeys("PT Kusuka");
        driver.findElement(address1Form).sendKeys("Jl nangka no 12");
        driver.findElement(address2Form).sendKeys("Jl Duren no 13");
        driver.findElement(cityForm).sendKeys("Mataram");
        driver.findElement(postcodeForm).sendKeys("83351");
    }

    public void selectCountry(){
        Select dropdown = new Select(driver.findElement(countryForm));
        dropdown.selectByVisibleText("Indonesia");
    }
    public void selectZone(){
        Select dropdown = new Select(driver.findElement(regionForm));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()='Nusa Tenggara Barat']")));

        dropdown.selectByVisibleText("Nusa Tenggara Barat");
    }

    public void clickContinueBtn(){
        driver.findElement(continueBtnForm).click();
    }
}
