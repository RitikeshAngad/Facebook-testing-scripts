package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class forget_contains {
	@Test		

	
	
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify?ctx=recover&lwv=110");
		//driver.findElement(By.id("email")).sendKeys("dasharivallabh@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("s76637663S");
		 driver.findElement(By.xpath("//a[@href='/help/277898572230446']")).click();
			driver.findElement(By.id("loginbutton")).click();
		 
				
					
		
	}

		
		
	}