package session7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountandHyperlinksexample {
	
	//session 6

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch Web page https://www.calculator.net/
		driver.get("https://www.calculator.net/");
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on web page: " + linkElements.size());
		
		//Using for each loop for print all the links
		for(WebElement e1:linkElements)
		{
			System.out.println(e1.getText());
		}
	}

}
