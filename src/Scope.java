import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement firstcol = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		System.out.println(firstcol.findElements(By.tagName("a")).size());

		for (int i = 0; i < firstcol.findElements(By.tagName("a")).size(); i++) {

			String rightclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstcol.findElements(By.tagName("a")).get(i).sendKeys(rightclick);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
