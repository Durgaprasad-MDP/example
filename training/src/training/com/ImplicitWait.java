package training.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 // ImplicitWaitTime in Selenium WebDriver?
 
public class ImplicitWait {

public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("HYR");
		
	}
}

