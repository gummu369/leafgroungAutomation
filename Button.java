package com.leafeground.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Dialect;
import org.testng.annotations.Test;

public class Button {
	@Test
	public void testButton() throws InterruptedException
	{
		String chromePath=  "C://webdriver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();;
		Thread.sleep(2000);
		
		Point location=driver.findElement(By.id("position")).getLocation();
		System.out.println(location.getX());
		System.out.println("y path"+location.getY());
		Thread.sleep(2000);
		System.out.println("color of the button"+driver.findElement(By.id("color")).getAttribute("style"));
		Thread.sleep(2000);
		Dimension size=driver.findElement(By.id("size")).getSize();
		System.out.println("height: "+size.height);
		System.out.println("width:"+size.width);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
