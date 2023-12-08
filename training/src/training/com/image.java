package training.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://demo.automationtesting.in/");
        
        //  clicking on image
        driver.findElement(By.id("enterimg")).click();
 Thread.sleep(4000);
 
 driver.findElement(By.xpath("//img[@alt='image not displaying']")).click(); 

	}

}
