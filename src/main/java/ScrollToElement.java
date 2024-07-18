import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollToElement {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement nameField = driver.findElement(By.id("name")),
                   dateField = driver.findElement(By.id("date"));

        Actions scrollAction = new Actions(driver);
        scrollAction.moveToElement(nameField);

        nameField.sendKeys("Kevin Lim");
        dateField.sendKeys("18/07/2024");

        driver.quit();
    }
}
