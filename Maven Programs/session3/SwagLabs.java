package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class SwagLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		//open sauce demo web page
		driver.get("https://www.saucedemo.com/");
		
		//locate username by id --> second method is we can use tagname which is always start with <inmout so
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//locate username by name
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//locate login button
		driver.findElement(By.className("submit-button")).click();
		
		//switch to product page
		String currentwindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowHandle);
		
		//locate Sauce Labs Bolt T-Shirt using link text --> second method here is partial link text here we can use "Bolt" because it's element value is different
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click(); //click operation
		
		//Sauce elemList<A> find method using find elements
		List <WebElement> elementList = (List<WebElement>) driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element size:" + elementList.size());
		
		
		
		

	}

}
