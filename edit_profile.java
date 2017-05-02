package Homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class edit_profile
{
	@Test		
	public void News(){
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("dasharivallabh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("s76637663S");
		driver.findElement(By.id("u_0_p")).click();
		driver.findElement(By.xpath("//*[@id='pagelet_welcome_box']/ul/li/div/a")).click();
	}
	
}


