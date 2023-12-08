package training.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		int day = 30;
	// 1st calendar
		
		/*
		driver.findElement(By.id("first_date_picker")).click();
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()=20]")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
*/
		// to select the current month we need to elimintae previous and nxt months dates
		// 2nd calendar
		
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();



	}

}
