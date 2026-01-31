package session5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		//open swag lab web page
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//locate username using single attribute 
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//locate username using contains Method
		//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		//locate username using starts-with method
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");
		
		//locate password using multiple attribute
		driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		////locate username using relative xpath --> Syntax = //tagname[@attribute name ='attribute value']
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//xpath - using And expression
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		
		//xpath - using OR expression
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();
		
		
		
		
		
		
		
		

	}

}
