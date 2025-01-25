package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChatGpt {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shahab\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");

        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void searchIndiaOnChatGPT() {
        // Open ChatGPT
        driver.get("https://chat.openai.com/");

        // Wait for the page to load and locate the search box or input field
        try {
            // Simulate logging in or interacting if necessary (depends on ChatGPT UI)
            // Assuming there's a prompt field to type into
            WebElement inputBox = driver.findElement(By.tagName("textarea"));

            // Enter "India" in the input field
            inputBox.sendKeys("India");

            // Submit the input (depends on how ChatGPT handles inputs, e.g., pressing Enter)
            inputBox.submit();

            // Add a sleep to observe the interaction (not recommended for production tests)
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {

        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
