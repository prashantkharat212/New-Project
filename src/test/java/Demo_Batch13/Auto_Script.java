package Demo_Batch13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Script {

	public static void main(String[] args) throws Exception {
		// Browser opening
		// cross browser testing
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		
		//edge Browser
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
	}

}
