package session5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class positionxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://only-testing-blog.blogspot.com/2014/09/temp.html");
		
		driver.manage().window().maximize();
		
		//Two method here for position 1) xpath -using position() 2) xpath -using last()
		driver.findElement(By.xpath("//input[@type='text'][position()=1]")).sendKeys("Modasia"); //1st position
		driver.findElement(By.xpath("//input[@type='text'][position()=2]")).sendKeys("Chirag"); // 2nd position
		driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("Parsottamdas"); // Last position
		
		
		
		
		

	}

}
