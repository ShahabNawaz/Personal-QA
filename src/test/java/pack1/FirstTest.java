package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest{
    @DataProvider(name="searchDataSet")
    public Object[][] searchData(){
        Object[][] searchkeyword =new Object[3][2];
        searchkeyword[0][0]="India";
        searchkeyword[0][1]="Qutub Minar";

        searchkeyword[1][0]="Agra";
        searchkeyword[1][1]="Taj Mahal";

        searchkeyword[2][0]="Hydrabad";
        searchkeyword[2][1]="Charminar";
        return searchkeyword;
    }
    @Test(dataProvider = "searchDataSet")
    public void logintest(String country , String monument){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahab\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement Search=driver.findElement(By.name("q"));
        Search.sendKeys(country + " " + monument);
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
    }
}
