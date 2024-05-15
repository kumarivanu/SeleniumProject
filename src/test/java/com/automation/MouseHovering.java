package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/link.html");
	//	driver.findElement(By.linkText("click here")).click();
	//	Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("click")).click();
		List<WebElement> li=driver.findElements(By.linkText("click here"));
		int x=li.size();
		System.out.println(x);
		li.get(0).click();
		li.get(1).click();
	//	System.out.println(li.get(1).getAttribute("href"));
//		li.get(1).click();

	

}
}