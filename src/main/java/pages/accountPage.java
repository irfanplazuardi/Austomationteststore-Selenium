package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class accountPage {
    WebDriver driver;
    public static Properties prop;
    String name;
    String pass;
    By confirmAccountGuest = By.id("accountFrm_accountguest");
    By continueBtn = By.xpath("//*[@id=\"accountFrm\"]/fieldset/button");
    By loginName = By.id("loginFrm_loginname");
    By password = By.id("loginFrm_password");
    By loginBtn = By.xpath("//*[@id=\"loginFrm\"]/fieldset/button");

    public accountPage(WebDriver driver){
        this.driver = driver;
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/config/config.properties");
            prop.load(ip);

            // get the property value
            this.name = prop.getProperty("name");
            this.pass = prop.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectConfirmAccountGuest(){driver.findElement(confirmAccountGuest).click();}
    public void clickContinueBtn(){driver.findElement(continueBtn).click();}
    public void inputLoginName(){driver.findElement(loginName).sendKeys(name);}
    public void inputPassword(){driver.findElement(password).sendKeys(pass);}
    public void clickLoginBtn(){driver.findElement(loginBtn).click();}
}
