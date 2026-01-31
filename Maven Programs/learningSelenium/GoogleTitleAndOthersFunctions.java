package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleAndOthersFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com/");
		//String title = driver.getTitle(); //1st method
		System.out.println("Page Title: " + driver.getTitle()); //2nd method
		System.out.println("URL: " + driver.getCurrentUrl());
		// For Page Source = System.out.println("Page Source: " + driver.getPageSource());
		driver.close();
	}
}
