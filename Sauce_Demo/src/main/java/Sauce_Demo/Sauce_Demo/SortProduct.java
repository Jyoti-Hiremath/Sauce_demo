package Sauce_Demo.Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortProduct {

	public static void main(String[] args) throws InterruptedException {
		{
		    WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(5000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(5000);
			driver.findElement(By.id("login-button")).click();
			
			//WebElement dropdown= driver.findElement(By.className("product_sort_container"));
			WebElement dropdown= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			dropdown.click();
            Select oselect=new Select(dropdown);
			oselect.selectByValue("za");
			Thread.sleep(4000);
			oselect.selectByValue("lohi");
			Thread.sleep(5000);
	}
}
}
