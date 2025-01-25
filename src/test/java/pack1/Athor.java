package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import java.util.ArrayList;

public class Athor {

    // Declare WebDriver
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahab\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // Update this path

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open the first tab and navigate to the website
        driver.get("https://www.saucedemo.com/");
    }

    @Test()
    public void testTitle() {
        // Assert the page title is correct
        String expectedTitle = "Swag Labs";  // Expected title of the page
        String actualTitle = driver.getTitle();

        // Validate the title using TestNG Assert
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

        // Open a new tab
        ((ChromeDriver) driver).executeScript("window.open('about:blank','_blank');");

        // Switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Navigate to the same website in the new tab
        driver.get("https://www.saucedemo.com/");
    }

    @Test()
    public void loginTest() {

        // Find the username field and enter the username
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        // Find the password field and enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Find and click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Verify that login was successful by checking the page title after login
        String expectedTitleAfterLogin = "Swag Labs";  // Expected title of the page after login
        String actualTitleAfterLogin = driver.getTitle();

        // Validate the title using TestNG Assert
        Assert.assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin, "Login failed or title does not match after login!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser

        System.out.println("All test cases executed successfully!");
    }
}
