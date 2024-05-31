package PageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PF1 extends WithPF1 {
	public PF1(WebDriver driver) {
		super(driver);
		
	}

	@Test
	void login() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WithPF1 Wp=new WithPF1(driver);
		Wp.set_Username();
        Wp.set_Username();
	    Wp.click_login();
	
	}

}
