import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name_field = driver.findElement(By.id("name"));
        name_field.click();
        name_field.sendKeys("Kevin Lim Boon Thai");

        WebElement clickButton = driver.findElement(By.id("button"));
        clickButton.click();


        driver.quit();
    }
}
