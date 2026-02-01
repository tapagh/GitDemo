import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String text = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(text);
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<options.size();i++)
		{
			if(text.equals(options.get(i).getText()))
			{
				s.selectByIndex(i);
				break;
			}
		}
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		String altmsg = driver.switchTo().alert().getText();
		if(altmsg.contains(text))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
		
		driver.switchTo().alert().accept();
	}

}
