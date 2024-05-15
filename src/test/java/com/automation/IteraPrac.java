package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IteraPrac {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vandana Kumari"
		  ); driver.findElement(By.
		 xpath("(//input[@id='phone' and@placeholder='Enter your mobile phone'])")).
		  sendKeys("9845934370");
		  driver.findElement(By.xpath("//input[@type='email' and@id='email']")).
		  sendKeys("kumarivanu@gmail.com");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sainy");
		  driver.findElement(By.xpath("//textarea[@id='address']")).
		  sendKeys("MY SUCCESS IS CERTAIN TO ME !!");
		  driver.findElement(By.xpath("//input[@id='female']")).click();
		  driver.findElement(By.xpath("//input[@id='monday']")).click();
		 driver.findElement(By.xpath("(//label[@class='custom-control-label'])"
		 		
		 	)).click();
		 		
		  
		 
		//driver.findElement(By.xpath("//input[@id='selenium']")).click();
	

	}
}
