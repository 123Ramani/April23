package Automation.April;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Classs2 {
	@Test
	void addproduct() {
		System.out.println("addproduct");
	}
	@AfterTest
	void logout() {
		System.out.println("logout");
	}
}
