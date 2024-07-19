import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenuButton.click();

        Thread.sleep(2000);

        List<WebElement> dropDownList = driver.findElements(By.xpath(
                "//div/div/div/a"));

        // Loop through the WebElement list to select specific value (ie. Datepicker)
        String findOptionName = "Datepicker";
        for (WebElement item : dropDownList) {

            if (findOptionName.equals(item.getText())) {
                item.click();
            }
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
