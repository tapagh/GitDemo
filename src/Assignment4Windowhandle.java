import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentID.childID]
		Iterator<String> it = windows.iterator();
		String childID1 = it.next();
		String childID2 = it.next();
		//String childID2 = it.next();
		
		driver.switchTo().window(childID2);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(childID1);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
	}

}
