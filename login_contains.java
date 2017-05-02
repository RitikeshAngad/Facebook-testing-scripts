package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_contains {

	
	
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("dasharivallabh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("s76637663S");
		 driver.findElement(By.xpath("//a[@href='/login/']")).click();
			driver.findElement(By.id("loginbutton")).click();
		 
				
					
		
	}
public static void main(String[] args) {
		
		
		
		login_contains ab= new login_contains();
		ab.login();
		
		
		
	}
		
		
	}

	
	

