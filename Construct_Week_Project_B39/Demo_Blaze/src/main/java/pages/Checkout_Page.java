package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkout_Page {

	WebDriver driver= new ChromeDriver();

    public WebElement PurchaseB (){
        return driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button"));
    }

    public WebElement userNameH (String name){
        return driver.findElement(By.xpath("//input[@id=\"name\"]"));
    }
    public WebElement userCountryH (String country){
        return driver.findElement(By.xpath("//input[@id=\"country\"]"));
    }
    public WebElement userCityH (String city){
        return driver.findElement(By.xpath("//input[@id=\"city\"]"));
    }
    public WebElement userCreditCardH (String creditCard){
        return driver.findElement(By.xpath("//input[@id=\"card\"]"));
    }
    public WebElement userMonthH (String month){
        return driver.findElement(By.xpath("//input[@id=\"month\"]"));
    }
    public WebElement userYearH (String year){
        return driver.findElement(By.xpath("//input[@id=\"year\"]"));
    }
    public WebElement PurchaseButton(){
        return driver.findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
    }

}