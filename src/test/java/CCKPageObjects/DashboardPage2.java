package CCKPageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class DashboardPage2  extends BasePage2{

		public DashboardPage2(WebDriver driver) {
			super(driver);
		}
		
		@FindBy (xpath="/html/body/div[2]/div/div/div/div[2]/div/div[1]/a/div/img")
		WebElement link_AsStudent;
		
		public void click_AsStudent() {
			link_AsStudent.click();
		}
		/*public void select_drpdwn() {
			Select drp=new Select(drpdwn);
			drp.selectByIndex(0);*/
		}
