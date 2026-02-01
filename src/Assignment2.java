import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Tapa");
		driver.findElement(By.name("email")).sendKeys("ta@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("(//option)[2]")).click();
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("18-02-2000");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert']")).getText());

	}

}
