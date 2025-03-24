package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmountCalculation_Page {
	WebDriver driver= new ChromeDriver();

    public void goToCartPage() {
        WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
        cartButton.click();
    }

    // Get the total price element
    public WebElement getTotalPriceElement() {
        return driver.findElement(By.xpath("//h3[contains(number(),'1580')]"));
    }

    public void validateTotalAmount(String expectedTotalPrice) {
        WebElement totalPriceElement = getTotalPriceElement();

        String actualTotalPrice = totalPriceElement.getText();

        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price mismatch: The calculated total does not match the expected value.");
    }
}




