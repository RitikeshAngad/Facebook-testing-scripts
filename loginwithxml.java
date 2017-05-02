package Homepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginwithxml {
	@Test
	public void aaa() throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			 driver.findElement(By.id("email")).sendKeys("demofacebook123@gmail.com");
		      driver.findElement(By.id("pass")).sendKeys("123123123demo");
	       driver.findElement(By.id("u_0_q")).click();
	       Thread.sleep(1000);
	           
	       driver.findElement(By.xpath(".//*[@id='rc.u_0_r']/div[1]/span[1]/a/span[1]")).click();
		     
	       driver.findElement(By.xpath(".//*[@id='composer_text_input_box']")).sendKeys("Ritikesh FInd");
		     
		      driver.findElement(By.xpath(".//*[@id='js_rd']/div[2]/div[3]/div/div[2]/div/button")).click();
		      driver.findElement(By.xpath(".//*[@id='js_1m']/div[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("dfgsgdsgdgg");
		    		  
		      Thread.sleep(5000);
		      

	}
		
		
	}





