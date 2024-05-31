package CCKtestCase;


	import org.testng.annotations.Test;

import CCKPageObjects.HomePage2;
import CCKPageObjects.RegistrationPage2;
import CCKtestBase.BaseClass3;
	
	public class TC_02_Registartion extends BaseClass3{
			@Test
			public void CreateAccount() throws InterruptedException {
				HomePage2 hp=new HomePage2(driver);
				RegistrationPage2 rp=new RegistrationPage2(driver);
				
				hp.click_registration();
				logger.info("****Clicked on Registration*****");
				Thread.sleep(3000);
				
				
				rp.set_fname(RB.getString("First Name"));
				logger.info("****Firstname entered*****");
				
				rp.set_fname(RB.getString("Last Name"));
				logger.info("****Lastname Entered*****");
				
				rp.set_Ea(RB.getString("Ea"));
				logger.info("****Email Address Entered*****");
				
				rp.set_MN(RB.getString("MN"));
				logger.info("****Mobilenumber entered*****");
				
				rp.set_City(RB.getString("City"));
				logger.info("****City Entered*****");
				
				rp.set_State(RB.getString("State"));
				logger.info("****State Entered*****");
				
				rp.set_Password(RB.getString("Password"));
				logger.info("****password entered*****");
			
				rp.set_cnfpassword(RB.getString("confirmpassword"));
				logger.info("****confirm password entered*****");
				
				rp.click_Label();
				logger.info("****Label Selected*****");
				
				rp.click_Register();
				logger.info("****Account Created*****");
				Thread.sleep(5000);
				
			}

		}
	