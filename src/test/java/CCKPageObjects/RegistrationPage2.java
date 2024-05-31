package CCKPageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class RegistrationPage2  extends BasePage2{

		public RegistrationPage2(WebDriver driver) {
			super(driver);	
		}
		
		@FindBy (id="customer.First Name")
		WebElement txt_fname;
		
		@FindBy (id="customer.Last Name")
		WebElement txt_lname;
		
		@FindBy (id="customer.Full Address")
		WebElement txt_FA;
		
		@FindBy (id="customer.Email address")
		WebElement txt_Ea;
		@FindBy (id="customer.Mobile Number")
		WebElement txt_MN;
		
		@FindBy (id="customer.address.Country")
		WebElement txt_Country;
		
		@FindBy (id="customer.address.State")
		WebElement txt_State;
		
		@FindBy (id="customer.address.City")
		WebElement txt_City;

		@FindBy (id="customer.Password")
		WebElement txt_Password;
		
		@FindBy (id="repeatedPassword")
		WebElement txt_cnfpwd;
		
		@FindBy (xpath="/html/body/section/div/div/div/div/div/div[2]/div/form/div[6]/label")
		WebElement txt_Label;
			
		@FindBy (xpath="/html/body/section/div/div/div/div/div/div[2]/div/form/div[7]/div/div[1]/button")
		WebElement txt_Register;
		
		
		public void set_fname(String fname) {
			txt_fname.sendKeys(fname);
		}
		public void set_lname(String lname) {
			txt_lname.sendKeys(lname);
		}
		public void set_Ea(String Ea) {
			txt_Ea.sendKeys(Ea);
		}
		public void set_MN(String MN) {
			txt_MN.sendKeys(MN);
		}
	
		public void set_FA(String FA) {
			txt_State.sendKeys(FA);
		}
		public void set_Country(String Country) {
			txt_Country.sendKeys(Country);
		}
		
		public void set_State(String State) {
			txt_State.sendKeys(State);
		}
		public void set_City(String City) {
			txt_City.sendKeys(City);
		}
		public void set_Password(String Password) {
			txt_Password.sendKeys(Password);
		}
		public void set_cnfpassword(String cnfpwd) {
			txt_cnfpwd.sendKeys(cnfpwd);
		}
		public void click_Label() {
			txt_Label.submit();
		}
		public void click_Register() {
			txt_Register.click();
		
		}
	}

