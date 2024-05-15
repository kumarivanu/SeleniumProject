package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDifferentPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vandana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumari");
		driver.findElement(By.xpath("(//input[@id='sex' or @name='sex'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='exp-2' or @type='radio'])[5]")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("16 July 2023");
		driver.findElement(By.xpath("//input[@id='profession-1' and @type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@id='tool-2' or @name='tool'])[3]")).click();		
		
		
		
		
		
		
		
		
		
		

	}

}
