import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
