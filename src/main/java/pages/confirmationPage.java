package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class confirmationPage {
    WebDriver driver;
    By assertConfirmItem = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[1]/td[2]");
    By assertConfirmItem2 = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[2]/td[2]");
    By assertConfirmItem3 = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[3]/td[2]");
    By confirmOrderBtn = By.id("checkout_btn");
    By orderSuccess = By.xpath("/html/body/div/div[2]/div/div/div/div/section/p[2]");
    By continueBtnConfirm = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/section/a");

    public confirmationPage(WebDriver driver){this.driver = driver;}

    public void assertConfirmItem(String item){
        WebElement element = driver.findElement(assertConfirmItem);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(item, element.getText());
        System.out.println("Confirm Item Name: " + element.getText());
    }
    public void assertConfirmItem2(String item){
        WebElement element = driver.findElement(assertConfirmItem2);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(item, element.getText());
        System.out.println("Confirm Item Name: " + element.getText());
    }

    public void assertConfirmItem3(String item){
        WebElement element = driver.findElement(assertConfirmItem3);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(item, element.getText());
        System.out.println("Confirm Item Name: " + element.getText());
    }

    public void clickConfirmOrderBtn(){
        driver.findElement(confirmOrderBtn).click();
    }

    public void assertConfirmationText(){
        WebElement element = driver.findElement(orderSuccess);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals("Your Order Has Been Processed!",element.getText());
        System.out.println(element.getText());
    }

    public void clickContinueBtnConfirm(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(continueBtnConfirm).click();
    }
}
