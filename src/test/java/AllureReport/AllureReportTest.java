package AllureReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AllureReportTest {

    @Test
    public void AccessGooglePageTest() {

        // Create new instance of ChromeDriver
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // And now use this to visit Google
        chromeDriver.get("http://www.google.com");

        Assert.assertEquals(chromeDriver.getTitle(), "Google", "Title is matched.");

        // Find the text input element by its name
        WebElement element = chromeDriver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        chromeDriver.quit();
    }

    @Test
    public void AccessInvalidPageTest() {

        // Create new instance of ChromeDriver
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // And now use this to visit Google
        chromeDriver.get("http://www.google.com");

        Assert.assertNotEquals(chromeDriver.getTitle(), "Facebook", "Title is  Not matched.");


        chromeDriver.quit();
    }
}
