package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormAumate {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ISHITA");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("BAGHEL");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("kumarivanu@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'dateOfBirthInput')]")).sendKeys("14 Jul 2023");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Mobile Number')]")).sendKeys("9845943470");
		driver.findElement(By.xpath("//textarea[starts-with(@placeholder,'Current Address')]")).sendKeys("Well begun is half done");
		driver.findElement(By.xpath("//label[text()='Subjects']"));
		/*driver.findElement(By.xpath("//input[@='RESULT_tEXTfIELD-4']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@='RESULT_tEXTfIELD-5']")).sendKeys("BANGALORE");
		driver.findElement(By.xpath("//input[@='RESULT_tEXTfIELD-6']")).sendKeys("kumarivanu@gmail.com");*/
		
		
	}
}
