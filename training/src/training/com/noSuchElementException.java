package training.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class noSuchElementException {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
    	/*
        driver.get("https://omayo.blogspot.com/");
       
// 1) 
 //driver.findElement(By.id("ta1123")).sendKeys("durga");
	   // Error be like this : Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#ta1123"}


//2)
        driver.findElement(By.className("dropbtn")).click();
        //driver.findElement(By.linkText("Flipkart")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement flipkartaction = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
        flipkartaction.click();
        */
// 3 
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).clear();

	}

}
