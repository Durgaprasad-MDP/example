package training.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
       // NoSuchWindowException : his Exception occurs if the window target to be switch does not exist.
       // driver.switchTo().window("google");

        //NoAlertException : This Exception occurs when you switch to no presented alert
         //driver.switchTo().alert();
        
        // NoSuchElementException : This Exception occurs if an element could not be found.
        //driver.findElement(By.id("demo")).click();
        
        //NoSuchFrameException : This Exception occurs if the frame target to be switched to does not exist.
           driver.switchTo().frame("abcd");
	}

}
