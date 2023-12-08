 package training.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWindowHandles {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	Object WebDriverManager;
	//Add chrome switch to disable notification - "**--disable-notifications**"
	 //  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");
    
        
    /*    
      // single window
        // we need to store the instance (here every window has unique address)   
       String  parentWindowHandle = driver.getWindowHandle();
       System.out.println("Parent window handle -"+parentWindowHandle + driver.getTitle());
       
        driver.findElement(By.id("newWindowBtn")).click();
        // here we use set of string to store the values 
        Set<String> windowHandles = driver.getWindowHandles();
        // use for ecah loop and print the windowHandles which are unique
        
        for (String windowHandle : windowHandles) {
        	
        	if(!windowHandle.equals(parentWindowHandle)) {
        		
        	driver.switchTo().window(windowHandle);
        	
            driver.manage().window().maximize();

        	driver.findElement(By.id("firstName")).sendKeys("prasad");
        	Thread.sleep(3000);
        	driver.close();
        	// here i need to switch to window so we used windowhandle and we get current focused window title
        	
        	//driver.switchTo().window(windowHandle);
        	
        	}
        	
          //  System.out.println(windowHandle + driver.getTitle());
 
        	
        }
        
    	driver.switchTo().window(parentWindowHandle);
    	driver.findElement(By.id("name")).sendKeys("HYR Tutorials");
    	    	
    	*/
    	
        // single tab
    	
       String  parentWindowHandle = driver.getWindowHandle();
       System.out.println("Parent window handle -"+parentWindowHandle + driver.getTitle());
       
        driver.findElement(By.id("newTabBtn")).click();
        // here we use set of string to store the values 
        Set<String> windowHandles = driver.getWindowHandles();
        // use for ecah loop and print the windowHandles which are unique
        
        for (String windowHandle : windowHandles) {
        	
        	if(!windowHandle.equals(parentWindowHandle)) {
        		
        	driver.switchTo().window(windowHandle);
        	
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("alertBox")).click();
        System.out.println(driver.switchTo().alert().getText());
    	driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());

        	Thread.sleep(3000);
        	driver.close();
        	// here i need to switch to window so we used windowhandle and we get current focused window title
        	
        	//driver.switchTo().window(windowHandle);
        	
        	}
        	
          //  System.out.println(windowHandle + driver.getTitle());
 
        	
        }
        
    	driver.switchTo().window(parentWindowHandle);
    	driver.findElement(By.id("name")).sendKeys("HYR Tutorials");
    	Thread.sleep(3000);
 
	}

}
