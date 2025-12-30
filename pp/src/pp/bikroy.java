package pp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bikroy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Arfan\\Desktop\\sqa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Bikroy
        driver.get("https://bikroy.com/");
        Thread.sleep(3000);

        // Search "mobile"
        driver.findElement(By.name("query")).sendKeys("mobile");

        // Click Search button (using XPath)
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    

        // Click Filter icon
        driver.findElement(By.className("top-ad--22_qK")).click();
       

        // Select Brand / Option (example)
        driver.findElement(By.xpath("//*[@id=\"app-wrapper\"]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[2]/button")).click();
 
        // Click Apply / Show Results
        driver.findElement(By.xpath("//*[@id=\"app-wrapper\"]/div[1]/div[2]/div[2]/div[1]/div[3]/div/div/div[2]/button/div")).click();
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}
