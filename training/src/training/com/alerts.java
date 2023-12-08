package training.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {

		   // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        // Instantiate ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Salesforce login page
        driver.get("https://login.salesforce.com/");
        
       // File

        // Enter username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));
        usernameInput.sendKeys("durgamdp@gmail.com");

        // Enter password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("Pandu@3462");

        // Click on the login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
        loginButton.click();
       // driver.switchTo().alert().accept();
        Alert a = driver.switchTo().alert();
        a.accept();
       // System.out.println("text on the alert is : " + a.getText());
		
	}

}
