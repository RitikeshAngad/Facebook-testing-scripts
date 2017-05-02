package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class search_fb {
	@Test		

	public void search_button()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/login/identify?ctx=recover&lwv=100");
	
		driver.findElement(By.id("identify_email")).sendKeys("dasharivallabh@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("s76637663S");
		
		driver.findElement(By.id("u_0_0")).click();
		
		
		
	}
	
	
}	
		
