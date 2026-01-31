package session9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		/*First Website
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");*/
		
		/*Second Website
		driver.get("https://www.calculator.net/")*/
		
		//Third Website
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		
		driver.manage().window().maximize();
		
		List <WebElement> radioButtonsList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total no. of radio button on web page: " + radioButtonsList.size());
		
		driver.close();
		

	}

}
