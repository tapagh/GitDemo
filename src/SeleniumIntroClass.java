import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroClass {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
