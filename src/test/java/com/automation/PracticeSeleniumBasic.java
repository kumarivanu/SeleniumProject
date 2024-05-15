package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumBasic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Get
		driver.get("https://www.google.com/");

		// Get Title
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@class='gb_v'])[1]")).click();

		Thread.sleep(3000);
		// Get Current URL
		String Current_URL = driver.getCurrentUrl();
		System.out.println(Current_URL);

		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
		Thread.sleep(6000);
		driver.close();

	}
}
