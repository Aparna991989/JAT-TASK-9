package selenium;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
class SeleniumTitleCheck {

	    public static void main(String[] args) throws InterruptedException {
	        

	        // Initialize the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to the specified URL
	            driver.get("https://www.demoblaze.com");

	            // Maximize the browser window
	            driver.manage().window().maximize();
	            
	            Thread.sleep(3000);

	            // Get the title of the page
	            String pageTitle = driver.getTitle();

	            // Verify if the title matches "STORE"
	            if (pageTitle.equalsIgnoreCase("STORE")) {
	            	
	                System.out.println("Page landed on correct website.");
	            } 
	            
	            else {
	            	
	            	
	                System.out.println("Page landed on wrong website.");
	            }

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}

	

	


