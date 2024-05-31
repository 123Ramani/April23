package App1testCase;
import org.testng.annotations.Test;

import App1PageObjects.HomePage;
import App1PageObjects.RegistrationPage;
import App1testBase.BaseClass2;
	public class TC_001_Registartion extends BaseClass2{
		@Test
		public void CreateAccount() throws InterruptedException {
			HomePage hp=new HomePage(driver);
			RegistrationPage rp=new RegistrationPage(driver);
			
			hp.click_registration();
			logger.info("****Clicked on Registration*****");
			Thread.sleep(3000);
			
			rp.set_Firstname(RB.getString("firstname"));
			logger.info("****Firstname entered*****");
			
			rp.set_lastname(RB.getString("lastname"));
			logger.info("****Lastname Entered*****");
			
			rp.set_address(RB.getString("address"));
			logger.info("****Address Entered*****");
			
			rp.set_city(RB.getString("city"));
			logger.info("****City Entered*****");
			
			rp.set_state(RB.getString("state"));
			logger.info("****State Entered*****");
			
			rp.set_zipcode(RB.getString("zipcode"));
			logger.info("****Zipcode Entered*****");
			
			rp.set_phone(RB.getString("phone"));
			logger.info("****Phonenumber entered*****");
			
			rp.set_ssn(RB.getString("ssn"));
			logger.info("***ssn entered*****");
			
			rp.set_username(RB.getString("username"));
			logger.info("****username entered*****");
			
			rp.set_password(RB.getString("password"));
			logger.info("****password entered*****");
			
			rp.set_cnfpassword(RB.getString("confirmpassword"));
			logger.info("****confirm password entered*****");
			
			rp.click_regstration();
			logger.info("****Account Created*****");
			Thread.sleep(5000);
			
		}

	}



