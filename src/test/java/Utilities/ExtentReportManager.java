package Utilities;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

import App1testBase.BaseClass2;
import TestCaseExecution.BaseClass;
	public class ExtentReportManager implements ITestListener {
		
		public ExtentSparkReporter sparkreporter;//UI of the test report
		public ExtentReports extent;//gather common information
		public ExtentTest test;//update the result
		
		public void onStart(ITestContext context) {
			//specify folder to generate report
			sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReports/TestreportApp.html");
			sparkreporter.config().setDocumentTitle("Automation Testing");
			sparkreporter.config().setReportName("LoginTest");
			sparkreporter.config().setTheme(Theme.DARK);
			//common info
			extent=new ExtentReports();
			extent.attachReporter(sparkreporter);//attaching UI of report
			extent.setSystemInfo("Computer name", "Localhost");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Tester", "Ramani");
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Browser", "Chrome");
			
		}
		
		public void onTestSuccess(ITestResult result) {
			test=extent.createTest(result.getName());
			test.log(Status.PASS,"Test is passed"+result.getName());
		}
		
		public void onTestFailure(ITestResult result) {
			test=extent.createTest(result.getName());
			test.log(Status.FAIL, "Test is failed"+result.getName());
			test.log(Status.FAIL, result.getThrowable());//capture reason for failure
	try	 {
	String 	imgpath=new BaseClass2().captureScreen(result.getName());
		test.addScreenCaptureFromPath(imgpath);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		}
		
		public void onTestSkipped(ITestResult result) {
			test=extent.createTest(result.getName());
			test.log(Status.SKIP, "Test is failed"+result.getName());
			test.log(Status.SKIP, result.getThrowable());
		}
		
		public void onFinish(ITestContext context) {
			extent.flush();//close the report generation
		}
	}


