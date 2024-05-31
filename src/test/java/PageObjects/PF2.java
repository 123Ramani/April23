package PageObjects;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PF2 extends WithoutPF2 {
	@Test
void login() {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WithoutPF2 WP=new WithoutPF2();
	WP.setUsername();
	WP.setPassword();
	WP.clickLogin();
}
}