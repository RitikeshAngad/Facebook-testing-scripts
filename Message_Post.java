package Homepage;


	import java.io.File;
	import java.io.FileInputStream;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

	public class Message_Post {
		@Test
				public void aaa() throws Exception {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","D:\\Eclips\\chromedriver.exe");
			WebDriver drive = new ChromeDriver();
			drive.manage().window().maximize();		
			
			File obj=new File("D:\\SEleniumDemo\\Data Driven\\testdata.xls");
			FileInputStream f1=new FileInputStream(obj);
			HSSFWorkbook w1=new HSSFWorkbook(f1);						//for .xlsx files
			HSSFSheet sheet1=w1.getSheetAt(0);							//select the sheet
			int a= sheet1.getLastRowNum();								//last row count
			System.out.println("last row no ="+a);
			
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=1;j++)
				{
					
					String data=sheet1.getRow(i).getCell(j).getStringCellValue();
					System.out.print("data="+data);
			
				drive.get("https://www.facebook.com/");
		      drive.findElement(By.id("email")).sendKeys(sheet1.getRow(i).getCell(j).getStringCellValue());
		      drive.findElement(By.id("pass")).sendKeys(sheet1.getRow(i).getCell(++j).getStringCellValue());
		      drive.findElement(By.id("u_0_q")).click();
		      Thread.sleep(5000);
		      
		      drive.findElement(By.linkText("Harpreet")).click();
		     
		      drive.findElement(By.linkText("Status")).click();
		     
		      //drive.switchTo().alert().sendKeys("gfhj");
		      drive.findElement(By.xpath(".//*[@id='js_1m']/div[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("dfgsgdsgdgg");
		    		  
		      Thread.sleep(5000);
		      

				}
				//system.out.println("\n");
			}
			
		}
	}