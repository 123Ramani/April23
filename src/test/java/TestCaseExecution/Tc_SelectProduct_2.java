package TestCaseExecution;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;
	public class Tc_SelectProduct_2 extends  BaseClass {
			
		public static WebDriver driver;	
		@Test
		public void selectProduct() throws InterruptedException {
			Thread.sleep(5000);
			Select dropdown=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
			dropdown.selectByValue("lohi");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		}
	}


