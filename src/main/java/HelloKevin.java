import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelloKevin {
    public static void main(String[] args) {
        System.out.println("Hello Kevin, welcome to Selenium Project Self Learning.");

        /*
           Manual setup: System.getProperty("webdriver.chrome.driver", "D:\\External WebDriver\\chromedriver_win32_Latest");
         */
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        chromeDriver.get("http://www.google.com");
        chromeDriver.quit();
    }
}
