

	package Homepage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
import org.testng.annotations.Test;

	public class Create_page{
		@Test		
		public void News() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("dasharivallabh@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("s76637663S");
			driver.findElement(By.id("u_0_q")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[1]/a/span/span")).click();
		}
		
		
		}
