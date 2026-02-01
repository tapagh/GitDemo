import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class End2Endbooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector("td[class*='ui-datepicker-current-day'")).click();
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
		{
			System.out.println("Its Disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
