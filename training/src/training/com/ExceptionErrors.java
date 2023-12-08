package training.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // StaleElementReferenceException: This Selenium exception occurs happens when the web element is detached from the current DOM.
		
        driver.get("https://omayo.blogspot.com/");
        
        WebElement textareafield = driver.findElement(By.id("ta1"));
    
        textareafield.sendKeys("durga prasad");
       
    	driver.navigate().back();
     
       // textareafield = driver.findElement(By.id("ta1"));
    	//textareafield = driver.findElement(By.id("tal"));
    	
    	textareafield = driver.findElement(By.id("ta1"));

        textareafield.clear();
        
        
    		}

}
