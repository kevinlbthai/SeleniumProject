import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("07/20/2024");
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(1000);

        dateField.clear();
        dateField.click();

        // click datepicker-months to datepicker-switch to view month
        driver.findElement(By.cssSelector(
                ".datepicker-days .datepicker-switch")).click();

        // click datepicker-years to datepicker-switch to view year
        driver.findElement(By.cssSelector(
                ".datepicker-months .datepicker-switch")).click();

        // select specific year (ie. 2023)
        driver.findElement(By.cssSelector(
                ".datepicker-years td .year:nth-child(5)")).click();

        // select specific month (ie. August)
        driver.findElement(By.cssSelector(
                ".datepicker-months td .month:nth-child(8)")).click();

        // select specific day (ie. 20th)
        driver.findElement(By.cssSelector(
                ".datepicker-days tbody > tr:nth-child(4) > .day:nth-child(1)")).click();

        Thread.sleep(1000);

        driver.quit();
    }
}