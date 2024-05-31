package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPF2 {
	public static WebDriver driver;
	By text_Uname_loc=By.xpath("//input[@name='username']");
	By text_Pwd_loc=By.xpath("//input[@name='password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	public void setUsername() {
		driver.findElement(text_Uname_loc).sendKeys("Admin");
	}
	
	public void setPassword() {
		driver.findElement(text_Pwd_loc).sendKeys("admin123");
	}
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}

}
