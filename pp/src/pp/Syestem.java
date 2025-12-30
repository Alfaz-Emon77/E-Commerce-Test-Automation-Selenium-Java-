package pp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Syestem {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Arfan\\Desktop\\sqa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open OrangeHRM website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        // Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click Login button
        driver.findElement(By.className("oxd-button")).click();
        Thread.sleep(3000);

        // Click on "My Info" tab (2nd element with class "oxd-main-menu-item")
        driver.findElements(By.className("oxd-main-menu-item")).get(1).click();
        Thread.sleep(2000);

        // Open Profile Menu
        driver.findElement(By.className("oxd-userdropdown-tab")).click();
        Thread.sleep(2000);

        // Click Logout (first element with class "oxd-userdropdown-link")
        driver.findElements(By.className("oxd-userdropdown-link")).get(0).click();
        Thread.sleep(2000);

        // Close browser
        driver.quit();
    }
}