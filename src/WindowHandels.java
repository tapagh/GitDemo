import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentID.childID]
		Iterator<String> it = windows.iterator();
		//String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
	}

}
