package training.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newwindowortab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.google.com/");
		// we manually write london time (+keys is for concatinating and ENTER to click on it)
        driver.findElement(By.name("q")).sendKeys("london time"+Keys.ENTER);
        
WebElement firstlink=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div[2]/div/div/div/div[2]/ul/li/div/div/div/div[1]/div/a/h3"));
	
Actions action = new Actions(driver);

//action.keyDown(Keys.CONTROL).mov
//action.keyDown(Keys.CONTROL).moveToElement(firstlink).Per
	}

}
