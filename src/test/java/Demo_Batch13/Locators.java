package Demo_Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws Exception {
		// 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//locator
	//	WebElement email_tb=driver.findElement(By.name("email"));
	//	email_tb.sendKeys("pk@123");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		
		
		
		

	}

}
