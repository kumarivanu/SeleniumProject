package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateScripts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Get
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vandana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumari");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("(//input[@id='sex' or @name='sex'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='exp-2' or @type='radio'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("16 July 2023");
		driver.findElement(By.xpath("(//input[@name='profession' or @type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='profession' or @type='checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//button[@name='submit'])[1]")).click();
		
		
		
	}
}
	
	
	
	
	
	
	
	
	

