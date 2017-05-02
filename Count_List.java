
package Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Count_List {
	@Test		
	
 public void count_a()
 {
	 
 
	String url=System.setProperty("webdriver.gecko.driver","D:\\selenium-2.53.0 on 172.16.1.1\\geckodriver-v0.9.0-win64\\geckodriver.exe");
			
	System.out.println(url);
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	java.util.List<WebElement>links=driver.findElements(By.tagName("a"));

	System.out.println(links.size());

	for(int i=0; i<links.size();i++)
	{
		
		System.out.println(links.get(i).getText());
	}
 }

	
		
	}
