

package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumExample {

    public static void main(String[] args) {
       

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to http://google.com
            driver.get("http://google.com");
            
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
;
            // Print the URL of the current page
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // Reload the page
            driver.navigate().refresh();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
