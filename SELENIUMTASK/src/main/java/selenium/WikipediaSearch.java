package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WikipediaSearch {

    public static void main(String[] args) {
        

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Wikipedia
            driver.get("https://www.wikipedia.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Locate the search input field and enter "ARTIFICIAL INTELLIGENCE"
            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("ARTIFICIAL INTELLIGENCE");

            // Submit the search form
            searchInput.submit();

            // Wait for the page to load and display the results
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleContains("Artificial intelligence"));
            


            // Find the "History" section heading in the article and click it
            WebElement historySectionLink = driver.findElement(By.id("History"));
            historySectionLink.click();
            
            Thread.sleep(5000);


            // Print the title of the "History" section
            String sectionTitle = historySectionLink.getText();
            System.out.println("Section Title: " + sectionTitle);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
