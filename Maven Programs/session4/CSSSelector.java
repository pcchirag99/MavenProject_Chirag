package session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		//open swag lab web page
		driver.get("https://www.saucedemo.com/");
		
		//locate user name using Tag and id --> Syntax --> (tag#id)
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//locate Password using Tag and attribute --> Syntax --> (tag[attribute=value])
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//locate login button using Tag and class --> Syntax --> (tag.value of class)
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//Add to Cart Using --> Tag,class and attribute --> Syntax --> (tag.valueofClass[attribute=value])
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//Add to Cart using --> Sub-string --> Syntax --> tag[attribute^=substring] --- Also note (start with=^, ends with=$, Contains=*)
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		
		
		
		
		

	}

}
