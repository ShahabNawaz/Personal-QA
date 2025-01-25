package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstscript{
    public static void main(String []args){ 
       System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Shahab\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shahabnawaz150@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
//        driver.findElement(By.xpath("")).sendKeys("mydreamgoogle");
//        String demo=driver.getTitle();
//        System.out.println(demo);
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        driver.findElement(By.id("react-burger-menu-btn")).click();
////      driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
//        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\\\"logout_sidebar_link\\\"]"));
//        Select select= new Select(dropdown);
//        select.selectByVisibleText("Logout");
        driver.quit();
    }
}