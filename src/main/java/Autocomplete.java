import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys(
                "Unit A-29-05, Residensi Kiara Jalil 2, No. 3 Jalan Jalil Perwira");

        Thread.sleep(1000);

        WebElement dismissButton = driver.findElement(By.className("dismissButton"));
        dismissButton.click();

        driver.quit();
    }
}
