package Automation.April;

import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnMethods {
	@Test(priority=1)
	void launch() {
		Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods= {"launch"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}




