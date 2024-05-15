package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vandana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumari");
		driver.findElement(By.xpath("//input[@name='sex' and@type='radio' and@value='Female']")).click();
		driver.findElement(By.xpath("(//input[@name='profession' and@ type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='tool' or @type='checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("I AM AN AUTOMATION TESTER");
		driver.findElement(By.xpath("(//input[@name='exp' or @type='radio'])[6]")).click();
		
		/*driver.findElement(By.xpath("//input[contains(@value,'Female')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'2')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("issue");
		driver.findElement(By.xpath("//input[contains(@value,'Automation Tester')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Selenium Webdriver')]")).click();*/

	}
}
