package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver","C:\\Users\\chira\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\\");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
