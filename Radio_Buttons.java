package Homepage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Radio_Buttons {
	@Test		
    
    public void buttons()
    {
        
    	System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
        
        List<WebElement> abc = driver.findElements(By.xpath("//input[@type='radio']"));
                
        System.out.println("No of Radio buttons are:"+abc.size());
           
          
        driver.findElement(By.id("u_0_j")).click();
        
    }               

    
}