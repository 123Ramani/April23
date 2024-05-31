package Automation.April;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExecution {
		@BeforeSuite
		void method1() {
			System.out.println("beforesuite");
		}
		@AfterSuite
		void method2() {
			System.out.println("aftersuite");
		}
		@BeforeTest
		void method3() {
			System.out.println("beforetest");
		}
		@AfterTest
		void method4() {
			System.out.println("aftertest");
		}
		@BeforeClass
		void method5() {
			System.out.println("beforeclass");
		}
		@AfterClass
		void method6() {
			System.out.println("afterclass");
		}
		@BeforeMethod
		void method7() {
			System.out.println("beforemethod");
		}
		@AfterMethod
		void method8() {
			System.out.println("aftermethod");
		}
		@Test(priority=1)
		void method9() {
			System.out.println("test1");
		}
		@Test(priority=2)
		void method10() {
			System.out.println("test2");
		}
	}


