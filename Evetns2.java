package Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import facebook.src.facebook_Signup.Count_List;
public class Evetns2 {
	@Test

	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("http://www.rediff.com/");
        WebElement sign = driver.findElement(By.xpath("//html/body/div[3]/div[3]/span[4]/span/a"));
        sign.click();

        java.util.Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        java.util.Iterator<String> itererator = windowId.iterator();   

        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();

        driver.switchTo().window(newAdwinID);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
      

        driver.switchTo().window(mainWinID);
        System.out.println(driver.getTitle());
       

        WebElement email_id= driver.findElement(By.xpath("//*[@id='c_uname']"));
        email_id.sendKeys("hi");
        driver.close();
        
        
      	}
}


