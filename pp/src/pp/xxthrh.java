package pp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class xxthrh {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Arfan\\Desktop\\sqa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ------------------ OPEN WEBSITE ------------------
        driver.get("https://bikroy.com/");
        Thread.sleep(3000);

        // ------------------ SEARCH PRODUCT ------------------
        driver.findElement(By.name("query")).sendKeys("mobile");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        // ------------------ APPLY FILTER ------------------
        // Click Filter icon
        driver.findElement(By.className("top-ad--22_qK")).click();
        Thread.sleep(2000);

        // Select Brand / Option (example)
        driver.findElement(By.xpath("//*[@id=\"app-wrapper\"]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[2]/button")).click();
        Thread.sleep(1000);

        // Apply Filter / Show Results
        driver.findElement(By.xpath("//*[@id=\"app-wrapper\"]/div[1]/div[2]/div[2]/div[1]/div[3]/div/div/div[2]/button/div")).click();
        Thread.sleep(3000);

        // ------------------ SELECT FIRST PRODUCT ------------------
        List<WebElement> products = driver.findElements(By.cssSelector("a[class*='poster--')]"));
        if (products.size() > 0) {
            products.get(0).click();
        }
        Thread.sleep(3000);

        // ------------------ VIEW PRODUCT DETAILS ------------------
        // Scroll to description or details if needed
        WebElement details = driver.findElement(By.className("details__content"));
        System.out.println("Product Details: " + details.getText());
        Thread.sleep(2000);

        // ------------------ SAVE TO WISHLIST / SIMULATED ------------------
        // (Bikroy may require login for wishlist, so just simulate click)
        // driver.findElement(By.className("wishlist-button")).click();

        // ------------------ CONTACT SELLER ------------------
        // Click "Message Seller" button
        WebElement msgButton = driver.findElement(By.xpath("//button[contains(text(),'Message Seller')]"));
        msgButton.click();
        Thread.sleep(2000);

        // ------------------ GO BACK TO SEARCH RESULTS ------------------
        driver.navigate().back();
        Thread.sleep(2000);

        // ------------------ SORT PRODUCTS ------------------
        driver.findElement(By.className("sort-by-selector")).click(); // Open sort menu
        driver.findElement(By.xpath("//li[contains(text(),'Price: Low to High')]")).click();
        Thread.sleep(3000);

        // ------------------ CLOSE BROWSER ------------------
        driver.quit();
    }
}
