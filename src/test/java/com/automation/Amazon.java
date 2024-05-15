package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Books");
		driver.findElement(By.xpath("//a[@class='nav-a']")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		
		
		
		

	}

}
