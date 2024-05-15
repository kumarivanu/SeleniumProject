package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//GET
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//driver.navigate().to("https://www.flipkart.com/");
		
		//GET TITLE
		String title=driver.getTitle();
		System.out.println(title);
		/*driver.findElement(By.xpath("(//a[@class='gb_v'][1)")).click();
		Thread.sleep(3000);
		
		//GET CURRENT URL
		
		String Current_URL=driver.getCurrentUrl();
		System.out.println(Current_URL);
		
		//GET PAGE SOURCE
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		Thread.sleep(3000);
		
		//DRIVER.CLOSE AND QUIT */
		 
		 Thread.sleep(3000);
		driver.close();
	}

}
