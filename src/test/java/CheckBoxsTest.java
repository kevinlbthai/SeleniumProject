import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxsTest {

    @Test
    @DisplayName("Test Checkboxs")
    public void CheckBoxs() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        List<WebElement> checkboxList = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // loop through WebElement of checkboxes and select each of them
        int size = checkboxList.size();
        for(int i=0; i<size; i++) {
            checkboxList.get(i).click();
            System.out.println("Checkbox " + (i+1));
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
