package Homepage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class textbox {
	@Test		

	public void text()
	{
		
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		System.out.println(url);
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='text']"));
       for(int i=0;i<boxes.size();i++)
       {
         System.out.println("No of text boxes are:"+boxes.size()); 
       }
		
	}
	
	
	public void radio()
	{
		
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		System.out.println(url);
		
		System.setProperty("webdriver.gecko.driver", url);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> abc = driver.findElements(By.xpath("//input[@type='radio']"));
		  
		 
		  
		  System.out.println("No of Rdaio buttons are:"+abc.size());
		
	}
	
	

}
