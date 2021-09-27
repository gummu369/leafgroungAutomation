package com.leafeground.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public void testAlert() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		Thread.sleep(2000);
		// simple alert box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		 org.openqa.selenium.Alert simplealert= driver.switchTo().alert();
		 simplealert.accept();
		Thread.sleep(2000);
		// confirmation alert box
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();;
		Thread.sleep(2000);
		 org.openqa.selenium.Alert confirmationAlert=driver.switchTo().alert();
		 confirmationAlert.dismiss();
		Thread.sleep(2000);
		// prompt box
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(2000);
		 org.openqa.selenium.Alert promtAlert=driver.switchTo().alert();
		 promtAlert.sendKeys("pemmasani vamsi krishna");
		 promtAlert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Thread.sleep(2000);
		 org.openqa.selenium.Alert lineBreakAlert=driver.switchTo().alert();
		 System.out.println(lineBreakAlert.getText());
		 lineBreakAlert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
