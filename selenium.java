package Homepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class selenium {
	@Test
	public void aaa() throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		File obj=new File("D:\\SEleniumDemo\\Data Driven\\testdata.xlsx");
		FileInputStream f1=new FileInputStream(obj);
		XSSFWorkbook w1=new XSSFWorkbook(f1);						//for .xlsx files
		XSSFSheet sheet1=w1.getSheetAt(0);							//select the sheet
		int a= sheet1.getLastRowNum();								//last row count
		System.out.println("last row no ="+a);
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				
				String data=sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print("data="+data);
		
			driver.get("https://www.facebook.com/");
	       driver.findElement(By.name("email")).sendKeys(sheet1.getRow(i).getCell(j).getStringCellValue());
	       driver.findElement(By.name("pass")).sendKeys(sheet1.getRow(i).getCell(++j).getStringCellValue());
	       Thread.sleep(1000);
	       driver.findElement(By.id("loginbutton")).click();
	     
			}
			System.out.println("\n");
		}
		
	}



}