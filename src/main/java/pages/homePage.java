package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage {
 WebDriver driver;

 By item = By.cssSelector("a.prdocutname[title='Skinsheen Bronzer Stick']");
 By addToCartItem1= By.xpath("(//a[@title='Add to Cart'])[1]");
 By addToCartItem2 = By.xpath("(//a[@title='Add to Cart'])[4]");
 By addToCartItem3 = By.xpath("(//a[@title='Add to Cart'])[5]");
 By addToCartBtn = By.className("cart");
 By cartBtn = By.xpath("/html/body/div/header/div[2]/div/div[3]/ul/li/a");

 public homePage(WebDriver driver){
  this.driver = driver;
 }

 public void setItem(){ driver.findElement(item).click();}
 public void clickAddToCartItem1(){ driver.findElement(addToCartItem1).click();}
 public void clickAddToCartItem2(){ driver.findElement(addToCartItem2).click();}
 public void clickAddToCartItem3(){ driver.findElement(addToCartItem3).click();}
 public void clickAddToCartBtn(){ driver.findElement(addToCartBtn).click();}
 public void clickCartBtn(){driver.findElement(cartBtn).click();}

}
