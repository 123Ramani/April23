package Automation.April;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	void Login() {
		System.out.println("Login");
	}
	@Test
	void search() {
		System.out.println("search");
	}

}
