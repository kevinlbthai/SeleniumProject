import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.io.IOException;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("Any_FIle.png");

        WebElement chooseButton = driver.findElement(By.cssSelector(".btn-secondary"));

        chooseButton.click();
        Thread.sleep(1000);
        // below line execute AutoIt scsript
        try {
            Runtime.getRuntime().exec("D:\\IntelliJ_Java_Project\\SeleniumProject\\src\\main\\File_Upload.exe");
            System.out.println("Execute AutoIt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Thread.sleep(1000);

        driver.quit();
    }
}
