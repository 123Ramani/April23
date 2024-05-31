package Automation.April;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;


	public class ParallelTesting {
		public static WebDriver driver;
		@BeforeClass
		@Parameters({"browser"})
		void setup(String browser) {
			if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			
			}else {
				driver=new EdgeDriver();
				
			}
		}
		
		@Test(priority=1)
		@Parameters("url")
		void launch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		@Test(priority=2)
		@Parameters({"username","pwd"})
		void login(String username,String password) throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
			
		}
		@AfterClass
		void close() {
			driver.close();
		}
	}



