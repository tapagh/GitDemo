import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String date = "1";
		String month = "2";
		String year = "2029";
		
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'react-calendar__year-view__months__month')])["+month+"]")).click();
		driver.findElement(By.xpath("(//abbr[text()='"+date+"'])[1]")).click();
	}

}
