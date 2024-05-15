package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.id("vfb-5")).sendKeys("Vandana");
		
		//Thread.sleep(3000);
		driver.findElement(By.id("vfb-7")).sendKeys("Kumari");
		driver.findElement(By.id("vfb-31-2")).click();
		driver.findElement(By.name("vfb-13[address]")).sendKeys("Whitefield Mahadevpura");
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("Brigade Metropolis");
				
				
		driver.findElement(By.name("vfb-13[zip]")).sendKeys("600500");
		driver.findElement(By.name("vfb-13[city]")).sendKeys("Banglore");
		
		//Thread.sleep(4000);
		driver.findElement(By.id("vfb-14")).sendKeys("kumarivanu@gmail.com");
		driver.findElement(By.id("vfb-13-state")).sendKeys("Karnataka");
		driver.findElement(By.id("vfb-19")).sendKeys("9845943470");
		//driver.findElement(By.id("vfb-18")).sendKeys("07/08/2023");
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-23")).sendKeys("My Success is certain to me");
		driver.findElement(By.id("vfb-3")).sendKeys("97");
		driver.findElement(By.id("vfb-4")).click();
		
	
		
	}
}
