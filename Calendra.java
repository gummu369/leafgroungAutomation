package com.leafeground.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendra {
	@Test
	public void testCalender() throws InterruptedException {
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Calendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		String dateTitle = driver.findElement(By.className("ui-datepicker-title")).getText();
		String year = dateTitle.split(" ")[0].trim();
		System.out.println(year);
		String month = dateTitle.split(" ")[1].trim();
		System.out.println(month);
		
//		while (!(month.equals("September") && year.equals("2021"))) {
//			driver.findElement(By.xpath("ui-icon ui-icon-circle-triangle-e")).click();
//			dateTitle = driver.findElement(By.className("ui-datepicker-title")).getText();
//			year = dateTitle.split(" ")[0].trim();
//			System.out.println(year);
//			month = dateTitle.split(" ")[1].trim();
//			System.out.println(month);
//
//		}
		driver.findElement(By.xpath("//a[text()='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
