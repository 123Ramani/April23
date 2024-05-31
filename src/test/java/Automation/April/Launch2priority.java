package Automation.April;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class Launch2priority {
	
		@BeforeClass
			void Login() {
				System.out.println("Login");
			}
			@Test(priority=1)
			void search() {
				System.out.println("search");
			}
			@Test(priority=2)
			void addproduct() {
				System.out.println("addproduct");
			}
			@AfterClass
			void Logout() {
				System.out.println("Logout");
			}
		}


