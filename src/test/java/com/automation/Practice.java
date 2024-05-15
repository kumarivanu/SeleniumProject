package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://savkk.github.io/selenium-practice/form/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Vandana");	
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kumari");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kumarivanu@gmail.com");
		driver.findElement(By.xpath("(//input[@type='radio' and@name='sex'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bangalore whitefield,Mahadevepura");
			
		driver.findElement(By.xpath("//textarea[@cols='50']")).sendKeys("I Just Love to do Coding");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
