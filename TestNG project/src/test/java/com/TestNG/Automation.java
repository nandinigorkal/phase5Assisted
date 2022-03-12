package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void startbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
	}
	
	@Test(priority='1')
	public void TestWikiHomepage() throws InterruptedException
	{
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		
//		driver.findElement(By.id("email_create")).sendKeys("nandiniabc@gmail.com");
//		driver.findElement(By.id("SubmitCreate")).click();
//		Thread.sleep(5000);
//		   	
//		driver.findElement(By.id("customer_firstname")).sendKeys("Nandu");
//		driver.findElement(By.id("customer_lastname")).sendKeys("G");
//		Thread.sleep(2000);
//		driver.findElement(By.id("passwd")).sendKeys("12345");
//		
//		
//		
//		driver.findElement(By.id("firstname")).sendKeys("nandu");
//		driver.findElement(By.id("lastname")).sendKeys("G");
//		Thread.sleep(2000);
//		driver.findElement(By.id("address1")).sendKeys("Gunj");
//		driver.findElement(By.id("city")).sendKeys("Pune");
//		
//		Thread.sleep(2000);
//	    driver.findElement(By.id("id_state")).click();
//    
//	      WebElement state = driver.findElement(By.id("id_state"));
//      state.findElement(By.xpath("//option[. = 'California']")).click();
//      Thread.sleep(2000);
//		driver.findElement(By.id("postcode")).sendKeys("12345");
//		driver.findElement(By.id("phone_mobile")).sendKeys("7854575315");
//		Thread.sleep(5000);
//		
//		
//		driver.findElement(By.id("submitAccount")).click();
//		 
//		
		
		
		
		
		driver.findElement(By.id("email")).sendKeys("nandiniabc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		//invalid login
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		String expectedtitle="My account - My Store";
		String actualtitle = driver.getTitle();
		 if(expectedtitle.equals(actualtitle)) {
			 WebElement searchbox = driver.findElement(By.id("search_query_top"));
			 
			 searchbox.sendKeys("summer dresses");
			 driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".clearfix:nth-child(1) > .content_img > .replace-2x")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("add_to_cart")).click();
			 
			Thread.sleep(10000);
			 
			 
		 }
		 else {
			 System.out.println("Invalid email or password...!\n...please try again with valid credentials....!");
		 }
	     	
	}


	@AfterMethod
	public void closeBrowser()
	{
	
		driver.close();
	}
}
