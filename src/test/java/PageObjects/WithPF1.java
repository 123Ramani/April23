package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPF1 {
		WebDriver driver;
		//constructor 
		public WithPF1(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

	//with pagefactory
	//we donot use FindElement and FindElements methods
	
	@FindBy (id="")
	WebElement txt_name;
	
	@FindBy (xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement txt_pwd;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement btn_login;
	
	public void set_Username() {
		txt_name.sendKeys("Admin");
	}
	public void set_password() {
		txt_pwd.sendKeys("admin123");
	}
	public void click_login() {
		btn_login.click();
	}
	
}

