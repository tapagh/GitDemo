

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector("td[class*='ui-datepicker-current-day'")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
