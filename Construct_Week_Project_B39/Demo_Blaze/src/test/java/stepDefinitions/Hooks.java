
package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    // Access the driver here
    public static WebDriver getDriver() {

        return driver;
    }

    @Before
    public void openBrowser() {
        String browserName = "chrome";
        if (browserName.contains("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.contains("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.contains("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/");
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(10000);
        if (driver != null) {
            driver.quit();
        }
    }

}
