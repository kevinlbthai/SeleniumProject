import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class HelloKevinTest {

    @Test
    @DisplayName("Test HelloKevin")
    public void helloKevin() {
        System.out.println("Hello Kevin, welcome to Selenium Project Self Learning.");

        /*
           Manual setup: System.getProperty("webdriver.chrome.driver", "D:\\External WebDriver\\chromedriver_win32_Latest");
         */


        // Create new instance of ChromeDriver
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // And now use this to visit Google
        chromeDriver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = chromeDriver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        chromeDriver.quit();
    }
}
