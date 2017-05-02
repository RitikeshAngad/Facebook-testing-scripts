package Homepage;


	import org.junit.Test;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class Data_area {
		
	
		@ Test
		
		public void News() throws Exception
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		    driver.findElement(By.name("email")).sendKeys("dasharivallabh@gmail.com");  //Name
			driver.findElement(By.id("pass")).sendKeys("s76637663S"); //Id
			driver.findElement(By.id("u_0_q")).click();
			Thread.sleep(3000);
			//Thread.sleep(2000);
		}
		
		
		
		
		
			
		}
	
		