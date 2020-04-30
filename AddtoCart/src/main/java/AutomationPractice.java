import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AutomationPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\easha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        String baseURL ="http://automationpractice.com/index.php";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[1]")).click();
       // Thread.sleep(3000);
        driver.findElement(By.id("search_query_top")).sendKeys("shirt");
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
        Thread.sleep(3000);
        String results = driver.getTitle();
        String actual = driver.getTitle();
        Assert.assertEquals(results,actual);

        driver.close();

    }

}
