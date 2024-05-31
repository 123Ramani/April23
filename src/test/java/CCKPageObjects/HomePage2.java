package CCKPageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class HomePage2  extends BasePage2{

		public HomePage2(WebDriver driver) {
			super(driver);
			
		}
		
		@FindBy (xpath="//*[@id=\"navbarSupportedContent\"]/div/a[2]")
		WebElement btn_registermodal; 
		 public void click_registration() {
			 btn_registermodal.click();
		 }

	}

