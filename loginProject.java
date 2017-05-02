package Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginProject {
	@Test		
                                     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedUrl = 	"https://www.facebook.com/"	;
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);

		if(actualUrl.equals(expectedUrl)){
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		String actualTitle = driver.getTitle();
				String exepctedTitle = "Facebook - Log In or Sign Up";
		//if (actualTitle.equals(expectedTitle)){
		//	System.out.println("Url title");
		//}
		///else {
	//	System.out.println("Invalid Title");
		//}
		
				// Create account
				
	driver.findElement(By.id("u_0_1")).sendKeys("admin");
	driver.findElement(By.id("u_0_3")).sendKeys("test");
	driver.findElement(By.id("u_0_6")).sendKeys("admin@gmail.com");
	driver.findElement(By.id("u_0_9")).sendKeys("admin@gmail.com");

	driver.findElement(By.id("u_0_b")).sendKeys("admin@gmail.com");
	driver.findElement(By.id("u_0_9")).sendKeys("admin123");	
	driver.findElement(By.id("day")).sendKeys("8");
	driver.findElement(By.id("month")).sendKeys("2");
	driver.findElement(By.id("year")).sendKeys("2014");
	
	
	//driver.findElement(By.name("pass")).sendKeys("pass");
	
	int count = driver.findElements(By.name("sex")).size();
	
	System.out.println(count);
	
	driver.findElements(By.name("sex")).get(1).click();
	
	//.tagName
	driver.findElements(By.tagName("a")).size();
	
	//.xPath
	 driver.findElement(By.xpath("//input[@id='u_0_1']"));
	
	
	}
	}

	
	