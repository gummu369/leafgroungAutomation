package com.leafeground.playground;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathWays {
	@Test
	public void xpathWays()

	{
		String path = "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 
		//Xpath using tags- attribute - value
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		
		//Xpath using contains()
		driver.findElement(By.xpath("//a[contains(@id,'location')]")).click();
		//Xpath using starts-with()
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'or enter an')]")).clear();
		//Xpath using chained declaration
		driver.findElement(By.xpath("//div//input[starts-with(@aria-label,'or enter an')]")).sendKeys("522603");
		//xpath using And 
		driver.findElement(By.xpath("//input[@class='a-button-input' and @aria-labelledby='GLUXZipUpdate-announce']")).click();
		//xpath using or
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0' or @data-csa-c-id='zfyg4v-unxuh0-9d89r7-dsd341']")).click();
		//xpath using text()
		driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
		
	}
}
