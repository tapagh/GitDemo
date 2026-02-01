import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingToCart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));


		String[] bag = { "Walnuts", "Pomegranate", "Brocolli" };
		addItems(driver, bag);
		
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
	}
	
	public static void addItems(WebDriver driver, String[] bag)
	{
		ArrayList<String> bagList = new ArrayList<>(Arrays.asList(bag));

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < product.size(); i++) {
			String nameWithKg = product.get(i).getText();
			String[] nameSplit = nameWithKg.split("-");
			String name = nameSplit[0].trim();

			if (bagList.contains(name)) {
				j++;
				driver.findElements(By.cssSelector("div.product button")).get(i).click();

				if (j > bagList.size()) {
					break;
				}

			}

		}
		
	}

}
