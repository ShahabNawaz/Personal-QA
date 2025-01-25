package pack1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class TakeScreenshot {


    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "\\wsl.localhost\\Ubuntu\\usr\\local\\bin\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to a website
            driver.get("https://vdigtech.com/");

            // Take a screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save the screenshot to a file
            FileUtils.copyFile(screenshot, new File("./screenshot.png"));

            System.out.println("Screenshot saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
