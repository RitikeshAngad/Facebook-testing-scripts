package Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class image {
	@Test
	
	public void imag()
	{
				
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://punjab.chitkara.edu.in//Interface/index.php");
		java.util.List<WebElement>links=driver.findElements(By.tagName("img"));

		System.out.println(links.size());

		for(int i=0; i<links.size();i++)
		{
			
			System.out.println(links.get(i).getAttribute("src"));
		}
	 }
	



}

