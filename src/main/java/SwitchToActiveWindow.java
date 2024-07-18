import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originWindowHandle = driver.getWindowHandle();

        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Finally switch to the original window handle
        driver.switchTo().window(originWindowHandle);

        driver.quit();
    }
}
