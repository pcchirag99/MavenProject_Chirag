package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("iPhone 15 pro max");
		searchBox.submit();
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (Blue Titanium, 512 GB)']")).click();
	}
}
