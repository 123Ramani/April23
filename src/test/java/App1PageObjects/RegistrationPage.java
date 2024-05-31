package App1PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (id="customer.firstName")
	WebElement txt_fname;
	
	@FindBy (id="customer.lastName")
	WebElement txt_lname;
	
	@FindBy (id="customer.address.street")
	WebElement txt_address;
	
	@FindBy (id="customer.address.city")
	WebElement txt_city;
	
	@FindBy (id="customer.address.state")
	WebElement txt_state;
	
	@FindBy (id="customer.address.zipCode")
	WebElement txt_zip;
	
	@FindBy (id="customer.phoneNumber")
	WebElement txt_phone;
	
	@FindBy (id="customer.ssn")
	WebElement txt_ssn;
	
	@FindBy (id="customer.username")
	WebElement txt_username;
	
	@FindBy (id="customer.password")
	WebElement txt_password;
	
	@FindBy (id="repeatedPassword")
	WebElement txt_cnfpwd;
	
	@FindBy (xpath="//input[@value='Register']")
	WebElement btn_registration;
	
	public void set_Firstname(String fname) {
		txt_fname.sendKeys(fname);
	}
	public void set_lastname(String lname) {
		txt_lname.sendKeys(lname);
	}
	public void set_address(String address) {
		txt_address.sendKeys(address);
	}
	public void set_city(String city) {
		txt_city.sendKeys(city);
	}
	public void set_state(String state) {
		txt_state.sendKeys(state);
	}
	public void set_zipcode(String zipcode) {
		txt_zip.sendKeys(zipcode);
	}
	public void set_phone(String phone) {
		txt_phone.sendKeys(phone);
	}
	public void set_ssn(String ssn) {
		txt_ssn.sendKeys(ssn);
	}
	public void set_username(String uname) {
		txt_username.sendKeys(uname);
	}
	public void set_password(String pwd) {
		txt_password.sendKeys(pwd);
	}
	public void set_cnfpassword(String cnfpwd) {
		txt_cnfpwd.sendKeys(cnfpwd);
	}
	public void click_regstration() {
		btn_registration.click();
	}

}


