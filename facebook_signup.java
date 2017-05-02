package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class facebook_signup {
	@Test		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_1")).sendKeys("admin");
		driver.findElement(By.id("u_0_3")).sendKeys("test");
		driver.findElement(By.id("u_0_6")).sendKeys("ritikeshangad123@gmail.com");
		driver.findElement(By.id("u_0_9")).sendKeys("ritikeshangad123@gmail.com");

		driver.findElement(By.id("u_0_b")).sendKeys("ritikeshangad123@gmail.com");
		driver.findElement(By.id("u_0_9")).sendKeys("admin12345");	
		driver.findElement(By.id("day")).sendKeys("25");
		driver.findElement(By.id("month")).sendKeys("Feb");
		driver.findElement(By.id("year")).sendKeys("1993");
		driver.findElement(By.id("u_0_j")).click();
		driver.findElement(By.id("u_0_f")).click();
		
		
	}

}
