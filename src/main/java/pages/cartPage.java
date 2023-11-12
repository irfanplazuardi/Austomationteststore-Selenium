package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class cartPage {
    WebDriver driver;
    By assertItem = By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[2]/td[2]");
    By assertItem2 = By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[3]/td[2]");
    By assertItem3 = By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[4]/td[2]");
    By cartCheckout = By.id("cart_checkout1");

    public cartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertItemName(String item){
        WebElement element = driver.findElement(assertItem);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(item, element.getText());
        System.out.println("Item Name: " + element.getText());
    }

    public void assertItemName2(String item){
        WebElement element = driver.findElement(assertItem2);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(item, element.getText());
        System.out.println("Item Name: " + element.getText());
    }

    public void assertItemName3(String item){
        WebElement element = driver.findElement(assertItem3);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(item, element.getText());
        System.out.println("Item Name: " + element.getText());
    }

    public void clickCartCheckout() {driver.findElement(cartCheckout).click();}
}
