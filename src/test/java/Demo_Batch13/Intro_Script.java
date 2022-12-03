package Demo_Batch13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intro_Script {

	public static void main(String[] args) throws Exception {
		//Browser Opening
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		String FB_Title=driver.getTitle();
		System.out.println(FB_Title);
		String FB_URL=driver.getCurrentUrl();
		System.out.println(FB_URL);
		driver.navigate().to("https://www.naukri.com/");
		String Naukri_Title=driver.getTitle();
		System.out.println(Naukri_Title);
		String Naukri_Url=driver.getCurrentUrl();
		System.out.println(Naukri_Url);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		

	}

}
