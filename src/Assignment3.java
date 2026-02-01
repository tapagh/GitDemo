import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();		
		WebElement element = driver.findElement(By.cssSelector("select[class='form-control'"));
		Select s = new Select(element);
		s.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> phones = driver.findElements(By.cssSelector("app-card button"));
		
		for(int i=0; i<phones.size();i++)
		{
			WebElement phone = phones.get(i);
			phone.click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
