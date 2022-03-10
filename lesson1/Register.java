package com.phase5.lesson1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("enter your choice..");
		System.out.println("1.register\n 2.Login and continue");
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("nandiniabc@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		   	
		driver.findElement(By.id("customer_firstname")).sendKeys("Nandu");
		driver.findElement(By.id("customer_lastname")).sendKeys("G");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("12345");
		
		
		
		driver.findElement(By.id("firstname")).sendKeys("nandu");
		driver.findElement(By.id("lastname")).sendKeys("G");
		Thread.sleep(2000);
		driver.findElement(By.id("address1")).sendKeys("Gunj");
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		Thread.sleep(2000);
	    driver.findElement(By.id("id_state")).click();
    
	      WebElement state = driver.findElement(By.id("id_state"));
      state.findElement(By.xpath("//option[. = 'California']")).click();
      Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone_mobile")).sendKeys("7854575315");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("submitAccount")).click();
		 
		
		Thread.sleep(10000);
		break;
		
		case 2:
			ChromeDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("http://automationpractice.com/index.php");
			
			driver1.findElement(By.className("login")).click();
			driver1.findElement(By.id("email")).sendKeys("nandiniabc@gmail.com");
			driver1.findElement(By.id("passwd")).sendKeys("12345");
			driver1.findElement(By.id("SubmitLogin")).click();
		
		    break;
		default:
			System.out.println("please , enter a valid choice...!");
		
		
		}
		
		
		
		
	}

}
