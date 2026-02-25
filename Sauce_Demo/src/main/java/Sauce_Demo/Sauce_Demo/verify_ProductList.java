package Sauce_Demo.Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_ProductList {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(5000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(5000);
			driver.findElement(By.id("login-button")).click();

			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
			Thread.sleep(8000);
			driver.findElement(By.id("react-burger-cross-btn")).click();
			
			Thread.sleep(8000);
			//driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
			//driver.close();
	}
}
