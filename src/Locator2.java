import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		String name= "Tapabrota";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password = getPassword(driver);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@value,'rmb')]")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		
	}

	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String resetmsg = driver.findElement(By.cssSelector("form p")).getText();
		String passarr = resetmsg.split("'")[1];
		String password = passarr.split("'")[0];
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		return password;
	}
}
