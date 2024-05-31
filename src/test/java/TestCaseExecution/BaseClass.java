package TestCaseExecution;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

public class BaseClass {
	public static WebDriver driver;	

		@Parameters({"browser","url"})
		@BeforeSuite
		
		public void setUp(String browser, String url) {
			if(browser.equals("chrome")) {
				driver=new ChromeDriver();
			}else {
				driver=new EdgeDriver();
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		
		@AfterSuite
		public void close() {
			driver.quit();
		}
		
		public String captureScreenshot(String tname)  {
			String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			
			TakesScreenshot ss=(TakesScreenshot)driver;
			File source=ss.getScreenshotAs(OutputType.FILE);
			String destination=System.getProperty("user.dir")+"\\Screenshots\\"+tname+timestamp+".png";
			try {
				Files.copy(source,new File(destination));
				
			
			}catch (Exception e) {
				e.getMessage();
			}
			return destination;
		}
		
		
	}


