package Automation.April;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch {
	public static WebDriver driver;
@Test
void launch(){
	driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/tables");
	driver.manage().window().maximize();
	}
@BeforeMethod
void Login() {
	System.out.println("Login");
}
@Test(priority=1)
void search() {
	System.out.println("search");
}
@Test(priority=2)
void addproduct() {
	System.out.println("addproduct");
}
@AfterMethod
void logout() {
	System.out.println("Logout");
}
}