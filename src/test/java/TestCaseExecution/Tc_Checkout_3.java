package TestCaseExecution;


	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.Select;
		import org.testng.annotations.Test;
		public class Tc_Checkout_3 extends  BaseClass{				
				@Test
			public void selectProduct() throws InterruptedException {
				Thread.sleep(5000);
				Select checkout =new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

				//Thread.sleep(5000);
				//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]']")).click();
			//	Thread.sleep(5000);
				//driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			}
		}




