package Sauce_Demo.Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveItemfromCart {

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
		
		WebElement dropdown= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
		dropdown.click();
        Select oselect=new Select(dropdown);
        oselect.selectByValue("za");
	    Thread.sleep(5000);
	    driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(8000);
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(8000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(8000);
				
	}

}
