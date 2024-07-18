import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExecuteJavascript {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement jsCloseButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", jsCloseButton);

        driver.quit();
    }
}
