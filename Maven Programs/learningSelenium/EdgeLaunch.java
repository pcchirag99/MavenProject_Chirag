package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\chira\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
