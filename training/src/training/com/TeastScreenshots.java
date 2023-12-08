package training.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TeastScreenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        // Instantiate ChromeDriver
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com/");
  /*      // FILE
        File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screnshot/img1.jpg"); 
	// 
        FileUtils.copyFile(sourceFile, destFile);  
        
        System.out.println("screenshot saved succesfully");
   */    
        /*//Bytes or  BYTE Array  
        byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
        File destFile = new File("./screnshot/img2.jpg"); 
        FileOutputStream fos = new FileOutputStream(destFile);
       // in the file output stream we have a method, it accepts byte array
        fos.write(byteArr);
        fos.close();
        System.out.println("screenshot saved succesfully"); 
        */
        
        //Base64 it is encoded format of string
        
        String base64code = driver.getScreenshotAs(OutputType.BASE64);
      // hee we need to convert base64 to a bytearray through a class file  
        byte[] byteArr =   Base64.getDecoder().decode(base64code); 
        File destFile = new File("./screnshot/img6.jpg"); 
        FileOutputStream fos = new FileOutputStream(destFile);
       // in the file output stream we have a method, it accepts byte array
        fos.write(byteArr);
        fos.close();
        System.out.println("screenshot saved succesfully"); 
        
       // driver.quit();
	}
}
