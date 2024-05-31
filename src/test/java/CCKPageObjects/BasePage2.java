package CCKPageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	public class BasePage2 {
		public static WebDriver driver;
		public BasePage2(WebDriver driver) {
			BasePage2.driver=driver;
			PageFactory.initElements(driver, this);
		}

	}


