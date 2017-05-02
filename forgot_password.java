package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class forgot_password {
	@Test		
	
	
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110']")).click();
			
				
	}

		
		
	}

	


