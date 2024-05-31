package App1testCase;

	import org.testng.annotations.Test;

import App1PageObjects.BasePage;
import App1PageObjects.DashboardPage;
import App1testBase.BaseClass2;
	
	public class TC_002_OpenNewAccount extends BaseClass2{
		
		@Test
		public void NewAccount() throws InterruptedException {
			Thread.sleep(5000);
			DashboardPage dp=new DashboardPage(BasePage.driver);
			
			dp.click_openaccount();
			logger.info("****Clicked on New Account*****");
			Thread.sleep(5000);
			
			
		}
	}

