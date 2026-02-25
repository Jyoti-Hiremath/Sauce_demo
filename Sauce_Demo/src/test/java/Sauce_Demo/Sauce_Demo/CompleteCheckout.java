package Sauce_Demo.Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompleteCheckout {
	
	 WebDriver driver=new ChromeDriver();
    @Test(priority=1)
    void login() throws InterruptedException 
 {
	driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(5000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(5000);
	driver.findElement(By.id("login-button")).click();
 }
  
	@Test(priority=2)
	void verifyProductlist()throws InterruptedException
{
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("inventory_sidebar_link")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("react-burger-cross-btn")).click();
	Thread.sleep(8000);
}
		
	@Test(priority=3)
    void additem() throws InterruptedException
{
    WebElement dropdown= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
    dropdown.click();
    Select oselect=new Select(dropdown);
    oselect.selectByVisibleText("Name (A to Z)");
	//oselect.selectByValue("lohi");
	Thread.sleep(5000);
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	Thread.sleep(8000);
}
	@Test(priority=4)
	void cart() throws InterruptedException
{
	driver.findElement(By.id("shopping_cart_container")).click();
	Thread.sleep(8000);
}
		
    @Test(priority=5)
	void checkout() throws InterruptedException
{
	driver.findElement(By.name("checkout")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("first-name")).sendKeys("John");
	Thread.sleep(5000);
	driver.findElement(By.id("last-name")).sendKeys("smith");
	Thread.sleep(5000);
	driver.findElement(By.id("postal-code")).sendKeys("43434");
	Thread.sleep(5000);
	driver.findElement(By.id("continue")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("finish")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("back-to-products")).click();
	Thread.sleep(8000);
}
			
	@Test(priority=5)
	void logout() throws InterruptedException
{
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(5000);
    driver.findElement(By.id("logout_sidebar_link")).click();

}
}
