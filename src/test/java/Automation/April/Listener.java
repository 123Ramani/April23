package Automation.April;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	public class Listener  implements ITestListener {
		
		public void onStart(ITestContext context) {
			System.out.println("Test execution is started");
		}
		
		public void onTestSuccess(ITestResult result) {
			System.out.println("your test is passed");
		}
		
		public void onTestFailure(ITestResult result) {
			System.out.println("your test is failed");
		}
		
		public void onTestSkipped(ITestResult result) {
			System.out.println("your test is skipped");
		}
		
		public void onFinish(ITestContext context) {
			System.out.println("your test is completed");
		}
		
		
	}


