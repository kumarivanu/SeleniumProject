package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeeksTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.geeksforgeeks.org/java/?ref=shm");
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		/*
		 * driver.findElement(By.linkText("click here")).click(); Thread.sleep(3000);
		 * //driver.findElement(By.partialLinkText("click")).click(); //List<WebElement>
		 * li=driver.findElements(By.linkText("click here")); //int x=li.size();
		 * //System.out.println(x); //li.get(0).click(); //li.get(1).click();
		 * System.out.println(li.get(1).getAttribute("href")); li.get(1).click();
		 */
		driver.findElement(By.id("vfb-5")).sendKeys("Sainy");
		driver.findElement(By.name("vfb-7")).sendKeys("Ishita");
		//driver.findElement(By.className("vfb-text  vfb-medium  required  ")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@id='vfb-31-3']")).click();
		driver.findElement(By.xpath("//textarea[@id='vfb-23']")).sendKeys("vandana");

	}
}