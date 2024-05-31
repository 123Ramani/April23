package Automation.April;

	import org.testng.Assert;
	import org.testng.annotations.Test;
	public class Invocation {
		@Test(priority=1,invocationCount=4)
		void launch() {
			Assert.assertTrue(true);
		}
		@Test(priority=2,dependsOnMethods= {"launch"},invocationCount=2)
		void login() {
			Assert.assertTrue(true);
		}
		@Test(priority=3,dependsOnMethods= {"login"})
		void logout() {
			Assert.assertTrue(true);
		}
	}



